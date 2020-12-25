package p2_mergeSort;

public class DArray {

	private long[] theArr;
	private int nElems;

	public DArray(int max) {
		theArr = new long[max];
	}

	public void insert(long value) {
		theArr[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArr[i] + " ");
		}
		System.out.println();
	}

	public void mergeSort() {//big o is: nlog(n)
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	public void recMergeSort(long[] workSpace, int lowerBound, int upperBound) { // big o is O(n logn)
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workSpace, lowerBound, mid);// sort lower half
			recMergeSort(workSpace, mid + 1, upperBound);// sort upper half
			merge(workSpace, lowerBound, mid + 1, upperBound);// merge them
		}
	}

	private void merge(long[] workSpace, int lowerPtr, int highPtr, int upperBound) {
		int j = 0; // workSpace array index
		int lowerBound = lowerPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		while (lowerPtr <= mid && highPtr <= upperBound) {
			if (theArr[lowerPtr] < theArr[highPtr]) {
				workSpace[j++] = theArr[lowerPtr++];
			} else {
				workSpace[j++] = theArr[highPtr++];
			}
		}

		while (lowerPtr <= mid) {// high half is empty
			workSpace[j++] = theArr[lowerPtr++];
		}

		while (highPtr <= upperBound) {// low half is empty
			workSpace[j++] = theArr[highPtr++];
		}
		
		for(j = 0; j< n; j++) {
			theArr[lowerBound + j] = workSpace[j];
		}
	}
}
