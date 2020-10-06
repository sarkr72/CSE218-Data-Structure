package p6;

import p1.ParentLink;

public class BabyLink {

	public String nextWord;
	public BabyLink next;
	
	public BabyLink(String nextWord) {
		this.nextWord = nextWord;
	}
	
	public  void display() {
		System.out.print(nextWord + " ");
	}
}
