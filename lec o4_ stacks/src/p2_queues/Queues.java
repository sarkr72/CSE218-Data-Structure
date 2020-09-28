package p2_queues;

//abstract
public class Queues {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;
	
	public Queues(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
	}
	
	public void insert(long value) {
		if(rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = value;
		nElems++;
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public long peekRear() {
//		rear--;
//		return queArray[rear++];
		return queArray[rear];
	}
	
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		nElems--;
		return temp;
	}
}
