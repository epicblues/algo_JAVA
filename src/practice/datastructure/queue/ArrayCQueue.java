package practice.datastructure.queue;

public class ArrayCQueue<T> implements Queue<T> {

	private int front;
	private int rear;
	private int queueSize;
	private T itemArray[];

	public ArrayCQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = (T[]) new Object[queueSize];
	}

	@Override
	public boolean isEmpty() {

		return front == rear;
	}

	public boolean isFull() {
		return (rear + 1) % queueSize == front;
	}

	@Override
	public void enQueue(T item) {
		if (isFull()) {
			System.out.println("This Queue is Full");
			return;
		}

		rear = (rear + 1) % queueSize;
		itemArray[rear] = item;
		System.out.println("Inserted Item : " + item);

	}

	@Override
	public T deQueue() {
		if (isEmpty()) {
			System.out.println("This Queue is Empty");
			return null;
		}
		front = (front + 1) % queueSize;
		return itemArray[front];
	}

	@Override
	public void delete() {
		if (isEmpty()) {
			System.out.println("This Queue is Empty");
			return;
		}
		front = (front + 1) % queueSize;

	}

	@Override
	public T peek() {
		if (isEmpty()) {
			System.out.println("This Queue is Empty");
			return null;
		}
		return itemArray[(front + 1) % this.queueSize];
	}

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("This Queue is Empty");
			return;
		}
		int temp = front;
		while (temp != rear) {
			temp = (temp + 1) % queueSize;
			System.out.print(itemArray[temp] + "/");
		}
		System.out.println("");
	}

}
