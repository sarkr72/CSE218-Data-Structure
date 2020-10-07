package p4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import p1.ParentLink;
import p1.ParentList;
import p2.BabyLink;

public class StoreTheStory {

	public static void storeStory(ParentList parentList) throws FileNotFoundException {
		File storyFile = new File("story");
		Scanner scanFile = new Scanner(storyFile);

		LinkedList<String> strList = new LinkedList<>();
//		while (scanFile.hasNextLine()) {
		for (int i = 0; i < 100; i++) {
			String currentLine = scanFile.nextLine().replaceAll("\\p{Punct}", "").toLowerCase();
			String[] words = currentLine.split(" ");
			for (String word : words) {
				strList.add(word);
			}
		}
		scanFile.close();

		LinkedList<String> uniqueWords = new LinkedList<>();
		Iterator<String> iterator = strList.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}
		System.out.println("Found unique words");
		iterator = uniqueWords.iterator();
		while (iterator.hasNext()) {
			parentList.get().add(new ParentLink(iterator.next()));
		}
		System.out.println("Added unique words");
		iterator = strList.iterator();
		Iterator<ParentLink> parentIterator = parentList.get().iterator();

		while (parentIterator.hasNext()) {
			ParentLink currentParentLink = parentIterator.next();
			for (int i = 0; i < strList.size(); i++) {
//			for (int i = 0; i < 1000; i++) {
				String currentWord = strList.get(i);
				if (currentParentLink.getdData().equals(currentWord)) {
					if (i < strList.size() - 1) {
//					if (i < 1000) {
//						String nextWord = strList.get(i + 1);
						String nextWord = strList.get(i);
						currentParentLink.babyList.get().add(new BabyLink(nextWord));
					}
				}
			}
//			System.out.println("Filled a baby list");
		}

//		parentList.get().get(1).getBabyList().size();

		parentIterator = parentList.get().iterator();
		while (parentIterator.hasNext()) {
			ParentLink link = parentIterator.next();
//			link.display();
			link.babyList.display();
			System.out.println("size is:" + link.babyList.size());
		}
}}