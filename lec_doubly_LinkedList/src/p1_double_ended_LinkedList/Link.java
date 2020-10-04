package p1_double_ended_LinkedList;

public class Link {

	public double dData;
	public Link next;
	
	public Link(double dData) {
		this.dData = dData;
	}

//	public double getiData() {
//		return iData;
//	}
//
//	public void setiData(double iData) {
//		this.iData = iData;
//	}
//
//	public Link getNext() {
//		return next;
//	}
//
//	public void setNext(Link next) {
//		this.next = next;
//	}
	
	public void display() {
		System.out.print(dData + " ");
	}
}