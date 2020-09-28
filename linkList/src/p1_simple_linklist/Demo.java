package p1_simple_linklist;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList myList = new LinkList();//stack
		myList.insertFirst(10);
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(40);
		myList.display();
		myList.deleteFirst().display();
//		myList.display();
//		myList.delete(30);
//		myList.deleteFirst().display();
//		myList.find(40).display();
		myList.display();
	}

}
