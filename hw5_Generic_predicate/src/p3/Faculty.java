package p3;

public class Faculty {

	private String id;
	private String name;
	private double salary;
	public static int counter;

	public Faculty(String name, double salary) {
		super();
		this.id = counter + "";
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
