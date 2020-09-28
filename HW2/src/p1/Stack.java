package p1;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Character> stack;
	private int top;
	
	public Stack() {
		stack = new ArrayList<>();
		top = -1;
	}
	
	public void push(Character ch) {
		++top;
		stack.add(ch);
	}
	
	public char pop() {
		if(!stack.isEmpty()) {
			char popValue = stack.get(top--);
			return popValue;
		}else {
			System.out.println("the stack is empty");
			return 1;
		}
	}
	
	public boolean isEmpty() {
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Object peek() {
		return stack.get(top);
	}
	
	public ArrayList getStackArrayList() {
		return stack;
	}
}
