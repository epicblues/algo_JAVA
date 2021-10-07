package practice.datastructure.stack;



public class ArrayStack implements Stack<Character> {

	private int top;
	private int stackSize;
	private char[] itemArray;
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[stackSize];
	}

	@Override
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public boolean isFull() {
		return top == stackSize -1;
	}

	@Override
	public void push(Character item) {
		if(isFull()) { System.out.println("Array Stack is full insert failed");return;}
		top++;
		itemArray[top] = item;
		
	}

	@Override
	public Character pop() {
		if(isEmpty()) {System.out.println("Array Stack is empty pop faield"); return 0;}
		return itemArray[top--]; // itemArray[top]을 리턴한 다음에 top의 필드값을 하나 줄인다.
	}

	@Override
	public void delete() {
		if(isEmpty()) {System.out.println("Array Stack is empty delete faield"); return;}
		top--;
	}

	@Override
	public Character peek() {
		if(isEmpty()) {
			if(isEmpty()) {System.out.println("Array Stack is empty peek failed"); return 0;}
		}
		return itemArray[top];
	}
	
	public void printStack() {
		System.out.print("StackList : ");
		for (int i = 0; i <= top; i++) {
			System.out.print(itemArray[i] + "/ ");
		}
		System.out.println("");
	}
	
	
}