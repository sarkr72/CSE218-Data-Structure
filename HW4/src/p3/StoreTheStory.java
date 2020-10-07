package p3;

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
					// then you want to get the word that comes after it
					// and add it to the baby list of the current parent link
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
			link.display();
//			link.babyList.display();
		}
//		LinkedList<String> linked = new LinkedList<>();
//		LinkedList<String> babyList = new LinkedList<>();
//
//		String[] wordArray1 = new String[900000];
//		int count = 0;
//		
//		while (scanFile.hasNextLine()) {
//			if (scanFile.nextLine() == null) {
//				continue;
//			} else {
//				String line = scanFile.nextLine();
//				String str = line.replaceAll("\\p{Punct}", "").toLowerCase();
//				String[] splitLine = str.split(" ");
//
//				for (int i = 0; i < splitLine.length; i++) {
//					wordArray1[count++] = splitLine[i];
//					linked.add(splitLine[i]);
//				}
//			}
//		}
//		System.out.println(linked.size());
//		
//		for (int i = 0; i < wordArray1.length - 1; i++) {
//			while (!parentList.contains(wordArray1[i])) {
//				parentList.add(wordArray1[i]);
////				System.out.println(wordArray1[i]);
//			}
//		}
//
//		//sort
////		for(int i = 0; i < linked.size(); i++) {
////			linked.sort(linked.get(i));
////		}
//		int repeat = 0;
//		for (int k = 0; k < parentList.size(); k++) {
//			if (linked.contains(parentList.get(k)) && !linked.isEmpty()) {
////				System.out.println(wordArray1[k]);
//				babyList.add(wordArray1[k]);
//				System.out.println(k);
////				linked.remove(linked.get(repeat));
//				repeat++;
//			}else {
//				break;
//			}
////			repeat = 0;
//		}
//		System.out.println(babyList);
	}

}

//System.out.println("done for");
//String[] wordArray = new String[9000000];
//while (scanFile.hasNextLine()) {
//	if (scanFile.nextLine() == null) {
//		continue;
//	} else {
//		String line = scanFile.nextLine();
//		String str = line.replaceAll("\\p{Punct}", "").toLowerCase();
//		String[] splitLine = str.split(" ");
//		for (int i = 0; i < splitLine.length; i++) {
//
//			if (myList.getIterator().getCurrent() == null) {
////				list.insertAfter(splitLine[i]);
//				linked.add(splitLine[i]);
//			} else {
//				while (!myList.getIterator().atEnd()) {
//					if (list.getCurrent().dData.contains(splitLine[i])) {
//						break;
//					} else {
//						list.insertAfter(splitLine[i]);
//					}
//				}
//			}
//		}
//		list.insertAfter("\n");
//	}
//}
//	return babyList;