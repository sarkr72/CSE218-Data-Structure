package p1_partition;

public class ArrayPat {

	private long[] theArray;
	private int nElems;
	
	public ArrayPat(int max) {
		theArray = new long[max];
	}
	
//	public void partition(String pivot) {//big O is: O(n)
//		
//	}
	//quick sort big o is nlog(n)
	//worst scenerio n^2
	public int partition1(int left, int right, long pivot) {
		int leftPtr = left-1;
		int rightPtr = right + 1;
		
		while(true) {
			while(leftPtr < right && theArray[++leftPtr] < pivot) {
				;//nop
			}
			
			while(rightPtr > left && theArray[--rightPtr] >= pivot) {
				;//nop
			}
			
			if(leftPtr >= rightPtr) {
				break;
			}else {
				swap(leftPtr, rightPtr);
			}
		}
		return leftPtr;
	}
	
	private void swap(int dex1, int dex2) {
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}

	public void insert(long value) {
		theArray[nElems++] = value;
	}
	
	public int size() {
		return nElems;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
}
