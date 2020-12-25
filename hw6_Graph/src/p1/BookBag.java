package p1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Predicate;


public class BookBag<T extends Book> implements Serializable {
	private T[] array;
	private int nElems;
	private int maxSize;

	public BookBag(int maxSize) {
		this.maxSize = maxSize;
		array = (T[]) new Book[maxSize];
		nElems = 0;
	}

	public void insertT(T object) {
		array[nElems++] = object;
	}
	public Book sequentialSearchByISBN(Book book) {
		for (int i = 0; i < nElems; i++) {
			if (array[i].getIsbn().contentEquals(book.getIsbn())) {
				return array[i];
			}
		}
		return null;
	}

	public T[] getArray() {
		return Arrays.copyOf(array, nElems);
	}
	public void bubbleSortByISBN() {
		int out;
		int in;
		int count = 0;
		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if(array[in+1].getIsbn() != null) {
				if (array[in].getIsbn().compareTo(array[in + 1].getIsbn()) > 0) {
					T temp = array[in + 1];
					array[in + 1] = array[in];
					array[in] = temp;
				}
			}else {
				continue;
			}
			}
		}
	}

	public void mergeSort() {
		T[] workSpace = (T[]) new Book[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	public void recMergeSort(T[] workSpace, int lowerBound, int upperBound) { // big o is O(n logn)
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workSpace, lowerBound, mid);// sort lower half
			recMergeSort(workSpace, mid + 1, upperBound);// sort upper half
			merge(workSpace, lowerBound, mid + 1, upperBound);// merge them
		}
	}

	private void merge(T[] workSpace, int lowerPtr, int highPtr, int upperBound) {
		int j = 0; // workSpace array index
		int lowerBound = lowerPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		while (lowerPtr <= mid && highPtr <= upperBound) {
			if (array[lowerPtr].getIsbn().compareTo(array[highPtr].getIsbn()) < 0) {
				workSpace[j++] = array[lowerPtr++];
			} else {
				workSpace[j++] = array[highPtr++];
			}
		}

		while (lowerPtr <= mid) {// high half is empty
			workSpace[j++] = array[lowerPtr++];
		}

		while (highPtr <= upperBound) {// low half is empty
			workSpace[j++] = array[highPtr++];
		}

		for (j = 0; j < n; j++) {
			array[lowerBound + j] = workSpace[j];
		}
	}

public int partition(String pivot) {
		return partition(0, nElems-1, pivot);
	}
	public int partition(int left, int right, String pivot) {
		int leftPtr = left-1;
		int rightPtr = right + 1;
		
		while(true) {
			while(leftPtr < right && array[++leftPtr].getIsbn().compareTo(pivot) < 0 ) {
				;//nop
			}
			
			while(rightPtr > left && array[--rightPtr].getIsbn().compareTo(pivot) >= 0) {
				;//nop
			}
			
			if(leftPtr >= rightPtr) {
				break;
			}else {
//				swap(leftPtr, rightPtr);
				T temp = array[leftPtr];
				array[leftPtr] = array[rightPtr];
				array[rightPtr] = temp;
			}
		}
		return leftPtr;
	}
	
//	private void swap(int dex1, int dex2) {
//		T temp = array[dex1];
//		array[dex1] = array[dex2];
//		array[dex2] = temp;
//	}
//	public T[] findNumberObject(Predicate<T> tester) {
//		T[] arr = (T[]) new Book[maxSize];
//		int n = 0;
//		for (int i = 0; i < nElems; i++) {
//			if (tester.test(array[i])) {
//				arr[n++] = array[i];
//			}
//		}
//		return Arrays.copyOf(arr, n);
//	}
//
//	public Object[] removeNumberObject(Predicate<T> tester) {
//		int count = 0;
//
//		T[] indices = (T[]) new Book[nElems];
//		for (int i = nElems - 1; i >= 1; i--) {
//			if (tester.test(array[i])) {
//				indices[count++] = array[i];
//				for (int j = i; j < nElems; j++) {
//					array[j] = array[j + 1];
//				}
//			} else {
//				continue;
//			}
//			nElems--;
//		}
//
//		T[] newArr = Arrays.copyOf(indices, count);
////		for (i = 0; i < nElems; i++) {
////			if (array[i] == object) {
////				break;
////			}
////		}
////		T temp = array[i];
////		if (i == nElems) {
////			return null;
////		} else {
////			for (int j = i; j < nElems - 1; j++) {
////				array[j] = array[j + 1];
////			}
////		}
////		nElems--;
//		return newArr;
//	}
//
//	public void rDisplay(int counter) {
//
//		if (counter == nElems) {
//			return;
//		} else {
//			System.out.println(array[counter]);
//			counter++;
//			rDisplay(counter);
//		}
//	}
//
//	public boolean rContains2(Predicate<T> obj ){
//	     return rContains2(obj, 0);
//	}
//	
//	public boolean rContains2(Predicate<T> tester, int counter) {
//		if (counter == nElems)
//			return false;
//
//		if (tester.test(array[counter])) {
//			return true;
//		} else {
//			counter++;
//			return rContains2(tester, counter);
//		}
//
//	}
//	public boolean rContains1(T obj ){
//	     return rContains1(obj, 0);
//	}
//	
//	private boolean rContains1(T obj, int counter) {
//		if (counter == nElems)
//			return false;
//
//		if (obj == array[counter]) { // comparing by memory addresses
//			return true;
//		} else {
//			counter++;
//			return rContains1(obj, counter);
//		}
//	}
//
//	public String reverse(String str) {
//		return reverse(str, 0);
//	}
//	
//	private String reverse(String str, int counter) {
//		if (counter == str.length()) {
//			return "";
//		} else {
//
//			return str.charAt(str.length() - 1 - counter++) + reverse(str, counter);
//		}
//	}
//
//	public int occurence(char[] arr, char ch) {
//		return occurence(arr, ch, 0, 0);
//	}
//	private int occurence(char[] arr, char ch, int counter, int i) {
//		if(i == arr.length) {
//			return counter;
//		}else {
//			if(arr[i++] == ch) {
//				counter++;
//			}
//			return occurence(arr, ch, counter, i);
//		}
//		
//	}
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
	}
}
