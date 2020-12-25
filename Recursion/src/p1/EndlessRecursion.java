package p1;

public class EndlessRecursion {
private static int n=0;
	public static void main(String[] args) {
		int n = 0;
//		message(n);
		while(true) {
			System.out.println("hi" + n++);
		}
		
	}

	private static void message(int s) {
//		if(s >= 10) {//base case
//			return;
//		}
			System.out.println(s);
	s++;
	message(s);
	}

}
