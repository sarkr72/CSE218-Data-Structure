package p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class StoreTheStory {
	private static int countBooks = 0;

	public static void storeStory(ListIterator list) throws FileNotFoundException {
		File storyFile = new File("story");
		Scanner scanFile = new Scanner(storyFile);
		String[] wordArray = new String[9000000];
		int count = 0;
		while (scanFile.hasNextLine()) {
			if (scanFile.nextLine().isEmpty()) {
				continue;
			} else {
				String line = scanFile.nextLine();
				String str = line.replaceAll("\\p{Punct}", "").toLowerCase();
				String[] splitLine = str.split(" ");

				for (int i = 0; i < splitLine.length; i++) {
					wordArray[count++] = splitLine[i];
				}
			}

		}
//		System.out.println("done while");
		int repeat = 0;
		
		String[] newArr = Arrays.copyOf(wordArray, count);
		for(int i = 0; i < newArr.length; i++) {
			for(int j = i; j < newArr.length; j++) {
				if(newArr[i].compareToIgnoreCase(newArr[j]) == 0) {
					
					repeat++;
				}
				
			}
			list.insertAfter(newArr[i] + ": count: " + repeat);
			final int l = repeat+1;
			repeat = 0;
			i += l;
//			System.out.println(l);
		}
//		insertionSort(newArr, list);

//		System.out.println("done for");
	}

//	public static String[] insertionSort(String[] arr, ListIterator list) throws FileNotFoundException {
//
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
////		for(String n: arr) {
////			System.out.println(n);
//		int count = 0;
//		String[] repeatedWords = new String[100000];
//		for (int i = 0; i < arr.length; i++) {
//			String[] foundBooks = binarySearchName(arr, arr[i], list);
//			for (int j = 0; j < foundBooks.length; j++) {
//				repeatedWords[count++] = foundBooks[j];
//				System.out.println(foundBooks[j]);
//			}
//		}
//
////		String str = "";
////		for(int i = 0; i < arr.length; i++) {
////			str += arr[i];
////		}
////		PrintWriter pw = new PrintWriter("repeat.txt");
////		pw.print(str);
////		pw.close();
//		return arr;
//	}

//	public static String[] binarySearchName(String[] books, String name, ListIterator list) {// logn
//
//		String[] books2 = new String[10000000];
//		int repeat = 0;
//		int high = books.length - 1;
//		int low = 0;
//
//		while (high >= low) {
//			int mid = (low + high) / 2;
//			if ((books[mid]).compareTo(name) == 0) {
//				books2[repeat++] = books[mid];
//				list.insertAfter(books[mid]);
//			}
//			if ((books[mid]).compareTo(name) > 0) {
//				high = mid - 1;
//			} else {
//				low = mid + 1;
//			}
//		}
////		if(countBooks > 0) {
////			String str = name + " occurences: " +countBooks;
////			list.insertAfter(str);
////		}
//		String[] foundBooks = Arrays.copyOf(books2, repeat);
////		System.out.println(countBooks);
//		return foundBooks;
//	}
}