package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TreeMap {

	private Tree theTree = new Tree();

	public void insertBooks() throws IOException {
		int i = 0;
		String[] names = emitAuthor("files/FirstNames.txt", "files/LastNames.txt");
		while (i < 100) {
			String name = getRandomAuthor(names);
			int key = name.length();
			theTree.insert(key, name);
			i++;
		}
	}

	public static String[] emitAuthor(String fNameFiles, String lNameFiles) {
		String[] allAuthors = null;
		int count = 0;
		try {
			FileReader fNameFile = new FileReader(fNameFiles);
			FileReader lNameFile = new FileReader(lNameFiles);
			BufferedReader fName = new BufferedReader(fNameFile);
			BufferedReader lName = new BufferedReader(lNameFile);

			String firstName = "";
			String lastName = "";

			allAuthors = new String[2000];

			while (count < 2000) {
				firstName = fName.readLine();
				lastName = lName.readLine();
				allAuthors[count++] = firstName + " " + lastName;
			}
			fName.close();
			lName.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.copyOf(allAuthors, count);
	}

	public static String getRandomAuthor(String[] names) {
		int rand = (int) (Math.random() * names.length);
		String author = names[rand];
		return author;
	}

	public void choices() throws IOException {
		int value;
		while (true) {
			System.out.print("Enter first letter of show, ");
			System.out.print("insert, find, delete, or traverse: i/f/d/t and e to exit");
			int choice = getChar();
			switch (choice) {
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value, getString());
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
				if (found != null) {
					System.out.print("found: ");
					found.displayNode();
					System.out.println("\n");
				} else {
					System.out.print("Could not find ");
					System.out.print(value + '\n');
				}
				break;
			case 'd':
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if (didDelete) {
					System.out.print("Deleted " + value + "\n");
				} else {
					System.out.print("Could not delete ");
					System.out.print(value + '\n');
				}
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				value = getInt();
				theTree.traverse(value);
				break;
			case 'e':
				System.exit(0);
			default:
				System.out.print("Invalid entry.\n");
			} // end switch
		} // end while
	} // end main()

//	public Book inputBook() throws IOException {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("enter title: ");
//		String title = br.readLine();
//		System.out.println("enter isbn: ");
//		String isbn = br.readLine();
//		System.out.println("enter first name: ");
//		String fName = br.readLine();
//		System.out.println("enter last name: ");
//		String lName = br.readLine();
//		System.out.println("enter the price: ");
//		double price = Double.parseDouble(br.readLine());
//		return new Book(title, isbn, new Author(fName, lName), price);
//	}
	public String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	public String getSmallestName() {
		return theTree.minimum().dData;
	}

	public String getLargestName() {
		return theTree.maximum().dData;
	}

}