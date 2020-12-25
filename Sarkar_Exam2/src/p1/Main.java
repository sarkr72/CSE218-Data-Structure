package p1;

public class Main {

	public static void main(String[] args) {
		char[] arr = "hello world".toCharArray();
		char ch = 'o';
		System.out.println(occurence(arr, ch, 0, 0));
		
	}
	public static int occurence(char[] arr, char ch, int counter, int i) {
		if(i == arr.length) {
			return counter;
		}else {
			if(arr[i++] == ch) {
				counter++;
			}
			return occurence(arr, ch, counter, i);
		}
		
	}
}
