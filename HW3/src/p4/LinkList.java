package p4;

public class LinkList {

	private Link first;// 2nd; old first

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {// big o is 1
		return first == null;
	}

	public void insert(Book iData) {// new first
		Link newLink = new Link(iData);// big o is 1
		newLink.setNext(first);
		first = newLink;
	}

	public Link pop() {// big o is 1
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public Link find() {// big o is n
		Link current = first;
//		while(!current.getiData().contentEquals(key)) {
//			if(current.getNext() == null) {
//				return null;
//			}else {
//				current = current.getNext();
//			}
//		}
//		return current;
		while (first != null) {
				current = current.getNext();
				current.display();
				return current;
		}
		return null;
	}

	public Link delete() {
		Link current = first;
		Link previous = first;
		while (!current.getiData().getIsbn().contentEquals(previous.getiData().getIsbn())) {
			if (current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}

		if (current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return current;
	}

	public void display() {// big o is n
		System.out.println("first Link --> last link");
		Link current = first;
		while (current != null) {
			current.display();
			current = current.getNext();
		}
		System.out.println();
	}
}