package p4;

import java.util.LinkedList;

public class BabyList {
	private LinkedList<BabyLink> babyList;
	
	public BabyList() {
		babyList = new LinkedList<>();
	}
	
	public LinkedList<BabyLink> get() {
		return babyList;
	}
	
	@Override
	public String toString() {
		return babyList.toString();
	}
	
	public int size() {
		return babyList.size();
	}
	
	public void display() {
		System.out.println(babyList);
	}
//private BabyLink first;
//	
//	public BabyList() {
//		first = null;
//	}
//	
//	public BabyLink getFirst() {
//		return first;
//	}
//	
//	public boolean isEmpty() {
//		return first == null;
//	}
//	
//	public void setFirst(BabyLink newLink) {
//		first = newLink;
//	}
//	
//	public ListIterator_baby getIterator() {
//		return new ListIterator_baby(this);
//	}
//	
//	public void displayList() {
//		BabyLink current = first;
//		while(current != null) {
//			current.display();
//			current = current.next;
//		}
//		System.out.println();
//	}
}
