package p2_doubleEndedLinkList;

public class LinkList {

	private Link first;//2nd; old first
	private Link last;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {// big o is 1
		return first == null;
	}
	
	public void insertFirst(int iData) {//new first
		Link newLink = new Link(iData);//big o is 1
		newLink.setNext(first);
		first = newLink;
	}
	
	public Link deleteFirst() {//big o is 1
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public Link find(int key) {//big o is n
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null;
			}else {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public Link delete(int key) {//big o is 1
		Link current = first;
		Link previous = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null;
			}else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if(current == first) {
			first = first.getNext();
		}else{
			previous.setNext(current.getNext());
		}
		return current;
	}
	
	public void display() {//big o is n
		System.out.println("first Link --> last link");
		Link current = first;
		while(current != null) {
			current.display();
			current = current.getNext();
		}
		System.out.println();
	}
}