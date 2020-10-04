package p4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;

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
		ListIterator iter1 = list.getIterator();
		Utilities.getBooks2(iter1, 1000);
		
		Link aLink = iter1.getCurrent();
			System.out.println(iter1.deleteCurrent()); // ***have to call this to delete all later***
		
			while(!iter1.atEnd()) {
				iter1.nextLink();
				aLink = iter1.getCurrent();
//				if(aLink.dData%3 == 0) {
					System.out.println(iter1.find());
//				}
			}
			
//		while(!iter1.atEnd()) {
//			iter1.nextLink();
//			aLink = iter1.getCurrent();
//				System.out.println(iter1.deleteCurrent());
//		}
		System.out.println("finished");
		
		long linkTime = System.currentTimeMillis() - start2;
		
//		String str = "Array time: " + arrayTime + "   linkTime: " + linkTime;
//		PrintWriter pw = new PrintWriter("readMe.txt");
//		pw.print(str);
//		pw.close();
//		list.display();
	}

}
