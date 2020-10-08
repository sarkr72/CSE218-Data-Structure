package p3;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> stack;
	private int top;
	
	public Stack() {
		stack = new ArrayList<>();
		top = -1;
	}
	
	public void push(Object ch) {
		++top;
		stack.add(ch);
	}
	
	public Object pop() {
		if(!stack.isEmpty()) {
			Object popValue = stack.get(top--);
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
