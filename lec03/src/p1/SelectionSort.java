package p1;

import java.util.Arrays;

public  class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = {10,5,1,8,6,4,2,5,3,7};
		int[] array2 = {10,5,1,8,6,4,2,5,3,7};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
		insertionSort(array2);
		System.out.println(Arrays.toString(array2));
	}
	
// n^2
//for almost sorted n
	public static void selectionSort(int[] arr) {
		int out;
		int in;
		int min;
		for (out = 0; out < arr.length - 1; out++) {
			min = out;
			for (in = out + 1; in < arr.length; in++) {
				if (arr[in] < arr[min]) {
					min = in;
				}
			}
//			swap(out, min);
			int temp = arr[min];
			arr[min] = arr[out];
			arr[out] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		int in;
		int out;
		for (out = 1; out < arr.length; out++) {
			int temp = arr[out];
			in = out;
			while (in > 0 && arr[in - 1] >= temp) {
				arr[in] = arr[in - 1];
				in--;
			}
			arr[in] = temp;
		}
	}
}
