package p2_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

import p3.Student;
import p4_rDisplay.Person;

public class GBag<T> {
	private Object object;
	private T[] array;
	private int nElems;
	private int maxSize;

	@SuppressWarnings("unchecked")
	public GBag(int maxSize) {
		this.maxSize = maxSize;
		array = (T[]) new Object[maxSize];
		nElems = 0;
	}

	public void insertT(T object) {
		array[nElems++] = object;
		Student.counter = nElems;
	}

	public T[] findNumberObject(Predicate<T> tester) {
		@SuppressWarnings("unchecked")
		T[] arr = (T[]) new Object[maxSize];
		int n = 0;
		for (int i = 0; i < nElems; i++) {
			if (tester.test(array[i])) {
				arr[n++] = array[i];
			}
		}
		return Arrays.copyOf(arr, n);
	}

	public T[] removeNumberObject(Predicate<T> tester) {
		int count = 0;

		T[] indices = (T[]) new Object[nElems];
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

		return Arrays.copyOf(indices, count);
	}

	public <T> void rDisplay() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
	}
}
