package p1;

import java.util.ArrayList;

public class Queues {

	private ArrayList<Character> que;
	private int front;
	private int rear;
	private int nElems;
	
	public Queues() {
		que = new ArrayList<>();
		front  = 0;
		rear = -1;
		nElems = 0;
	}
	
	public void insert(Character object) {
		que.add(object);
		++rear;
		nElems++;
	}
	
	public Character remove() {
		Character temp = que.get(front++);
		nElems--;
		return temp;
	}
	
	public Character peekRear() {
		return que.get(rear);
	}
	
	public Character peekFront() {
		return que.get(front);
	}
	
//	public boolean isFull() {
//		return nElems == q
//	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
}
