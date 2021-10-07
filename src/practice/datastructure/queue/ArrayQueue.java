package practice.datastructure.queue;

public class ArrayQueue<T> implements Queue<T> {

	private int front;
	private int rear;
	private int queueSize;
	private T itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = (T[])new Object[queueSize];
	}
	
	@Override
	public boolean isEmpty() {
		
		return front == rear;
	}

	public boolean isFull() {
		return rear == queueSize - 1;
	}
	
	@Override
	public void enQueue(T item) {
		if(isFull()) {System.out.println("This Queue is Full"); return;}
		
		itemArray[++rear] = item;
		System.out.println("Inserted Item" + item);
	}

	@Override
	public T deQueue() {
		if(isEmpty()) {System.out.println("This Queue is empty"); return null;}
		
		return itemArray[++front];
	}

	@Override
	public void delete() {
		if(isEmpty()) {System.out.println("This Queue is empty"); return;}
		front++;
	}

	@Override
	public T peek() {
		if(isEmpty()) {System.out.println("This Queue is empty"); return null;}
		return itemArray[front + 1];
	}
	
	public void printQueue() {
		if(isEmpty()) {System.out.println("This Queue is empty"); return;}
		for(int i = front + 1; i <= rear; i++ ) {
			System.out.print(itemArray[i] + " / ");
		}
		System.out.println("");
	}
	
}
