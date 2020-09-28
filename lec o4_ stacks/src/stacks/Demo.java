package stacks;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackX theStack = new StackX(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		
		while (!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}
		System.out.println(theStack.isEmpty());
	}

}
