package p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import p1.Author;
import p1.Book;
import p2.BookBag;

public class Utilities {

	public static void getBooks(BookBag bag) throws FileNotFoundException {
		File fNameFile = new File("files/First Names.txt");
		File lNameFile = new File("files/Last Names.txt");
		File titleFile = new File("files/textbook_titles.txt");
		File isbnFile = new File("files/textbook_isbns.txt");

		Scanner fNameScan = new Scanner(fNameFile);
		Scanner lNameScan = new Scanner(lNameFile);
		Scanner titleScan = new Scanner(titleFile);
		Scanner isbnScan = new Scanner(isbnFile);

		String[][] titleAndIsbn = emitTitleAndIsbn("files/textbook_titles.txt", "files/textbook_isbns.txt");
		int titleCounter = 1;
		int isbnCounter = 0;

//		while(fNameScan.hasNextLine() && lNameScan.hasNextLine()&& titleScan.hasNextLine() && isbnScan.hasNextLine()) {
		int i = 0;
		while (i < 10) {
			fNameScan.nextLine();
			lNameScan.nextLine();
			titleScan.nextLine();
			isbnScan.nextLine();
			Author author = emitAuthor("files/First Names.txt", "files/Last Names.txt");
			bag.insert(new Book(titleAndIsbn[titleCounter++][0], titleAndIsbn[0][isbnCounter++], author, emitPrice()));
			i++;
		}
	}

	public static Author emitAuthor(String fNameFiles, String lNameFiles) throws FileNotFoundException {
		File fNameFile = new File(fNameFiles);
		File lNameFile = new File(lNameFiles);
		Scanner fName = new Scanner(fNameFile);
		Scanner lName = new Scanner(lNameFile);

		String firstName = "";
		String lastName = "";

		Author[] allAuthors = new Author[100000];
		int count = 0;
//		while(fName.hasNextLine() && lName.hasNextLine()) {
		int i = 0;
		while (i < 10) {
			firstName = fName.nextLine();
			lastName = lName.nextLine();
			allAuthors[count++] = new Author(firstName, lastName);
			i++;
		}
		return getRandomAuthor(allAuthors);
	}

	public static Author getRandomAuthor(Author[] names) {
		int rand = (int) (Math.random() * 8);
		Author author = names[rand];
		return author;
	}

	public static String[][] emitTitleAndIsbn(String titleFileName, String isbnFileName) throws FileNotFoundException {
		File titleFile = new File(titleFileName);
		File isbnFile = new File(isbnFileName);
		Scanner titleScan = new Scanner(titleFile);
		Scanner isbnScan = new Scanner(isbnFile);

		String[][] titleAndIsbn = new String[10000][10000];
		int titleCounter = 1;
		int isbnCounter = 0;

//		while(titleScan.hasNextLine() && isbnScan.hasNextLine()) {
		int i = 0;
		while (i < 10) {
			titleAndIsbn[titleCounter++][0] = titleScan.nextLine();
			titleAndIsbn[0][isbnCounter++] = isbnScan.nextLine();
			i++;

		}
		return titleAndIsbn;
	}

	public static double emitPrice() {
		double rand = (double) (Math.random() * 10);
		return rand;
	}
}
