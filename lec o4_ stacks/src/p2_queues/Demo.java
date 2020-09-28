package p2_queues;

public class Demo {

	public static void main(String[] args) {
		Queues theQ = new Queues(3);
		
		theQ.insert(10);
		theQ.insert(20);
		theQ.insert(30);
		System.out.println(theQ.remove());
		theQ.insert(40);
		System.out.println(theQ.remove());
		System.out.println(theQ.remove());
		System.out.println(theQ.remove());
	}

}
