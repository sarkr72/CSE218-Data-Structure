package p4_rDisplay;

import java.io.Serializable;

public class Author extends Person implements Serializable{

	private String name;
//	private String lastName;
	public Author(String name) {
		super(name);
		this.name = name;
//		this.firstName = firstName;
//		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	@Override
	public String toString() {
		return "Author [firstName=" + name + "]";
	}
}
