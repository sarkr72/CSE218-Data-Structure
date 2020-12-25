package p1_Merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = { 23, 47, 81, 95 };
		int[] arrayB = { 7, 14, 39, 55, 62, 74 };
		int[] arrayC = new int[arrayA.length + arrayB.length];

		merge(arrayA, 4, arrayB, 6, arrayC);
		display(arrayC, 10);
	}

	private static void display(int[] arrayC, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {

		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;

		while (aIndex < sizeA && bIndex < sizeB) {
			if (arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}

		while (aIndex < sizeA) {// arrayB is empty
			arrayC[cIndex++] = arrayA[aIndex++];
		}

		while (bIndex < sizeB) {// arrayA is empty
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}
}
