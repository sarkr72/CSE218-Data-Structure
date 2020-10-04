package p2;
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
	
	public void insertFirst(String dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insert(String dData) {//big o is O(1)
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}else {
			last.next  = newLink;
		}
		last = newLink;
	}
	
	public String remove() {// big o is O(1)
		String temp = first.dData;
		if(first.next == null) {// if only one link
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void display() {
		System.out.println("list: first --> last:" );
		Link current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
