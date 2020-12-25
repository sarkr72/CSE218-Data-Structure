package p1;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		TreeMap treeMap = new TreeMap();
		treeMap.insertBooks();

//		treeMap.choices();
		System.out.print("smallest: ");
		System.out.println(treeMap.getSmallestName());
		System.out.print("largest: ");
		System.out.println(treeMap.getLargestName());
	}
}
