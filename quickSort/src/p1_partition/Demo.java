package p1_partition;

public class Demo {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		ArrayPat arr = new ArrayPat(MAX_SIZE);
		
		arr.insert(5);
		arr.insert(6);
		arr.insert(2);
		arr.insert(7);
		arr.insert(8);
		arr.insert(1);
		arr.insert(9);
		arr.insert(4);
		arr.insert(0);
		arr.insert(3);
		long pivot = 0;
		arr.display();
		
		int parDex = arr.partition1(0, arr.size()-1, pivot);
		arr.display();
		System.out.println("for " + pivot + "value, the partition at: " + parDex);
	}

}
