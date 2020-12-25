package p1;


import java.util.TreeSet;

public class APIDemo {

	public static void main(String[] args) {
		
		TreeSet<Account> tree = new TreeSet<>();
		tree.add(new Account("A", "15"));
		tree.add(new Account("D", "5"));
		tree.add(new Account("B", "3"));
		tree.add(new Account("J", "7"));
		tree.add(new Account("F", "6"));
		tree.add(new Account("A", "15"));

		for(Account t: tree) {
			if(t.getPassword().compareTo("7") == 0) {
				System.out.println(t);
			}
		}
		
//		Iterator<String> tt = tre.descendingIterator();
//		while(tt.hasNext()) {
//			System.out.println(tt.next()); //reverse order
//		}
//		System.out.println(tree.toString());
//		
//		for(String s: tree) {
//			System.out.print(s + " ");
//		}
//		System.out.println(tree.contains("V"));
		
//		TreeMap<String, Account> theMap = new TreeMap<>();
//		theMap.put("a", new Account("a", "Rinku12$2"));
////		theMap.put("Rinku", 10);
////		theMap.put("D", 51);
////		theMap.put("T", 141);
////		theMap.put("U", 44);
////		theMap.put("W", 125);
////		theMap.put("Z", 100);
////		theMap.put("R", 110);
//		
////		System.out.println(theMap.get("a").getPassword().compareTo("Rinku12") == 0);
//		
//		System.out.println(theMap.containsKey("a"));
//		System.out.println(theMap.descendingKeySet());
//		System.out.println(theMap.toString());
//		while() {
//		System.out.println(theMap.firstEntry());
//		System.out.println(theMap.lastEntry());
//		System.out.println(theMap.firstKey());
//		}
	}

}
