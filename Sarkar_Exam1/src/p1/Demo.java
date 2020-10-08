package p1;

import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue(1000000);
		Utilities.getBooks(pq);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.remove() + " ");
		}
	}

}
