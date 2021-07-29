package com.thisisjava;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		a = b = c = 5; // 대입, 단항 연산자 '만' 오른쪽에서 왼쪽으로 진행된다.
		
		int x = -100;
		int result1 = +x; // x의 부호를 그대로 유지한다.
		int result2 = -x; // x의 부호를 반대로 바꾼다.
		
		System.out.println(result1);
		System.out.println(result2);

		
		short s = 100;
		short y = (short)+s; // 연산을 하면서 int 형식으로 변환되었다. 
		
	}
	
}
