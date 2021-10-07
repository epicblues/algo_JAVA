package practice.datastructure.stack;

public class OptExp {
	private String exp;
	private int expSize;

	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack<Character> S = new LinkedStack<Character>();
		expSize = this.exp.length();
		for (int i = 0; i < expSize; i++) {
			char testCh = exp.charAt(i);
			switch (testCh) {
			case '(':
			case '{':
			case '[':
				S.push(testCh);
				break;
			case ')':
			case '}':
			case ']':
				if (S.isEmpty())
					return false;
				else {
					char openPair = S.pop();
					if(openPair == '(' && testCh != ')' 
							|| openPair == '{' && testCh != '}'
							|| openPair == '[' && testCh != ']')
					return false;
				}
			}
		}

		if(S.isEmpty()) return true;
		else return false;
	}
	
	public char[] toPostfix(String infix) {
		char testCh;
		exp = infix;
		int expSize = 10;
		int j = 0;
		char[] postFix = new char[expSize];
		LinkedStack<Character> S = new LinkedStack<Character>();
		for(int i = 0; i < expSize; i++) {
			testCh = exp.charAt(i);
			switch(testCh) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				postFix[j++] = testCh;
				break;
			case '*':
			case '-':
			case '+':
			case '/':
				S.push(testCh); break;
			case ')' : postFix[j++] = S.pop(); break;
			default : 
			}
		}
		postFix[j] = S.pop();
		
		return postFix;
	}
}
