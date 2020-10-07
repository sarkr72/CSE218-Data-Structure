package p1;

import java.io.FileNotFoundException;


public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Start");

		ParentList parentList = new ParentList();
		
		StoreTheStory.storeStory(parentList);

		System.out.println("done demo");
	}
}
