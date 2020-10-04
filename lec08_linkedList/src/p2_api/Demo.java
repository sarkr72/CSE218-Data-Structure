package p2_api;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		ListIterator iter1 = myList.listIterator();
		iter1.add(1);
		iter1.add(2);
		iter1.add(3);
		iter1.add(4);
		iter1.add(5);
//		System.out.println(iter1.remove(4));
		System.out.println(myList.toString());
	}
}