package p2;
//mind Sweeper***


// stack and queues are abstract

public class GStackX<Book> {
	private int maxSize;
	private Book[] stackArray;
	private int top;

	public GStackX(int maxSize) {
		this.maxSize = maxSize;
		stackArray = (Book[]) (new Object[maxSize]);
		top = -1;
	}

	public void push(Book book) {
		book.
		stackArray[++top] = book;
	}


	public Book pop() {
		return stackArray[top--];
	}


	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public Book peek() {
		return stackArray[top];
	}
}
