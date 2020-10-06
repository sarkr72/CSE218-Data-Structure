package p3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		BabyList myList = new BabyList();
		ListIterator iter1 = myList.getIterator();
		StoreTheStory.storeStory(iter1);
		
//		BabyLink aLink = iter1.getCurrent();
//		System.out.println(iter1.deleteCurrent());
//		
//		PrintWriter pw = new PrintWriter("repeat in Link.txt");
//		while(!iter1.atEnd()) {
//			pw.print(iter1.getCurrent());
//		}
//		
//		pw.close();
		
		myList.displayList();
//		BabyLink aLink = iter1.getCurrent();
//		System.out.println(iter1.deleteCurrent());
//		
//		while(!iter1.atEnd()) {
//			if(iter1.getCurrent().equals(obj))
//			iter1.nextLink();
////			aLink = iter1.getCurrent();
//				iter1.getCurrent().display();;
//		}
System.out.println("done demo");
	}

}
