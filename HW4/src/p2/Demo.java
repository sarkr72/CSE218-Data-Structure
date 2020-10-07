package p2;

import java.io.FileNotFoundException;

import p1.ParentList;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Start");

		ParentList parentList = new ParentList();
		
		StoreTheStory.storeStory(parentList);

		System.out.println("done demo");
	}

}
