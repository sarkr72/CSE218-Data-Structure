package p4_rDisplay;

public class Demo {

	public static void main(String[] args) {
	
		GBag1<Faculty> gb = new GBag1<>(100);
//		GBag1<TextBook> gb2 = new GBag1<>(500);
		gb.insertT(new Faculty("name4", 100));
		gb.insertT(new Faculty("name4", 100));
		gb.insertT(new Faculty("name", 20.5));
		
		gb.insertT(new Faculty("name2", 15.0));
		gb.insertT(new Faculty("name3", 202.5));
		
//		Person[] arr = gb.findNumberObject(s->s.getSalary() == 100);
//		for(Object a: arr) {
//			System.out.println("found: "+a);
//		}
//		
//		Object[] arr1 = gb.removeNumberObject(s->s.getSalary() == 100);
//		for(Object a: arr1) {
//			System.out.println("delete: " + a);
//		}
//		gb.display();
//		gb.rDisplay(0);
//		Faculty f1 = new Faculty("name3", 202.5);
		
//		gb.insertT(f1);
//		System.out.println(gb.rContains2(f -> f.getName().equals(f1.getName()) && f.getSalary() == f1.getSalary()));
		
//		System.out.println(gb.rContains1(f1)); //check memory address
		
//		System.out.println(gb.reverse("ABCDEF"));
		
//		char[] arr = "hello world".toCharArray();
//		System.out.println(gb.occurence(arr, 'l'));
	}
}
