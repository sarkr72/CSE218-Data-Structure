package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class StoreTheStory {

	public static void storeStory(ListIterator_baby list) throws FileNotFoundException {
		File storyFile = new File("story");
		Scanner scanFile = new Scanner(storyFile);

//		String str = "";
		String[] wordArray = new String[9000000];
		int count = 0;
		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			if (line.isEmpty()) {
				continue;
			}else {
//			String line = scanFile.nextLine();
//			 String str = line.replaceAll("\\p{Punct}","").toLowerCase();
				String[] splitLine = line.split(" ");
				
				for (int i = 0; i < splitLine.length; i++) {
//					wordArray[count++] = splitLine[i];
					list.insertAfter(splitLine[i]);
				}
			 list.insertAfter("\n");
			}
//		System.out.println("done for");
	}

//	public static String[] insertionSort(String[] arr, ListIterator list) throws FileNotFoundException {
//		int in;
//		int out;
//		for (out = 1; out < arr.length; out++) {
//			String temp = arr[out];
//			in = out;
//			while (in > 0 && arr[in - 1].compareTo(temp) >= 0) {
//				arr[in] = arr[in - 1];
//				in--;
//			}
//			arr[in] = temp;
//		}
//		for(String n: arr) {
//			System.out.println( n+" ");
//		}
		 
//		int wordCounter = 1;
//		for(int i = 0; i < arr.length-1; i++) {
//			if(arr[i].compareToIgnoreCase(arr[++i]) == 0) {
//				wordCounter++;
//			}else {
//				list.insertAfter(arr[i-1] + ": occurences: "+ wordCounter);
//			wordCounter = 0;
//			continue;
//			}
//		}
//		String str = "";
//		for(int i = 0; i < arr.length; i++) {
//			str += arr[i];
//		}
		
//		System.out.println("time table in Milisecond is: \n" + str);
//		PrintWriter pw = new PrintWriter("repeat.txt");
//		pw.print(str);
//		pw.close();
//		return arr;
//	}
//
//	public static int binarySearchName(String[] books, String name, ListIterator list) {// logn
//		String[] books2 = new String[books.length];
//		int repeat = 0;
//		int high = books.length - 1;
//		int low = 0;
//		int countBooks = 0;
//		while (high >= low) {
//			int mid = (low + high) / 2;
//			if ((books[mid]).compareTo(name) == 0) {
//				books2[countBooks++] = books[mid];
//				countBooks++;
//			}
//			if ((books[mid]).compareTo(name) > 0) {
//				high = mid - 1;
//			} else {
//				low = mid + 1;
//			}
//		}
//		if(countBooks > 0) {
//			String str = name + " occurences: " +countBooks;
//			list.insertAfter(str);
//		}
//		String[] foundBooks = Arrays.copyOf(books2, countBooks);
//		return countBooks;
//	}
}}