package p2;

import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		BabyList myList = new BabyList();
		ListIterator_baby iter1 = myList.getIterator();
		StoreTheStory.storeStory(iter1);
		myList.displayList();
	}

}
