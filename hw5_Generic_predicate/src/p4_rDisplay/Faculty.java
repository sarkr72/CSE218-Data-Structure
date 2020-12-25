package p4_rDisplay;

import java.io.Serializable;

public class Faculty extends Person implements Serializable{

	private String name;
	private double salary;
	public static int counter;

	public Faculty(String name, double salary) {
		super(name);
		this.name = name;
		this.salary = salary;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [" + super.toString() + "salary" + salary+ "]";
	}

}
