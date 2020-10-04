package p4;

public class ListIterator {

	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list) {
		ourList = list;
		reset();//move the index to the beginning
	}

	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public void nextLink(){
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent() {
		return current;
	}
	
	public Book find() {
		Book temp = current.dData;

		if(previous == null) {// if beginning of list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous = current.next;
			
			if(atEnd()) {
				reset();
			}else {
				current = current.next;
			}
			}
		return temp;
	}
	
	public Book deleteCurrent() {
		Book temp = current.dData;
		
		if(previous == null) {// if beginning of list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			}else {
				current = current.next;
			}
		}
		return temp;
	}
	
	public void insertBefore(Book dData) {//insert before the current link
		Link newLink = new Link(dData);
		
		if(previous == null) {// beginning of list or empty list
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else { // not beginning or not emoty
			newLink.next = current;
			previous.next = newLink;
			current = newLink;
		}
	}
	public void insertAfter(Book dData) {//insert after the current link
	Link newLink = new Link(dData);
	if(ourList.isEmpty()) {
		ourList.setFirst(newLink);
		current = newLink;
	}else {
		newLink.next = current.next;
		current.next = newLink;
		nextLink();
	}
	}
}