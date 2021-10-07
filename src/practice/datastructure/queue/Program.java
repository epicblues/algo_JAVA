package practice.datastructure.queue;

public class Program {

	public static void main(String[] args) {
//		ArrayQueue<String> queue = new ArrayQueue<String>(5);
//		String output = null;
//		queue.enQueue("hello");
//		queue.enQueue("baka");
//		queue.enQueue("namgoong");
//		queue.enQueue("namgoong");
//		queue.enQueue("namgoong");
//		queue.enQueue("namgoong");
//		
//		queue.printQueue();
//		output = queue.deQueue();
//		System.out.println(output);
//		queue.printQueue();
		
//		ArrayCQueue<String> cqueue = new ArrayCQueue<String>(5);
//		cqueue.enQueue("baka");
//		cqueue.enQueue("hello");
//		cqueue.enQueue("world");
//		cqueue.enQueue("kekew");
//		cqueue.enQueue("muyaho");
//		cqueue.printQueue();
//		cqueue.deQueue();
//		cqueue.deQueue();
//		cqueue.printQueue();
//		
//		LinkedQueue<String> queue = new LinkedQueue<String>();
//		queue.enQueue("hello");
//		queue.enQueue("hello1");
//		queue.enQueue("hello2");
//		queue.enQueue("hello3");
//		queue.printQueue();
//		queue.deQueue();
//		System.out.println(queue.deQueue());
//		queue.printQueue();
		DQueue<Integer> queue = new DQueue<Integer>();
		queue.insertFront(3);
		queue.insertFront(4);
		queue.insertFront(5);
		queue.insertFront(6);
		queue.insertRear(1);
		queue.insertRear(2);
		queue.printDQueue();
		queue.deleteFront();
		queue.deleteRear();
		queue.printDQueue();
	}

}
