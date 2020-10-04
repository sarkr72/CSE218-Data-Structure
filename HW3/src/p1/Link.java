package p1;

public class Link {

	private String iData;
	private Link next;
	
	public Link(String iData2) {
		this.iData = iData2;
	}

	public String getiData() {
		return iData;
	}

	public void setiData(String iData) {
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
