package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import p2.BabyList;
import p2.ListIterator_baby;

public class StoreTheStory {

	public static LinkedList storeStory(LinkedList parentList) throws FileNotFoundException {
		File storyFile = new File("story");
		Scanner scanFile = new Scanner(storyFile);
		
		LinkedList linked = new LinkedList();
		LinkedList<String> babyList = null;
		
		String[] wordArray1 = new String[900000];
		int count = 0;
		while (scanFile.hasNextLine()) {
			if (scanFile.nextLine() == null) {
				continue;
			} else {
				String line = scanFile.nextLine();
				String str = line.replaceAll("\\p{Punct}", "").toLowerCase();
				String[] splitLine = str.split(" ");

				for (int i = 0; i < splitLine.length; i++) {
					wordArray1[count++] = splitLine[i];
					linked.add(splitLine[i]);
				}
			}
		}

		for (int i = 0; i < wordArray1.length - 1; i++) {
			while (!parentList.contains(wordArray1[i])) {
				parentList.add(wordArray1[i]);
//				System.out.println(wordArray1[i]);
			}}

			int repeat = 0;
			System.out.println(parentList.size());
			for (int j = 0; j < parentList.size(); j++) {
				babyList = new LinkedList<>();
				for (int k = j; k < parentList.size(); k++) {
					if (linked.contains(parentList.get(j))) {
						babyList.add(wordArray1[k]);
						repeat++;

					}else {
						break;
					}
					
					}
				System.out.println(j);
//				babyList.add(wordArray1[i] + ": count: " + repeat);
//				System.out.println(wordArray1[i]);
//				System.out.println("contunue");
//				final int l = repeat + 1;
//				System.out.println(repeat);
//				repeat = 0;
//				j += l;
//				
		}
//			System.out.println("done for");
//		String[] wordArray = new String[9000000];
//		while (scanFile.hasNextLine()) {
//			if (scanFile.nextLine() == null) {
//				continue;
//			} else {
//				String line = scanFile.nextLine();
//				String str = line.replaceAll("\\p{Punct}", "").toLowerCase();
//				String[] splitLine = str.split(" ");
//				for (int i = 0; i < splitLine.length; i++) {
//
//					if (myList.getIterator().getCurrent() == null) {
////						list.insertAfter(splitLine[i]);
//						linked.add(splitLine[i]);
//					} else {
//						while (!myList.getIterator().atEnd()) {
//							if (list.getCurrent().dData.contains(splitLine[i])) {
//								break;
//							} else {
//								list.insertAfter(splitLine[i]);
//							}
//						}
//					}
//				}
//				list.insertAfter("\n");
//			}
//		}
			return babyList;
	}

	}