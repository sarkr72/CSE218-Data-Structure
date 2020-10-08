package p4;


public class BabyLink {

	public String nextWord;
//	public BabyLink next;
	
	public BabyLink(String dData) {
		this.nextWord = dData;
	}
	public  void display() {
		System.out.print(nextWord + " ");
	}
	
	public String getNextWord() {
		return nextWord;
	}
	
	
	@Override
	public String toString() {
		return nextWord;
	}
}
