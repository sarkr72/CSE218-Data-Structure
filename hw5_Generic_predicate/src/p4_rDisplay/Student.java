package p4_rDisplay;

import java.io.Serializable;

public class Student extends Person implements Serializable{

	private String id;
	private String name;
	private double gpa;
//	public static int counter = 1;

	public Student(String name, double gpa) {
		super(name);
//		this.id = (counter++)+"";
		this.gpa = gpa;
	}

//	public String getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + "gpa: " + gpa+ "]";
	}

	
}
