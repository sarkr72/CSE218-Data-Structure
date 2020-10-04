package p1_double_ended_LinkedList;

public class Demo {

	public static void main(String[] args) {

		FirstAndLastList theList = new FirstAndLastList();
		theList.insertFirst(10);
		theList.insertFirst(20);
		theList.insertlast(30);
		theList.insertlast(40);
		theList.deleteFirst();
		theList.display();
	}
}