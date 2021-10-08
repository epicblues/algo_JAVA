package practice.datastructure.graph;

public class LinkedQueue {
	QNode front;
	QNode rear;
	
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enQueue(int item) {
		QNode newNode = new QNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = rear.link;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("This Queue is Empty"); return 0;
		}
		int item = front.data;
		front = front.link;
		if(front == null) rear = null; // 큐에 데이터가 하나밖에 없었으므로 deQueue를 통해 완전히 지워짐 그런데 rear가 지워진 데이터를 가리킬 필요가 없다.
		return item;
	}
}
