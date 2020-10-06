package p2;


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
	
	public ListIterator_baby getIterator() {
		return new ListIterator_baby(this);
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
