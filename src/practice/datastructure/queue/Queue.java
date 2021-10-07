package practice.datastructure.queue;

public interface Queue<T> {
	boolean isEmpty();
	void enQueue (T item);
	T deQueue();
	void delete();
	T peek();
}
