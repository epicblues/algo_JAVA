package practice.datastructure.stack;

public class LinkedStack<T> implements Stack<T>{

	private StackNode<T> top;
	
	
	@Override
	public boolean isEmpty() {
		
		return top == null;
	}

	@Override
	public void push(T item) {
		StackNode<T> newNode = new StackNode<T>();
		newNode.data = item;
		if(isEmpty()) {top = newNode;}
		else {
			newNode.link = top;
			top = newNode;
		}
		
		System.out.println("insert item : " + item);
		
	}

	@Override
	public T pop() {
		if(isEmpty()) {System.out.println("Stack is Empty"); return null;}
		
		T poppedData = top.data;
		top = top.link;
		return poppedData;
	}

	@Override
	public void delete() {
		if(isEmpty()) {System.out.println("Stack is Empty"); return;}
		top = top.link;
		
	}

	@Override
	public T peek() {
		if(isEmpty()) {System.out.println("Stack is Empty"); return null;}
		
		return top.data;
	}
	
	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		StackNode<T> temp = top;
		System.out.print("Stack : " + temp.data + ", ");
		while(temp.link != null) {
			temp = temp.link;
			System.out.print(temp.data + ", ");
		}
		System.out.println("");
		
		
		
	}

}
