package p1_Iteraters;

public class LinkList {

	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public Link getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void setFirst(Link newLink) {
		first = newLink;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
