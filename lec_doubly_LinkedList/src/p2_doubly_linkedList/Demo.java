package p2_doubly_linkedList;

public class Demo {

	public static void main(String[] args) {

		Doubly_LinkList theList = new Doubly_LinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.deleteFirst();
		theList.deleteLast();
		
		theList.deleteKey(11);
		
		theList.insertBefore(33, 30);
//		theList.inse
		theList.displayForward();
		theList.displayBackward();
	}

}
