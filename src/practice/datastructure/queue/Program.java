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
		
		ArrayCQueue<String> cqueue = new ArrayCQueue<String>(5);
		cqueue.enQueue("baka");
		cqueue.enQueue("hello");
		cqueue.enQueue("world");
		cqueue.enQueue("kekew");
		cqueue.enQueue("muyaho");
		cqueue.printQueue();
		cqueue.deQueue();
		cqueue.deQueue();
		cqueue.printQueue();
		
	}

}
