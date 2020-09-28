package p2;

import java.util.Arrays;

import p1.Book;

public class BookBag {

	private Book[] books;
	private int nElems;

	public BookBag(int max) {
		books = new Book[max];
		nElems = 0;
	}

	public void insert(Book book) {
		books[nElems++] = book;
	}

	public Book sequentialSearchByISBN(Book book) {
		for (int i = 0; i < nElems; i++) {
			if (books[i].getIsbn().contentEquals(book.getIsbn())) {
				return books[i];
			}
		}
		return null;
	}

	public Book[] getBooksArray() {
		return books;
	}

	public Book[] sequintialSearchByLastName(String lastName) {
		Book[] books2 = new Book[nElems];
		int countBooks = 0;
		for (int i = 0; i < nElems; i++) {
			if (books[i].getAuthor().getLastName().contentEquals(lastName)) {
				books2[countBooks++] = books[i];
//				if (books2 != null && (i == nElems - 1)) {
//					return books2;
//				}
			}
		}
		Book[] books3 = Arrays.copyOf(books2, countBooks);
		return books3;
	}

	public Book binarySearchByISbn(Book book) {
		int low = 0;
		int high = nElems - 1;
//		int mid = 0;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (books[mid].getIsbn().compareTo(book.getIsbn()) > 0) {
				high = mid - 1;
			} else if (book.getIsbn().compareTo(books[mid].getIsbn()) == 0) {
				return books[mid];
			} else {
				low = mid + 1;
			}
		}
		return null;
	}

	public Book[] binarySearchByLastName(String lastName) {
		Book[] books2 = new Book[nElems];
		int high = nElems - 1;
		int low = 0;
		int countBooks = 0;
		while (high >= low) {
			int mid = (low + high) / 2;
			if ((books[mid].getAuthor().getLastName()).compareTo(lastName) == 0) {
				books2[countBooks++] = books[mid];
			}
			if ((books[mid].getAuthor().getLastName()).compareTo(lastName) > 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		Book[] foundBooks = Arrays.copyOf(books2, countBooks);
		return foundBooks;
	}

	public void bubbleSortByISBN() {
		int out;
		int in;
		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if (books[in].getIsbn().compareTo(books[in + 1].getIsbn()) > 0) {
					Book temp = books[in + 1];
					books[in + 1] = books[in];
					books[in] = temp;
//					swap(books[in], books[in+1]);
				}
			}
		}
	}

	public void bubbleSortByLastName() {
		int out;
		int in;

		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if (books[in].getAuthor().getLastName().compareTo(books[in + 1].getAuthor().getLastName()) > 0) {
//					swap(books[in], books[in+1]);
					Book temp = books[in];
					books[in] = books[in + 1];
					books[in + 1] = temp;
				}
			}
		}
	}

	private void swap(Book book, Book book2) {
		Book temp = book;
		book = book2;
		book2 = temp;
	}

	public Book deleteByIsbn(String isbn) {
		int i;
		int count;
		for (i = 0; i < nElems; i++) {
			if (books[i].getIsbn().contentEquals(isbn)) {
				break;
			}
		}
		Book temp = books[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				books[j] = books[j + 1];
			}
		}
		nElems--;
		return temp;

	}

	public Book[] deleteByLastName(String lastName) {
		int i;
		int[] indices = new int[nElems];
		int count = 0;
		for (i = 0; i < nElems; i++) {
			if (books[i].getAuthor().getLastName().contentEquals(lastName)) {
				indices[count++] = i;
			}
		}
		Book[] temp = new Book[count];
		for (int j = 0; j < count; j++) {
			temp[j] = books[indices[j]];
			System.out.println("indices" + indices[j]);
		}
		if (indices.length == 0) {
			System.out.println("indices length" + indices.length);
			return null;
		} else {
			for (int j = 0; j < count; j++) {
				for (int k = indices[j]; k < nElems - 1; k++) {
					books[k] = books[k + 1];
				}
				nElems--;
			}
			return temp;
		}
		
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(i+" "+books[i]);
		}
	}

}
