package p4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
//		long start1 = System.currentTimeMillis();
//		BookBag bag = new BookBag(5000000);
//		Utilities.getBooks1(bag, 1000);
//		
//		bag.display();
//		
//		Book[] findBooks = bag.sequintialSearchByIsbn();
//		for(Book b: findBooks) {
//			System.out.print("find  ");
//			System.out.println(b);
//		}
//		
//		Book[] deleteBooks = bag.deleteByIsbn();
//		for(Book b: deleteBooks) {
//			System.out.print("delete  ");
//			System.out.println(b);
//		}
//		
//		long arrayTime = System.currentTimeMillis() - start1;
////		System.out.println(bag.getBooksArray()[1]);
////		bag.display();
		
		long start2 = System.currentTimeMillis();
		LinkList list = new LinkList();
		Utilities.getBooks2(list, 1000);
		
//		list.display();
		
		list.find();
//		for(int i = 0; i < 1000; i++) {
//			System.out.print("delete  ");
//			list.delete().display();
//		}
		long linkTime = System.currentTimeMillis() - start2;
		
//		String str = "Array time: " + arrayTime + "   linkTime: " + linkTime;
//		PrintWriter pw = new PrintWriter("readMe.txt");
//		pw.print(str);
//		pw.close();
//		list.display();
	}

}
