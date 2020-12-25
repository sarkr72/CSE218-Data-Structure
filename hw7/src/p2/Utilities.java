package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import p1.Author;
import p1.Book;
import p1.BookBag;

public class Utilities {

	private static Book[] bkArr = makeBooks();

	public static BookBag<Book> getBooks(int nElems) throws IOException {
		BookBag<Book> bag = new BookBag<Book>(nElems);
		int i = 0;
		while (i < nElems) {
			int rand = (int) (Math.random() * bkArr.length);
			bag.insertT(bkArr[rand]);
			i++;
		}
		return bag;
	}

	public static Book[] makeBooks() {
		int i = 0;
		String[][] titleAndIsbn = emitTitleAndIsbn("files/textbook_titles.txt", "files/textbook_isbns.txt", 36000);
		Author []author = emitAuthor("files/First Names.txt", "files/Last Names.txt");
		Book[] bookArr = new Book[titleAndIsbn.length];
		
		while (i < titleAndIsbn.length) {
			bookArr[i] = new Book(titleAndIsbn[i][0], titleAndIsbn[i][1], getRandomAuthor(author), emitPrice()); // bag.getArray()[(int)																				// (Math.random()*nElems)
			i++;
		}
		return bookArr;
	}

	private static Author[] emitAuthor(String fNameFiles, String lNameFiles) {
		Author[] allAuthors = null;
		try {
			FileReader fNameFile = new FileReader(fNameFiles);
			FileReader lNameFile = new FileReader(lNameFiles);
			BufferedReader fName = new BufferedReader(fNameFile);
			BufferedReader lName = new BufferedReader(lNameFile);

			String firstName = "";
			String lastName = "";

			allAuthors = new Author[2000];
			int count = 0;

			while (count < 2000) {
				firstName = fName.readLine();
				lastName = lName.readLine();
				allAuthors[count++] = new Author(firstName, lastName);
			}
			fName.close();
			lName.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allAuthors;//getRandomAuthor(allAuthors);
	}

	public static Author getRandomAuthor(Author[] names) {
		int rand = (int) (Math.random() * names.length);
		Author author = names[rand];
		return author;
	}

	public static String[][] emitTitleAndIsbn(String titleFileName, String isbnFileName, int nElems) {
		String[] titles = new String[nElems];
		String[] isbns = new String[nElems];
		String[][] titleAndIsbn = new String[nElems][2];
		try {
			FileReader titleFile = new FileReader(titleFileName);
			FileReader isbnFile = new FileReader(isbnFileName);
			BufferedReader bf1 = new BufferedReader(titleFile);
			BufferedReader bf2 = new BufferedReader(isbnFile);

			int i = 0;
			while (i < nElems) {
				titles[i] = bf1.readLine();
				isbns[i] = bf2.readLine();
				i++;
			}
			bf1.close();
			bf2.close();

			for (int j = 0; j < nElems; j++) {
				for (int k = 0; k < 2; k++) {
					if (k == 0) {
						titleAndIsbn[j][k] = titles[j];
					} else if (k == 1) {
						titleAndIsbn[j][k] = isbns[j];
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		while(i < nElems) {
////			titleAndIsbn[titleCounter++][0] = titleScan.nextLine();
//			titleAndIsbn[0][isbnCounter++] = isbnScan.nextLine();
//		}

		return titleAndIsbn;
	}
//	public static BookBag<Book> shallowCopy(BookBag<Book> bag){
//		BookBag<Book> copy = new BookBag<Book>(bag.size());
//		for(int i = 0; i < bag.size(); i++) {
//			copy = bag[i];
//		}
//	}

	public static double emitPrice() {
		double rand = (double) (Math.random() * 100);
		return rand;
	}
}
