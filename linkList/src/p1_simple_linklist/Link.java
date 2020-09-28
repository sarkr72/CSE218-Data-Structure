package p1_simple_linklist;

public class Link {

	private int iData;
	private Link next;
	
	public Link(int iData) {
		this.iData = iData;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
	
	public void display() {
		System.out.print(iData + " ");
	}
}
