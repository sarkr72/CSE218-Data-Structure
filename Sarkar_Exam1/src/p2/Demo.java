package p2;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		ParentList list = new ParentList();
		getLinks(list);
	}

	public static void getLinks(ParentList list) {
		list.get().add(new ParentLink("A"));
		list.get().add(new ParentLink("B"));
		list.get().add(new ParentLink("C"));
		list.get().add(new ParentLink("D"));
		list.get().add(new ParentLink("E"));
		list.get().add(new ParentLink("F"));
		list.get().add(new ParentLink("G"));
		list.get().add(new ParentLink("H"));
		list.get().add(new ParentLink("I"));
		list.get().add(new ParentLink("J"));

		Iterator<ParentLink> iterator = list.get().iterator();
		while (iterator.hasNext()) {
			ParentLink link = iterator.next();
			ParentLink link2 = iterator.next();
			link2.display();
		}
	}
}
