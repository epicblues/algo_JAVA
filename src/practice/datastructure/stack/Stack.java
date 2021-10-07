package practice.datastructure.stack;

public interface Stack<T>{
	boolean isEmpty();
	void push(T item);
	T pop();
	void delete();
	T peek();
}
