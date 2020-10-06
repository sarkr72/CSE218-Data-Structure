package p1;

import p2.BabyList;

public class ParentLink {

	public String dData;
	private BabyList babyList;
	public ParentLink next;
	
	public ParentLink(String dData) {
		this.dData = dData;
	}

//	public String getdData() {
//		return dData;
//	}
//
//	public void setdData(String dData) {
//		this.dData = dData;
//	}
//
//	public ParentLink getNext() {
//		return next;
//	}
//
//	public void setNext(ParentLink next) {
//		this.next = next;
//	}
	
	public BabyList getBabyList() {
		return babyList;
	}

	public void setBabyList(BabyList babyList) {
		this.babyList = babyList;
	}

	public  void display() {
		System.out.print(dData + " ");
	}
}
