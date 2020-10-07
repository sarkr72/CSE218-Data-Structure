package p1;

import java.util.LinkedList;

import p1.ParentLink;

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
