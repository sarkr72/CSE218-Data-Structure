package p1;

public class ParentList {
private ParentLink first;
	
	public ParentList() {
		first = null;
	}
	
	public ParentLink getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void setFirst(ParentLink newLink) {
		first = newLink;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public void displayList() {
		ParentLink current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
