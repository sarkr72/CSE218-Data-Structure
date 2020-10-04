package p2;

public class Demo {

	public static void main(String[] args) {
		
		FirstAndLastList theList = new FirstAndLastList();
		
		theList.insert("john doe");
		theList.insert("rinku sarkar");
		theList.insert("ronald reagan");
		theList.insert("chris tucker");
		
		theList.display();
		theList.remove();
		theList.display();
	}

}
