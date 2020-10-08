package p1;

public class PriorityQueue {

	private int maxSize;
	private Book[] queArray;
	private int nElems;
	
	public PriorityQueue(int maxSize) {
		queArray = new Book[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}
	
	public void insert(Book value) {//O(n^2)
		int j;
		if(nElems == 0) {//if empty
			queArray[nElems++] = value;
		}else {
			for(j = nElems -1; j >= 0; j--) {
				if(value.getAuthor().compareToIgnoreCase(queArray[j].getAuthor()) > 0) {
					queArray[j+1] = queArray[j];
				}else {
					break;
				}
			}
			queArray[j+1] = value;
			nElems++;
		}
		
	}
	
	public Book remove(){//O(n)
		return queArray[--nElems];
	}
	
	public Book peekMin() {
		return queArray[nElems-1];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
}
