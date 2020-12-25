package p2;

public class Demo {

	public static void main(String[] args) {
		GStackX<Book> gs = new GStackX<>(5);
		Book b1 = new Book("cse218", "123", 10.5);
		Book b2 = new Book("math", "234", 19.5);
		Book b3 = new Book("english102", "345", 110.5);
		Book b4 = new Book("chemistry", "456", 200.5);
		gs.push(b1);
		gs.push(b2);
		gs.push(b3);
		gs.push(b4);
			
		Book poppedBook = gs.pop();

		
		System.out.println(poppedBook);
	

	}

}
