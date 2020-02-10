package Assignment;

public class Queue {

	private int front;
	private int rear;
	private int data[];
	private int size;
	
	public Queue() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int front() throws QueueEmptyException{
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	void enqueue(int element) throws QueueFullException{
		if(size==data.length) {
			throw new QueueFullException();
		}
		if(size==0) {
			front=0;
		}
		size++;
		rear++;
		if(rear==data.length) {
			rear=0;
		}
		data[rear]=element;
	}
	int dequeue() throws QueueEmptyException{
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front++;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
}
