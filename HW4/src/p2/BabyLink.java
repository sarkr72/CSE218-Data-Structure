package p2;

import p1.ParentLink;

public class BabyLink {

	public String nextWord;
//	public BabyLink next;
	
	public BabyLink(String dData) {
		this.nextWord = dData;
	}
	
	public String getNextWord() {
		return nextWord;
	}
	
	public  void display() {
		System.out.print(nextWord + " ");
	}
	
	@Override
	public String toString() {
		return nextWord;
	}
}
