package p2_binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		String[] arr = {"A", "B", "C", "D", "E"};
		System.out.println(check(arr, 0, arr.length-1, "X"));
	}

	private static int check(String[] arr, int start, int end, String key) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end)/ 2;
		if(arr[mid].equals(key)) {
			return mid;
		}else if(arr[mid].compareTo(key) > 0) {
			return check(arr, start, mid-1, key);
		}else {
			return check(arr, mid+1, end, key);
		}
	}
}
