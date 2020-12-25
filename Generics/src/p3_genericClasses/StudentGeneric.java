package p3_genericClasses;

public class StudentGeneric<T, E> {

	private T object;
	private E object2;
	private T[] array;
	private E[] eArray;
	private int nElems;
	private int nElems2;

	@SuppressWarnings("unchecked")
	public StudentGeneric(int maxSize) {
		array = (T[]) new Object[maxSize];
		eArray = (E[]) new Object[maxSize];
		nElems2 = 0;
		nElems = 0;
	}

	public void insertT(T object) {
		array[nElems++] = object;
	}

	public void insertE(E object) {
		eArray[nElems2++] = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
		for (int j = 0; j < nElems2; j++) {
			System.out.println(eArray[j]);
		}
	}

	@Override
	public String toString() {
		return "StudentGeneric [object=" + object + "]";
	}

}
