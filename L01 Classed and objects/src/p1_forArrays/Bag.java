package p1_forArrays;

public class Bag {

	private int[] arr;
	private int nElems;
	
	public Bag(int maxSize) {
		arr = new int[maxSize];
		nElems = 0;
	}
	
	// effort is insensitive to size of the problem
	// effort is constant
	//O(1)
	public void insert(int value) {
		arr[nElems++] = value;
	}
	
	// effort is proportional to the size of the problem
	// effort is not constant, roughly nElems/2
	// O(n).
	//this is sequential
	// Binary is more efficient
	public int search(int value) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	// effort to sort one number: n
	// effort to sort all numbers: n * n-n^2
	// BUBBLE sort is the worst.
	public void bubbleSort() {
		int out; 
		int in;
		
		for(out = nElems -1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				if(arr[in] > arr[in+1]) {
					swap(in, in+1);
				}
			}
				
		}
	}

	
	public void swap(int in, int out) {
		int temp = arr[in];
		arr[in] = arr[out];
		arr[out] = temp;
	}
	
	// logn
//	public int binarySearch(int key) {
//		int low = 0; 
//		int high = nElems - 1;
//		
//		while(high >= low) {
//			int mid = (high - low) / 2;
//			if(key < mid) {
//				high = mid - 1;
//			} else if(key > mid) {
//				high = mid + 1;
//			}else {
//				return mid;
//			}
//		}
//	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}