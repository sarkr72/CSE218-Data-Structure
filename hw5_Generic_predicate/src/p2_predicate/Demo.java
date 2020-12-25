package p2_predicate;

public class Demo {

	public static void main(String[] args) {
		NumberBag<Integer> nb = new NumberBag<>(10000);
		
		nb.insertT(20);
		nb.insertT(30);
		
		nb.insertT(50);
		nb.insertT(60);
		nb.insertT(45);
		nb.insertT(10);
		nb.insertT(10);
		Number[] arr = nb.removeNumberObject(10);
//		Number[] arr2 = nb.findNumberObject(10);
		for(Number a: arr) {
			System.out.println(a);
		}
		System.out.println("display");
		nb.display();
//		GBag<String> gb = new GBag<>(10000);
////		gb.insertT(10);
//		gb.insertT("name");
////		gb.insertT(10.5);
//		
//		gb.insertT("cse");
//		gb.insertT("name");
//		gb.insertT("rinku");
//		
//		gb.insertT("dur");
//		
////		Object[] arr = gb.findNumberObject(s->s.equals("name"));
//		Object[] arr = gb.removeNumberObject(s->s.equals("name"));
//		for(Object a: arr) {
//			System.out.println(a);
//		}
//		System.out.println("display");
//		gb.display();
	}

}
