package p2;



public class ParentLink {

	private String uniqueWord;
//	public ParentLink next;
	
	public ParentLink(String uniqueWord) {
		this.uniqueWord = uniqueWord;
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
	
//	public   BabyList getBabyList() {
//		return babyList;
//	}
//
//	public void setBabyList(BabyList babyList) {
//		this.babyList = babyList;
//	}

	public  void display() {
		System.out.print(uniqueWord+" " );
	}
	
	public boolean equals(ParentLink link) {
		if(this.uniqueWord.compareToIgnoreCase(link.uniqueWord) == 0) {
			return true;
		}else {
			return false;
		}
	}
}
