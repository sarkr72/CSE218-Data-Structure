package p1;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import p2.BabyList;
import p2.ListIterator_baby;


public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
//		ParentList myList = new ParentList();
//		ListIterator iter1 = myList.getIterator();
		LinkedList<ParentLink> parentList = new LinkedList<>();
		
//		BabyList babyList = new BabyList();
//		ListIterator_baby iter2 = babyList.getIterator();
//		LinkedList<String> babyList = new LinkedList<>();
		LinkedList babyList = StoreTheStory.storeStory(parentList);
//		
//		ParentLink aLink = iter1.getCurrent();
//		System.out.println(iter1.deleteCurrent());
//		
//		while(!iter1.atEnd()) {
//			iter1.nextLink();
//			aLink = iter1.getCurrent();
//				System.out.println(iter1.deleteCurrent());
//		}
//		while(parentList.contains(o))
//		babyList.displayList();
		System.out.println(babyList);
//		System.out.println(parentList);
		System.out.println("done demo");
	}
}
