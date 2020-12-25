package p1;

public class Demo {

	public static void main(String[] args) {
		GStack<String> gs = new GStack<>(10);
		gs.pushAll(new String[] { "hi", "world", "!" });
		Object[] a = gs.popAll();
		for (Object s : a) {
			System.out.print(s + " ");
		}
	}

}
