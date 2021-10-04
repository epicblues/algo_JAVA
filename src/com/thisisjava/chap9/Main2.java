package com.thisisjava.chap9;

public class Main2 {
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.method1(500);
	}
}

class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
//		localVariable = 100; 
		class Inner {
			public void method() {
				int result = arg + localVariable; // 자바 11에서 작동 메소드
				//가 끝나서 메모리에서 사라져도 클래스의 객체는 여전히 남아 있는다.
				// 이 때 메소드에서 정의한 변수들 중 final 변수는 inner 객체에
				// 그대로 복제되어서 살아남아 있다? 즉 method1의 localVariable은 없어진지 오래?
				System.out.println(result);
			}
		}
		Inner in = new Inner();
		in.method();
		
	}
	

	
	
	public void method2(int arg) {
		int localVariable = 1;
		arg = 100;
		localVariable = 100;
		
		class Inner {
			public void method() {
//				int result = arg + localVariable; // 자바 11에서는 작동 안됨.
			}
		}
	}
}


