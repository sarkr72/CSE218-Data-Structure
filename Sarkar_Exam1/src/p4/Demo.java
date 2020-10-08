package p4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		ParentList parentList = new ParentList();

		StoreTheStory.storeStory(parentList);

		System.out.println("done demo");
	}

}
