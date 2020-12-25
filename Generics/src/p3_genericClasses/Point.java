package p3_genericClasses;

//public class Point<T, S> { // x, y
//	public class Point<T extends Number> { // upper bound constraining
//public class Point<T extends Comparable> {										//not String
public class Point<T> {
	
	private T x;
	private T y;
	
	public Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void display1(Point point) { // lower bound constraining
		System.out.println(point);
	}
//	public void display(Point<? super Integer> point) { // lower bound constraining
//		System.out.println(point);
//	}
	
	
//	public Point(T x, S y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public T getX() {
//		return x;
//	}
//
//	public void setX(T x) {
//		this.x = x;
//	}
//
//	public S getY() {
//		return y;
//	}
//
//	public void setY(S y) {
//		this.y = y;
//	}
//
//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
	
	
	
	
}
