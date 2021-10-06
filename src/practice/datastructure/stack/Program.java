package practice.datastructure.stack;

public class Program {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.push('y');
		stack.push('3');
		stack.push('5');
		stack.push('2');
		stack.push('1');
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.push('f');
		stack.push('d');
		stack.printStack();

	}

}
