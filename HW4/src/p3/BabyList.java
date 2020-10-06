package p3;


public class BabyList {
private BabyLink first;
	
	public BabyList() {
		first = null;
	}
	
	public BabyLink getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void setFirst(BabyLink newLink) {
		first = newLink;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public void displayList() {
		BabyLink current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
