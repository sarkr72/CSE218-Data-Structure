package p1;

public class Demo {

	public static void main(String[] args) {
		LinkList myList = new LinkList();// stack
		
		myList.push("rinku");
		myList.push("sarkar");
		myList.push("red");
		myList.push("blue");
		
		myList.display();
		myList.pop().display();
		myList.display();
	}
}