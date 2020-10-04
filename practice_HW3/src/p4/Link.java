package p4;

public class Link {

	public Book dData;
	public Link next;
	
	public Link(Book dData) {
		this.dData = dData;
	}
	
	public void display() {
		System.out.print(dData + " ");
	}

//	public Book getdData() {
//		return dData;
//	}
//
//	public void setdData(Book dData) {
//		this.dData = dData;
//	}
//
//	public Link getNext() {
//		return next;
//	}
//
//	public void setNext(Link next) {
//		this.next = next;
//	}
	
	
}
