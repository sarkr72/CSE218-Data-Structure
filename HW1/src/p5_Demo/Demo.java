package p5_Demo;

import java.io.FileNotFoundException;

import p1.Book;
import p2.BookBag;
import p3.Utilities;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {

		BookBag bag = new BookBag(1000);
		Utilities.getBooks(bag);
		bag.display();
		
		System.out.println("sequiential Search by isbn: \n");
		
		System.out.println(bag.sequentialSearchByISBN(bag.getBooksArray()[1]));
		
		try {
			Book[] sequentialbooks1 = bag.sequintialSearchByLastName("Hudson");
			for(Book b: sequentialbooks1) {
				System.out.println("sequiential search by last namae" + b);
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
			
		System.out.println("bubble sort:");
		bag.bubbleSortByISBN();
		System.out.println("after bubble sort:");
		bag.display();
		
		System.out.println("binary search by isbn: \n");
		Book binaryIsbn = bag.binarySearchByISbn(bag.getBooksArray()[1]);
		System.out.println(binaryIsbn);
		
		Book[] binaryBooks = bag.binarySearchByLastName("Silva");
		for(Book b: binaryBooks) {
			System.out.println("binary search by last name \n" + b);
		}
		
		bag.bubbleSortByISBN();
		System.out.println("after bubble sort by isbn:");
		bag.display();
		
		bag.bubbleSortByLastName();
		System.out.println("after sorted by last name");
		bag.display();
		
		System.out.println("detele by isbn" + bag.deleteByIsbn("978-0-12-813166-4") + "\n after delete by isbn");
		bag.display();
		
		Book[] delete = bag.deleteByLastName("Hudson");
		for(Book n: delete) {
			System.out.println("delete by last name: \n " + n);
		}
		System.out.println("afte delete by last name");
		bag.display();
		
	}

}
