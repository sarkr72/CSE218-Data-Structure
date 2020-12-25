package p4;

public class Demo {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(Integer.MAX_VALUE);
	}

	private static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
