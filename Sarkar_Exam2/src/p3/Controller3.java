package p3;

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

public class Controller3 {

	private BookStore bookStore = new BookStore();
	private int nElems;
	@FXML
	private TextField titleField;

	@FXML
	private TextField isbnField;

	@FXML
	private TextField priceField;

	@FXML
	private TextArea textArea;

	private String title;
	private String isbn;
	private double price;
	private Book book;

	@FXML
	void delete(ActionEvent event) {
		textArea.clear();
		isbn = isbnField.getText();
		book = bookStore.removeByIsbn(isbn);
		if (book != null) {
			textArea.appendText(book + "\n");
		} else {
			textArea.appendText("could not find the book. typy again");
			isbn = isbnField.getText();
		}
	}

	@FXML
	void insert(ActionEvent event) throws FileNotFoundException {
		textArea.clear();

		title = titleField.getText();
		isbn = isbnField.getText();
		price = (Double.parseDouble(priceField.getText()));
		Book b = new Book(title, isbn, price);
		bookStore.add(b);
		textArea.appendText(b.toString());
		isbnField.clear();
		titleField.clear();
		priceField.clear();
	}

	@FXML
	void search(ActionEvent event) {
		textArea.clear();
		isbn = isbnField.getText();
		book = bookStore.searchByIsbn(isbn);
		if (book != null) {
			titleField.setText(book.getTitles());
			isbnField.setText(book.getIsbn());
			priceField.setText(book.getPrice() + "");
			textArea.appendText(book + "");
		} else {
			textArea.appendText("could not find the book. typy again");
			isbn = isbnField.getText();
		}

	}
}
