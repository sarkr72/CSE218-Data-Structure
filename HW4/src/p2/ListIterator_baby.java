package p2;

public class ListIterator_baby {

	private BabyLink current;
	private BabyLink previous;
	private BabyList ourList;

	public ListIterator_baby(BabyList list) {
		ourList = list;
		reset();// move the index to the beginning
	}

	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}

	public boolean atEnd() {
		return current.next == null;
	}

	public void nextLink() {
		previous = current;
		current = current.next;
	}

	public BabyLink getCurrent() {
		return current;
	}

	public String deleteCurrent() {
		String temp = current.dData;

		if (previous == null) {// if beginning of list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if (atEnd()) {
				reset();
			} else {
				current = current.next;
			}
		}
		return temp;
	}

	public void insertBefore(String dData) {// insert before the current link
		BabyLink newLink = new BabyLink(dData);

		if (previous == null) {// beginning of list or empty list
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else { // not beginning or not emoty
			newLink.next = current;
			previous.next = newLink;
			current = newLink;
		}
	}

	public void insertAfter(String dData) {// insert after the current link
		BabyLink newLink = new BabyLink(dData);
		if (ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
}