package p4;

public class Demo {

	public static void main(String[] args) {
	/*
	 * 1. T is not a class. It is a place holder. 
	 * 		so it has no constructor to creat object.
	 * 
	 * 2. can not create an array of objects from generic class.
	 * 		ArrayList<String>[] ar = new ArrayList<>[100];
	 * 
	 * 3. A generic class's type parameter (T) can not be the type of a static field.
	 * 		it can not be referenced to in a static method.
	 * 
	 * 			public Class MyClass <T>{
	 * 				private static T x;
	 * 
	 * 			public Class MyClass <T>{
	 * 				public Static void doThis(){
	 * 				T x;
	 * 			}
	 * 
	 * 4. can not make an exception class generic.
	 * 
	 * Erasure: replace the type parameters (i.e. place holders such as T,S, E) with
	 * actual data type.
	 */
	}

}
