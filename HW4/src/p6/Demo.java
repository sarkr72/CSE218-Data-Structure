package p6;

import java.io.FileNotFoundException;

import p1.ListIterator;
import p1.ParentList;
import p1.StoreTheStory;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ParentList myList = new ParentList();
		ListIterator iter1 = myList.getIterator();
		StoreTheStory.storeStory(iter1, myList);
		
		BabyList myList2 = new BabyList();
		ListIterator_baby iter2 = myList2.getIterator();
		
		StoreTheStory.storeStory(iter1);
	}

}
