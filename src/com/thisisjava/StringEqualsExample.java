package com.thisisjava;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김민성";
		String strVar2 = "김민성";
		String strVar3 = new String("김민성"); // 참조하는 주소가 다르다.
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3); // 주소값이 다르므로 => 변수가 다르다.
		System.out.println(strVar1.equals(strVar3)); // 주소가 아닌 실제 문자열 비교.
		
		ConditionalOperationalExample(85);
		
		
		
		
	}
	
	
	
	public static void ConditionalOperationalExample (int score) {
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(grade);
	
	}
	
	
	public static void sample1(int quantity) {
		double discount;
		
		
		if (1000< quantity) {
			discount = 0.10;
		}
		else if (100 < quantity) {
			discount = 0.05;
		}
		else if (10< quantity) {
			discount = 0.025;
		}
		else {
			discount = 0;
		}
		
	}
	
	
	
}
