package practice.datastructure.queue;

public class LinkedQueue<T> implements Queue<T> {
	
	QNode<T> front;
	QNode<T> rear;
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public boolean isEmpty() {
		
		return front == null;
	}

	@Override
	public void enQueue(T item) {
		QNode<T> newNode = new QNode<T>();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		System.out.println("enQueued Item : " + item);
		
	}

	@Override
	public T deQueue() {
		if(isEmpty()) {System.out.println("This Queue is Empty"); return null;}
		QNode<T> outNode = front;
		front = front.link;
		if(isEmpty()) rear = null;
		return outNode.data;
	}

	@Override
	public void delete() {
		if(isEmpty()) {System.out.println("This Queue is Empty"); return;}
		
		front = front.link;
		if(isEmpty()) rear = null;
		
	}

	@Override
	public T peek() {
		if(isEmpty()) {System.out.println("This Queue is Empty"); return null;}
		
		return front.data;
	}
	
	public void printQueue() {
		if(isEmpty()) {System.out.println("This Queue is Empty"); return;}
		QNode<T> temp = front;
		while(temp != null) {
			System.out.print(temp.data + " / ");
			temp = temp.link;
		}
		System.out.println("");
	}

}
