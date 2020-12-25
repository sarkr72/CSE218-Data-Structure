package p3_genericClasses;

public class Demo {

	public static void main(String[] args) {

//		Point<Double> p1 = new Point<>(1.5, 2.6);
//		 Point<Integer, Double> p1 = new Point<>(1, 2.5);
//		 Point<Integer, Integer> p2 = new Point<>(1, 2);
//		 Point<Student, Cat> p3 = new Point<>(student, cat);
//		Point<Double> p1 = new Point<>(1.3, 2.3);//not String
//		Point<String> p2 = new Point<>("s", "g");// comparable includes string
//		p2.display(p2);

		StudentGeneric<Student, Author> generic = new StudentGeneric<>(100);
		generic.insertT(new Student("chen", "123"));
		generic.insertT(new Student("Li", "34"));
		generic.insertT(new Student("gfes", "433"));
		generic.insertE(new Author("abc", "news"));
		generic.display();
	}
}
