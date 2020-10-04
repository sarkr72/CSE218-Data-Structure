package p1_double_ended_LinkedList;
//delete first for queue not stack.

public class FirstAndLastList {

	public Link first;
	public Link last;
	
	public FirstAndLastList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertlast(double dData) {//big o is O(1)
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}else {
			last.next  = newLink;
		}
		last = newLink;
	}
	
	public double deleteFirst() {// big o is O(1)
		double temp = first.dData;
		if(first.next == null) {// if only one link
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void display() {
		System.out.println("list: firsr --> last:" );
		Link current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
