package p1;

import p2.BabyList;

public class ParentLink {

	private String uniqueWord;
	public  BabyList babyList;
//	public ParentLink next;
	
	public ParentLink(String uniqueWord) {
		this.uniqueWord = uniqueWord;
		this.babyList = new BabyList();
	}

	public String getdData() {
		return uniqueWord;
	}

	public void setdData(String dData) {
		this.uniqueWord = dData;
	}
//
//	public ParentLink getNext() {
//		return next;
//	}
//
//	public void setNext(ParentLink next) {
//		this.next = next;
//	}
	
	public   BabyList getBabyList() {
		return babyList;
	}

	public void setBabyList(BabyList babyList) {
		this.babyList = babyList;
	}

	public  void display() {
		System.out.println(uniqueWord + " -> " + babyList);
	}
	
	public boolean equals(ParentLink link) {
		if(this.uniqueWord.compareToIgnoreCase(link.uniqueWord) == 0) {
			return true;
		}else {
			return false;
		}
	}
}
