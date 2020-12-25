package p3_model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BookStore {

	private TreeSet<Book> treeSet;
	private int nElems;

	public BookStore() {
		treeSet = new TreeSet<>();
		nElems = 0;
	}

	public int getNElems() {
		return nElems;
	}

	public void insert(Book book) {
		treeSet.add(book);
		nElems++;
	}

	public Book[] search(String isbn) {
//		Iterator<Book> iterator = treeSet.iterator();
		Book[] foundBooks = new Book[100];
		Set<Book> set = treeSet.stream().filter(e->e.compareTo(new Book("123"))==0).collect(Collectors.toSet());
		int count = 0;
		for(Book b: treeSet) {
			if(b.getIsbn().compareTo(isbn) == 0) {
				foundBooks[count++] = b;
			}
		}
		return Arrays.copyOf(foundBooks, count);
	}

	public Book[] deleteByIsbn(String isbn) {
		Book[] deletedBooks = new Book[100];
		int count = 0;
		for(Book b: treeSet) {
			if(b.getIsbn().compareTo(isbn) == 0) {
				deletedBooks[count++] = b;
				treeSet.remove(b);
			}
		}
		return Arrays.copyOf(deletedBooks, count);
	}
	
//	public Book sequentialSearchByISBN(Book book) {
//		for (int i = 0; i < nElems; i++) {
//			if (books[i].getIsbn().contentEquals(book.getIsbn())) {
//				return books[i];
//			}
//		}
//		return null;
//	}

//	public Book binarySearchByISbn(Book book) {
//		int low = 0;
//		int high = nElems - 1;
////		int mid = 0;
//
//		while (high >= low) {
//			int mid = (low + high) / 2;
//			if (books[mid].getIsbn().compareTo(book.getIsbn()) > 0) {
//				high = mid - 1;
//			} else if (book.getIsbn().compareTo(books[mid].getIsbn()) == 0) {
//				return books[mid];
//			} else {
//				low = mid + 1;
//			}
//		}
//		return null;
//	}

//	public void bubbleSortByISBN() {
//		int out;
//		int in;
//		for (out = nElems - 1; out >= 1; out--) {
//			for (in = 0; in < out; in++) {
//				if (books[in].getIsbn().compareTo(books[in + 1].getIsbn()) > 0) {
//					Book temp = books[in + 1];
//					books[in + 1] = books[in];
//					books[in] = temp;
////					swap(books[in], books[in+1]);
//				}
//			}
//		}
//	}
//
//
//	private void swap(Book book, Book book2) {
//		Book temp = book;
//		book = book2;
//		book2 = temp;
//	}

	

//	public Book[] deleteByLastName(String lastName) {
//		int count = 0;
//
//		Book[] indices = new Book[nElems];
//
//		for (int i = 0; i < nElems - 1; i++) {
//			if (books[i].getAuthor().getLastName().compareTo(lastName) == 0) {
//				indices[count++] = books[i];
//				for (int j = i; j < nElems - 1; j++) {
//					books[j] = books[j + 1];
//				}
//			} else {
//				continue;
//			}
//			nElems--;
//		}
//
//		Book[] deletedBooks = Arrays.copyOf(indices, count);
//		return deletedBooks;
//		int i;
//		int[] indices = new int[nElems];
//		int count = 0;
//		for (i = 0; i < nElems; i++) {
//			if (books[i].getAuthor().getLastName().contentEquals(lastName)) {
//				indices[count++] = i;
//			}
//		}
//		Book[] temp = new Book[count];
//		for (int j = 0; j < count; j++) {
//			temp[j] = books[indices[j]];
//			System.out.println("indices" + indices[j]);
//		}
//		if (indices.length == 0) {
//			System.out.println("indices length" + indices.length);
//			return null;
//		} else {
//			for (int j = 0; j < count; j++) {
//				for (int k = indices[j]; k < nElems - 1; k++) {
//					books[k] = books[k + 1];
//				}
//				nElems--;
//			}
//			return temp;
//	}

//	public void selectionSort() {
//		// n^2 n*(n-1)
//		// for almost sorted n
//		int out;
//		int in;
//		int min;
//		for (out = 0; out < nElems - 1; out++) {
//			min = out;
//			for (in = out + 1; in < nElems; in++) {
//				if (books[in].getIsbn().compareTo(books[min].getIsbn()) < 0) {
//					min = in;
//				}
//			}
////					swap(out, min);
//			Book temp = books[min];
//			books[min] = books[out];
//			books[out] = temp;
//		}
//	}
//
//	public void insertionSort() {// (n*n/2) big o is n^2, if sorted or almost big o is n; n+2n
//									// most efficient because it does not swap like other sorts. it makes 2 copies
//									// instead.
//		int in;
//		int out;
//		for (out = 1; out < nElems; out++) {
//			Book temp = books[out];
//			in = out;
//			while (in > 0 && books[in - 1].getIsbn().compareTo(temp.getIsbn()) >= 0) {
//				books[in] = books[in - 1];
//				in--;
//			}
//			books[in] = temp;
//		}
//	}

	public void display() {
		for (Book b : treeSet) {
			System.out.println(b);
		}
	}

//	public BookStore shallowCopy(int nElems) {
//		BookStore copy = new BookStore(nElems);
//		for (int i = 0; i < nElems; i++) {
//			copy.insert(books[i]);
//		}
//		return copy;
//	}

}
