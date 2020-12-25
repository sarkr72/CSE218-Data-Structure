package p2_mergeSort;

public class Demo {

	public static void main(String[] args) {
		int maxSize = 100;
		DArray arr = new DArray(maxSize);
		arr.insert(34);
		arr.insert(10);
		arr.insert(54);
		arr.insert(84);
		arr.insert(34);
		arr.insert(64);
		arr.insert(24);
		arr.insert(114);
		arr.insert(444);
		arr.display();
		arr.mergeSort();
		arr.display();

	}

}
