package practice.datastructure.graph;

public class LinkedStack {
	StackNode top;
	
	public LinkedStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int data) {
		StackNode newNode = new StackNode();
		newNode.data = data;
		
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("This Stack is Empty!");
			return 0;
		}
		int item = top.data;
		top = top.link;
		return item;
	}
}
