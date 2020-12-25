package p2_quickSort;

public class ArrayIns {

	private long[] array;
	private int nElems;
	
	public ArrayIns(int maxSize) {
		array = new long[maxSize];
	}
	
	public void insert(long value) {
		array[nElems++] = value;
	}
	public void quickSort() {
		reQuickSort(0, nElems-1);
	}

	private void reQuickSort(int left, int right) {
		if(right - left <= 0) {
			return;
		}else {
			long pivot = array[right];
			int partition = partitionIt(left, right, pivot);
			reQuickSort(left, partition-1);
			reQuickSort(partition + 1, right);
		}
	}

	private int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		
		while(true) {
			while(leftPtr < right && array[++leftPtr] < pivot) {
				;
			}
			
			while(rightPtr > left && array[--rightPtr] > pivot) {
				;
			}
			
			if(leftPtr >= rightPtr) {
				break;
			}else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right);
		
		return leftPtr;
	}

	private void swap(int leftPtr, int rightPtr) {
		long temp  = array[leftPtr];
		array[leftPtr] = array[rightPtr];
		array[rightPtr] = temp;
		
	}
	public void display() {
		for(int i  = 0; i < nElems; i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	
}
