package p2;

import p1.ParentLink;

public class BabyLink {

	public String dData;
	public BabyLink next;
	
	public BabyLink(String dData) {
		this.dData = dData;
	}
	
	public  void display() {
		System.out.print(dData + " ");
	}
}
