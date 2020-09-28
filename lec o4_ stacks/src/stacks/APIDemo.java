package stacks;

import java.util.Stack;

public class APIDemo {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack();
//		myStack.push(1);
		myStack.push("Hi");
		myStack.push("bye");
//		myStack.push(2.2);
//		myStack.push('A');
	System.out.println(myStack.pop() + myStack.pop());
	
	}
}
