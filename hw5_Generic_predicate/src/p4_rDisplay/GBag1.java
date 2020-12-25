package p4_rDisplay;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Predicate;

public class GBag1<T extends Person> implements Serializable {
	private T[] array;
	private int nElems;
	private int maxSize;

	public GBag1(int maxSize) {
		this.maxSize = maxSize;
		array = (T[]) new Person[maxSize];
		nElems = 0;
	}

	public void insertT(T object) {
		array[nElems++] = object;
	}

	public T[] findNumberObject(Predicate<T> tester) {
		T[] arr = (T[]) new Person[maxSize];
		int n = 0;
		for (int i = 0; i < nElems; i++) {
			if (tester.test(array[i])) {
				arr[n++] = array[i];
			}
		}
		return Arrays.copyOf(arr, n);
	}

	public Object[] removeNumberObject(Predicate<T> tester) {
		int count = 0;

		T[] indices = (T[]) new Person[nElems];
		for (int i = nElems - 1; i >= 0; i--) {
			if (tester.test(array[i])) {
				indices[count++] = array[i];
				for (int j = i; j < nElems; j++) {
					array[j] = array[j + 1];
				}
			} else {
				continue;
			}
			nElems--;
		}

		T[] newArr = Arrays.copyOf(indices, count);
		return newArr;
	}

	public void rDisplay(int counter) {

		if (counter == nElems) {
			return;
		} else {
			System.out.println(array[counter]);
			counter++;
			rDisplay(counter);
		}
	}

	public boolean rContains2(Predicate<T> obj ){
	     return rContains2(obj, 0);
	}
	
	private boolean rContains2(Predicate<T> tester, int counter) {
		if (counter == nElems)
			return false;

		if (tester.test(array[counter])) {
			return true;
		} else {
			counter++;
			return rContains2(tester, counter);
		}

	}
	public boolean rContains1(T obj ){
	     return rContains1(obj, 0);
	}
	
	private boolean rContains1(T obj, int counter) {
		if (counter == nElems)
			return false;

		if (obj == array[counter]) { // comparing by memory addresses
			return true;
		} else {
			counter++;
			return rContains1(obj, counter);
		}
	}

	public String reverse(String str) {
		return reverse(str, 0);
	}
	
	private String reverse(String str, int counter) {
		if (counter == str.length()) {
			return "";
		} else {

			return str.charAt(str.length() - 1 - counter++) + reverse(str, counter);
		}
	}

	public int occurence(char[] arr, char ch) {
		return occurence(arr, ch, 0, 0);
	}
	private int occurence(char[] arr, char ch, int counter, int i) {
		if(i == arr.length) {
			return counter;
		}else {
			if(arr[i++] == ch) {
				counter++;
			}
			return occurence(arr, ch, counter, i);
		}
		
	}
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
	}
}
