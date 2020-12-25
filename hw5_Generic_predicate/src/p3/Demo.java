package p3;

import p2_predicate.GBag;

public class Demo {

	public static void main(String[] args) {
		
		GBag<Student> gb = new GBag<>(1000);
		gb.insertT(new Student("chris gayle", 4.2));
		
		gb.insertT(new Student("john doe", 2.7));
		gb.insertT(new Student("john doe", 4.2));
		gb.insertT(new Student("steve smith", 1.3));
		
		gb.insertT(new Student("gggggg", 2.2));
		
		gb.display();
		Object[] arr = gb.findNumberObject(s->s.getGpa() == 4.2);
		for(Object a: arr) {
			System.out.println("found: "+a);
		}
		
		Object[] arr1 = gb.removeNumberObject(s->s.getGpa() == 4.2);
		for(Object a: arr1) {
			System.out.println("delete: " + a);
		}

		gb.display();
		
	}

}
