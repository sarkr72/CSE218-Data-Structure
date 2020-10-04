package p2_doubly_linkedList;

public class Doubly_LinkList {

	public Link first;
	public Link last;

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dData) {
		Link newLink = new Link(dData);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(long dData) {
		Link newLink = new Link(dData);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public boolean insertAfter(long key, long dData) {// big o is O(n)
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Link newLink = new Link(dData);

		if (current == last) {// if last link
			last = newLink;
		} else {// not last link
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public boolean insertBefore(long key, long dData) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Link newLink = new Link(dData);
		if (current == first) {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		} else {
			newLink.next = current;
			current.previous.next = newLink;
			newLink.previous = current.previous;
			current.previous = newLink;
		}
		return true;
	}

	public Link deleteFirst() {
		Link temp = first;

		if (first.next == null) {// only one link
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Link deleteLast() {
		Link temp = last;

		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public Link deleteKey(long key) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}

	public void displayForward() {
		System.out.println("List (first--? last): ");
		Link current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("List (last--> first): ");
		Link current = last;
		while (current != null) {
			current.display();
			current = current.previous;
		}
		System.out.println();
	}

	public class Link {

		public long dData;
		public Link next;
		public Link previous;

		public Link(long dData) {
			this.dData = dData;
		}

		public void display() {
			System.out.print(dData + " ");
		}
	}
}