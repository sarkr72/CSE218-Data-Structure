package p4_rDisplay;

import java.io.Serializable;

public abstract class Person implements Serializable{

	private String name;
	private String id;
	private static int idCounter = 1;
	
	public Person(String name) {
		this.name = name;
//		id = String.valueOf(idCounter++);
		id = String.format("%08d", idCounter++);
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name: " + name + " Id: "+ id + "]";
	}
}
