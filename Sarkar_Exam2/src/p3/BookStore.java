package p3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BookStore {

	private TreeMap<String, Book> treeMap;
	private int nElems;

	public BookStore() {
		treeMap = new TreeMap<>();
		nElems = 0;
	}

	public int getNElems() {
		return nElems;
	}

	public void add(Book book) {
		treeMap.put(book.getIsbn(), book);
		nElems++;
	}

	public Book searchByIsbn(String isbn) {
		Book book = treeMap.get(isbn);
		return book;
	}

	public Book removeByIsbn(String isbn) {
		Book book = treeMap.get(isbn);
		treeMap.remove(isbn);
		return book;
	}

	public void display() {
//		System.out.println(treeMap);
		treeMap.descendingKeySet();
	}


}
