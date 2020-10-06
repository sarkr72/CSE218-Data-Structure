package p1_new;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Story {

	public static void main(String[] args) throws FileNotFoundException {
	LinkedList list = new LinkedList();
	
	
	File storyFile = new File("story");
	Scanner scanFile = new Scanner(storyFile);
//int count = 0;
	String[] wordArray = new String[900000];
	int count = 0;
	while (scanFile.hasNextLine()) {
		if (scanFile.nextLine() == null) {
			continue;
		}else {
		String line = scanFile.nextLine();
		 String str = line.replaceAll("\\p{Punct}","").toLowerCase();
			String[] splitLine = str.split(" ");
			
			for (int i = 0; i < splitLine.length; i++) {
				wordArray[count++] = splitLine[i];
			}
			list.add("\n");
		}
	}
	String[] arr = Arrays.copyOf(wordArray, count);
	for(String n: arr) {
		System.out.println(n);
	}
//	Iterator iter1 = list.iterator();
//	while(iter1.hasNext()) {
//	System.out.print(iter1.next());
//	}
}
}
