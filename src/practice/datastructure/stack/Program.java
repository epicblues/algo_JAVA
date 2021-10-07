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
		
		LinkedStack linkStack = new LinkedStack();
		linkStack.push('a');
		linkStack.push('b');
		linkStack.push('c');
		linkStack.pop();
		
		linkStack.printStack();
		linkStack.push('u');
		
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림");
		
		System.out.printf("\n후위 표기기식");
		postfix= opt.toPostfix(exp);
		System.out.println(postfix);
		
		
		OptExp2 opt2 = new OptExp2();
		int result;
		exp = "35*62/-";
		result = opt2.evalPostfix(exp);
		System.out.println("후위 표기식 : " + exp);
		System.out.println("연산 결과 : " + result);
	}

}
