package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Utilities {

//	public static void main(String[] args) {
//		System.out.println(isPalindrome());
////		isPalindrome();
//	}
	
//	public static boolean isPalindrome() {
//		Stack stack = new Stack();
//		String string = "Nurses Run";
//		String string2 = string.replaceAll(" ", "");
//
//		for(int i = 0; i < string.length(); i++) {
//			stack.push(string.charAt(i));	
//		}
//		
//		String str = "";		
//		int i = 0;
//		while (i < string.length()) {
//			str += stack.pop();
//			i++;
//		}
//		str = str.replaceAll(" ", "");
//		if (string2.equalsIgnoreCase(str)) {
//			return true;
//		} else {
//			return false;
//	}
//	}
	
	public static void getBooks1(BookBag bag, int nElms) throws FileNotFoundException {
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

		while(nElms>0) {
		int i = 0;
//		while (i < 10) {
			titleScan.nextLine();
			isbnScan.nextLine();
			String author = emitAuthor("files/First Names.txt", "files/Last Names.txt");
			bag.insert(new Book(titleAndIsbn[titleCounter++][0], author, titleAndIsbn[0][isbnCounter++], emitPrice()));
//			i++;
			nElms--;
		}
	}
	public static void getBooks(PriorityQueue bag) throws FileNotFoundException {
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

		while(fNameScan.hasNextLine() && titleScan.hasNextLine() && isbnScan.hasNextLine()) {
		int i = 0;
//		while (i < 10) {
			titleScan.nextLine();
			isbnScan.nextLine();
			String author = emitAuthor("files/First Names.txt", "files/Last Names.txt");
			bag.insert(new Book(titleAndIsbn[titleCounter++][0],  author,titleAndIsbn[0][isbnCounter++], emitPrice()));
//			i++;
		}
	}

	public static String emitAuthor(String fNameFiles, String lNameFiles) throws FileNotFoundException {
		File fNameFile = new File(fNameFiles);
		File lNameFile = new File(lNameFiles);
		Scanner fName = new Scanner(fNameFile);
		Scanner lName = new Scanner(lNameFile);

		String firstName = "";
		String lastName = "";

		String[] allAuthors = new String[100000];
		int count = 0;
		while(fName.hasNextLine()) {
//		int i = 0;
//		while (i < 10) {
			firstName = fName.nextLine();
//			lastName = lName.nextLine();
			allAuthors[count++] = new String(firstName);
//			i++;
		}
		return getRandomAuthor(allAuthors);
	}

	public static String getRandomAuthor(String[] names) {
		int rand = (int) (Math.random() * 2000);
		String author = names[rand];
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

		while(titleScan.hasNextLine() && isbnScan.hasNextLine()) {
//		int i = 0;
//		while (i < 10) {
			titleAndIsbn[titleCounter++][0] = titleScan.nextLine();
			titleAndIsbn[0][isbnCounter++] = isbnScan.nextLine();
//			i++;

		}
		return titleAndIsbn;
	}

	public static double emitPrice() {
		double rand = (double) (Math.random() * 100);
		String n = String.format("%10.2f", rand);
		double number = Double.parseDouble(n);
		return number;
	}
}
