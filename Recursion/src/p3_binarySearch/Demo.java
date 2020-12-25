package p3_binarySearch;

public class Demo {

	public static void main(String[] args) {
	
		System.out.println("sum is "+ sumFraction(5));
	}

	private static double sumFraction(int n) {
		if(n == 1) {
			return 1.0;
		}
		return 1.0/n + sumFraction(n-1);
	}
//	return 1.0/n + sumFraction(4);
//	return 1.0/5 + 1.0/4+ sumFraction(3);
//	return 1.0/5 + 1.0/4+ 1.0/3 +sumFraction(2);
//	return 1.0/5 + 1.0/4+ 1.0/3 +1.0/2+sumFraction(1);
}
