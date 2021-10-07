package practice.datastructure.queue;

public class DQueue<T> {
	DQNode<T> front;
	DQNode<T> rear;

	public DQueue() {
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void insertFront(T data) {

		DQNode<T> newNode = new DQNode<T>();
		newNode.data = data;
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			front.lLink = newNode;
			newNode.rLink = front;
			newNode.lLink = null;
			front = newNode;
		}
		System.out.println("Inserted Data : " + data);
	}

	public void insertRear(T data) {
		DQNode<T> newNode = new DQNode<T>();
		newNode.data = data;
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.rLink = newNode;
			newNode.lLink = rear;
			newNode.rLink = null;
			rear = newNode;
		}
		System.out.println("Inserted Data : " + data);
	}

	public T deleteFront() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return null;
		}
		T item = front.data;
		front = front.rLink;
		if (isEmpty()) {
			rear = null;
			return null;
		}
		front.lLink = null;
		return item;
	}

	public T deleteRear() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return null;
		}
		T item = rear.data;
		if (rear.lLink == null) {
			rear = null;
			front = null;
		}
		rear = rear.lLink;
		rear.rLink = null;
		return item;
	}

	public void removeFront() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return;
		}

		front = front.rLink;
		if (isEmpty()) {
			rear = null;
			return;
		}
		front.lLink = null;
		return;
	}

	public void removeRear() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return;
		}

		if (rear.lLink == null) {
			rear = null;
			front = null;
		}
		rear = rear.lLink;
		rear.rLink = null;
		return;
	}
	
	public T peekFront() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return null;
		}
		return front.data;
	}
	
	public T peekRear() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return null;
		}
		return rear.data;
	}
	
	
	public void printDQueue() {
		if (isEmpty()) {
			System.out.println("This deque is empty!");
			return;
		}
		DQNode<T> temp = front;
		while(temp != null) {
			System.out.print(temp.data + " / ");
			temp = temp.rLink;
		}
		
		System.out.println();
	}
}
