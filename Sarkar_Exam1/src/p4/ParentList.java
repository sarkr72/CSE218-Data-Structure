package p4;

import java.util.LinkedList;


public class ParentList {
	private LinkedList<ParentLink> parentList;
	
	public ParentList() {
		parentList = new LinkedList<>();
	}
	
	public LinkedList<ParentLink> get() {
		return parentList;
	}
	
	public int size() {
		return parentList.size();
	}
}
