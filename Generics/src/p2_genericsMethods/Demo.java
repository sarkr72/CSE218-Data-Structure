package p2_genericsMethods;

public class Demo {

	public static void main(String[] args) {
	
		String[] names = {"A", "B", "C", "D"};
		Integer[] numbers = {1, 2, 3};
		display(names);
		display(numbers);
	}

	//generic methods
	private static <E> void display(E[] e) {
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
	
	
//	public static void displayString(String[] array) {
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}
//
//	public static void displayInteger(Integer[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//	}
}
