package practice.datastructure.stack;

public class OptExp2 {
	private String exp;
	
	public int evalPostfix(String postfix) {
		exp = postfix;
		int opr1, opr2, value;
		char testCh;
		LinkedStack<Integer> S = new LinkedStack<Integer>();;
		
		for(int i = 0; i < exp.length(); i++) {
			testCh= exp.charAt(i);
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
				S.push(testCh - '0');
				break;
			case '+':
			case '-':
			case '/':
			case '*':
				opr2 = S.pop();
				opr1 = S.pop();
				if(testCh == '+') S.push(opr1 + opr2);
				else if (testCh == '-') S.push(opr1 - opr2);
				else if (testCh == '/') S.push(opr1 / opr2);
				else if (testCh == '*') S.push(opr1 * opr2);
				break;
			default :
			}
			
		}
		
		
		
		
		return S.pop();
	}
}
