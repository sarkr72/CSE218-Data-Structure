package p4;

public class Link {

	private Book iData;
	private Link next;
	
	public Link(Book iData) {
		this.iData = iData;
	}

	public Book getiData() {
		return iData;
	}

	public void setiData(Book iData) {
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
