package p1;
//mind Sweeper***

import java.util.Arrays;

// stack and queues are abstract

public class GStack<T> {
	private int maxSize;
	private T[] stackArray;
	private int top;

	public GStack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = (T[]) (new Object[maxSize]);
		top = -1;
	}

	public void push(T value) {
		stackArray[++top] = value;
	}

	public void pushAll(T[] objs) {
		for (int i = 0; i < objs.length; i++) {
			if (!isFull()) {
				this.push(objs[i]);
			} else {
				return;
			}
		}
	}
//		public void push(T value) {
//			stackArray[++top] = value; 
//		}

	public T pop() {
		return stackArray[top--];
	}

	public T[] popAll() {
		int counter = 0;
		if (isEmpty()) {
			return null;
		} else {
			T[] popped = (T[]) (new Object[stackArray.length]);
			for (int i = 0; i < stackArray.length; i++) {
				if (!isEmpty()) {
					popped[i] = this.pop();
					counter++;
				} else {
					break;
				}
			}
			return Arrays.copyOf(popped, counter);
		}
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T peek() {
		return stackArray[top];
	}
}
