package p2_predicate;

import java.util.Arrays;

public class NumberBag<T extends Number> {

	private T[] array;
	private int nElems;
	private int maxSize;

	@SuppressWarnings("unchecked")
	public NumberBag(int maxSize) {
		this.maxSize = maxSize;
		array = (T[]) new Number[maxSize];
		nElems = 0;
	}

	public void insertT(T object) {
		array[nElems++] = object;
	}

	public Number[] findNumberObject(T object) {
		@SuppressWarnings("unchecked")
		Number[] arr = new Number[1000];
		int n = 0;
		for (int i = 0; i < nElems; i++) {
			if (array[i] == object) {
				arr[n++] = array[i];
			}
		}
		Number[] arr2 = Arrays.copyOf(arr, n);
		return arr2;
	}

	public T[] removeNumberObject(T object) {
		int count = 0;

		T[] indices = (T[]) new Number[nElems];
		for (int i = nElems - 1; i >= 0; i--) {
			if (object == (array[i])) {
				indices[count++] = array[i];
				for (int j = i; j < nElems; j++) {
					array[j] = array[j + 1];
				}
			} else {
				continue;
			}
			nElems--;
		}

		T[] deletedT = Arrays.copyOf(indices, count);
		return deletedT;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
	}
}
