package p4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import p2.Utilities;

public class BookObjects {

	public static void createBooks() throws FileNotFoundException {
		BookBag bag10 = new BookBag(5000000);
		Utilities.getBooks(bag10);
		int nElems = bag10.getNElems();
		System.out.println((int) (nElems * .10));

		BookBag bag1 = new BookBag((int) (nElems * 0.10));
		Utilities.getBooks1(bag1, (int) (nElems * 0.10));

		BookBag bag2 = new BookBag((int) (nElems * 0.20));
		Utilities.getBooks1(bag2, (int) (nElems * 0.20));
		BookBag bag3 = new BookBag((int) (nElems * 0.30));
		Utilities.getBooks1(bag3, (int) (nElems * 0.30));
		BookBag bag4 = new BookBag((int) (nElems * 0.40));
		Utilities.getBooks1(bag4, (int) (nElems * 0.40));
		BookBag bag5 = new BookBag((int) (nElems * 0.50));
		Utilities.getBooks1(bag5, (int) (nElems * 0.50));
		BookBag bag6 = new BookBag((int) (nElems * 0.60));
		Utilities.getBooks1(bag6, (int) (nElems * 0.60));
		BookBag bag7 = new BookBag((int) (nElems * 0.70));
		Utilities.getBooks1(bag7, (int) (nElems * 0.70));
		BookBag bag8 = new BookBag((int) (nElems * 0.80));
		Utilities.getBooks1(bag8, (int) (nElems * 0.80));
		BookBag bag9 = new BookBag((int) (nElems * 0.90));
		Utilities.getBooks1(bag9, (int) (nElems * 0.90));

		long[] timeArray = new long[31];

		long start1 = System.currentTimeMillis();
		bag1.bubbleSortByISBN();
		timeArray[1] = System.currentTimeMillis() - start1;
		System.out.println(timeArray[1]);
		long start2 = System.currentTimeMillis();
		bag2.bubbleSortByISBN();
		timeArray[4] = System.currentTimeMillis() - start2;
		System.out.println(timeArray[4]);
		long start3 = System.currentTimeMillis();
		bag3.bubbleSortByISBN();
		timeArray[7] = System.currentTimeMillis() - start3;
		long start4 = System.currentTimeMillis();
		bag4.bubbleSortByISBN();
		timeArray[10] = System.currentTimeMillis() - start4;
		long start5 = System.currentTimeMillis();
		bag5.bubbleSortByISBN();
		timeArray[13] = System.currentTimeMillis() - start5;
		long start6 = System.currentTimeMillis();
		bag6.bubbleSortByISBN();
		timeArray[16] = System.currentTimeMillis() - start6;
		long start7 = System.currentTimeMillis();
		bag7.bubbleSortByISBN();
		timeArray[19] = System.currentTimeMillis() - start7;
		long start8 = System.currentTimeMillis();
		bag8.bubbleSortByISBN();
		timeArray[22] = System.currentTimeMillis() - start8;
		long start9 = System.currentTimeMillis();
		bag9.bubbleSortByISBN();
		timeArray[25] = System.currentTimeMillis() - start9;
		long start10 = System.currentTimeMillis();
		bag10.bubbleSortByISBN();
		timeArray[28] = System.currentTimeMillis() - start10;

//		System.out.println("bubble sort bag10 :"  + bubbleSortTime + " Nano Seconds");

		long start11 = System.currentTimeMillis();
		bag1.selectionSort();
		timeArray[2] = System.currentTimeMillis() - start11;
		long start12 = System.currentTimeMillis();
		bag2.selectionSort();
		timeArray[5] = System.currentTimeMillis() - start12;
		long start13 = System.currentTimeMillis();
		bag3.selectionSort();
		timeArray[8] = System.currentTimeMillis() - start13;
		long start14 = System.currentTimeMillis();
		bag4.selectionSort();
		timeArray[11] = System.currentTimeMillis() - start14;
		long start15 = System.currentTimeMillis();
		bag5.selectionSort();
		timeArray[14] = System.currentTimeMillis() - start15;
		long start16 = System.currentTimeMillis();
		bag6.selectionSort();
		timeArray[17] = System.currentTimeMillis() - start16;
		long start17 = System.currentTimeMillis();
		bag7.selectionSort();
		timeArray[20] = System.currentTimeMillis() - start17;
		long start18 = System.currentTimeMillis();
		bag8.selectionSort();
		timeArray[23] = System.currentTimeMillis() - start18;
		long start19 = System.currentTimeMillis();
		bag9.selectionSort();
		timeArray[26] = System.currentTimeMillis() - start19;
		long start20 = System.currentTimeMillis();
		bag10.selectionSort();
		timeArray[29] = System.currentTimeMillis() - start20;
//		System.out.println("bubble sort bag10 :"  + selectionSortTime + " Nano Seconds");

		long start21 = System.currentTimeMillis();
		bag1.insertionSort();
		timeArray[3] = System.currentTimeMillis() - start21;
		long start22 = System.currentTimeMillis();
		bag2.insertionSort();
		timeArray[6] = System.currentTimeMillis() - start22;
		long start23 = System.currentTimeMillis();
		bag3.insertionSort();
		timeArray[9] = System.currentTimeMillis() - start23;
		long start24 = System.currentTimeMillis();
		bag4.insertionSort();
		timeArray[12] = System.currentTimeMillis() - start24;
		long start25 = System.currentTimeMillis();
		bag5.insertionSort();
		timeArray[15] = System.currentTimeMillis() - start25;
		long start26 = System.currentTimeMillis();
		bag6.insertionSort();
		timeArray[18] = System.currentTimeMillis() - start26;
		long start27 = System.currentTimeMillis();
		bag7.insertionSort();
		timeArray[21] = System.currentTimeMillis() - start27;
		long start28 = System.currentTimeMillis();
		bag8.insertionSort();
		timeArray[24] = System.currentTimeMillis() - start28;
		long start29 = System.currentTimeMillis();
		bag9.insertionSort();
		timeArray[27] = System.currentTimeMillis() - start29;
		long start30 = System.currentTimeMillis();
		bag10.insertionSort();
		timeArray[30] = System.currentTimeMillis() - start30;

		String line = "|-------------------------------------------------------------------|\n";
		String str = line + "|   Book Bag     |   Bubble Sort  | Selection Sort | Insertion Sort |\n" + line;
		int i = 1;
		int count = 1;
		while (i < 31 && count < 11) {
			str += String.format("%1s%-16s%1s%-16s%1s%-16s%1s%-16s%1s%n%65s", "|", count++, "|", timeArray[i], "|",
					timeArray[i + 1], "|", timeArray[i + 2], "|", line);
			i = i + 3;
		}
//		System.out.println("time table in Milisecond is: \n" + str);
//		PrintWriter pw = new PrintWriter("myData.txt");
//		pw.print(str);
//		pw.close();

		
	//Bubble sort: bubble sort takes the most time and it's big o is O(n^2). Because it has nested loops and it has to go through
		//all the elements in the array for every run of outer array. and it has to make swap most of the time.
	
	//selection sort: Selection sort also has a big o of O(n^2). But it is more efficient than bubble sort because it moves only 
		//the maximum value instead of all the values.
		
	//insertion sort: insertion sort is the more efficient than bubble and selection sort although its big o is O(n^2). Because 
		//it does not swap the elements instead it just makes copy, which takes much less time.
		
		
//		File file = new File("myData.txt");
//		Scanner scanner = new Scanner(file);
//		String[] tokens = new String[(int) file.length()];
//		while (scanner.hasNextLine()) {
//			String aLine = scanner.nextLine();
//			tokens = aLine.split(" ");
//			System.out.println(Arrays.toString(tokens));
//		}

	}
}
