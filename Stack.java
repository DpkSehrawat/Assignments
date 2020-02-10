package Assignment;

public class Stack{

	
	private int size;
	private int arr[];

	public Stack() {
		size=0;
		arr=new int[10];
	}
	public boolean isEmpty() {
		return size == 0;
	}

	public int Size() {
		return size;
	}

	public void push(int x) throws StackFullException {
		if (size == 10) {
		StackFullException e= new StackFullException();
		throw e;
		} else {
			arr[size++] = x;
		}

	}

	public int pop() throws StackEmptyException {
		if (size == 0) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		} else {
			int m = arr[size - 1];
			size--;
			return m;
		}
	}

	public int top() {
		return arr[size - 1];
	}

}
