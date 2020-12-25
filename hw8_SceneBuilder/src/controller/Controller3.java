package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import p3_app.Main3;
import p3_model.Author;
import p3_model.Book;
import p3_model.BookStore;

public class Controller3 implements Initializable {

	private BookStore bookStore;
	private int nElems;
	@FXML
	private TextField titleField;

	@FXML
	private TextField isbnField;

	@FXML
	private TextArea authorField;

	@FXML
	private TextField priceField;

	@FXML
	private TextArea textArea;

	private String firstName;
	private String lastName;
	private Author author;
	private String title;
	private String isbn;
	private double price;
	private Book[] books;

	@FXML
	void delete(ActionEvent event) {
		textArea.clear();
		isbn = isbnField.getText();
		books = bookStore.deleteByIsbn(isbn);
    	if(books != null) {
		for(Book book: books) {
			textArea.appendText(book + "\n");
		}
    	}else {
    		textArea.appendText("could not find the book. typy again");
    		isbn = isbnField.getText();
    	}
	}

	@FXML
	void insert(ActionEvent event) throws FileNotFoundException {
		textArea.clear();
		String[] name = authorField.getText().split("\n");
		firstName = name[0];
		lastName = name[1];
		author = new Author(firstName, lastName);
		title = titleField.getText();
		isbn = isbnField.getText();
		price = (Double.parseDouble(priceField.getText()));
		bookStore.insert(new Book(title, isbn, author, price));

		authorField.clear();
		isbnField.clear();
		titleField.clear();
		priceField.clear();
	}

	@FXML
	void search(ActionEvent event) {
		textArea.clear();
		isbn = isbnField.getText();
		books = bookStore.search(isbn);
		if (books != null) {
			for(Book book: books) {
			titleField.setText(book.getTitles());
			isbnField.setText(book.getIsbn());
			authorField.setText(book.getAuthor().getFirstName());
			authorField.setText(book.getAuthor().getLastName());
			priceField.setText(book.getPrice() + "");
			textArea.appendText(book + "");
			}
		} else {
			textArea.appendText("could not find the book. typy again");
			isbn = isbnField.getText();
		}

	}

	@FXML
	void update(ActionEvent event) throws FileNotFoundException {
		textArea.clear();
		isbn = isbnField.getText();
		books = bookStore.search(isbn);
		if (books != null) {
			for(Book book : books) {
			String[] name = authorField.getText().split("\n");
			firstName = name[0];
			lastName = name[1];
			book.setAuthor(new Author(firstName, lastName));
			book.setTitles(titleField.getText());
			book.setIsbn(isbnField.getText());
			book.setPrice((Double.parseDouble(priceField.getText())));
		} }else {
			textArea.appendText("book was not found. type again");
			isbn = isbnField.getText();
		}
		authorField.clear();
		isbnField.clear();
		titleField.clear();
		priceField.clear();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		bookStore = Main3.getBookStore();
//		nElems
	}
}
