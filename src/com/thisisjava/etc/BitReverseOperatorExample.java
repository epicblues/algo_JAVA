package com.thisisjava.etc;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1; // -10 부호가 다른 숫자를 구하고 싶을 때 사용하는 연산?
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1; // 10 부호가 다른 숫자를 구하고 싶을 때 사용하는 연산?
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
		
		double result6 = 5.0/2;
		System.out.println(result6);
		
	}
	
	private static String toBinaryString(int num) {
		String binStr = Integer.toBinaryString(num);
		while(binStr.length() < 32) {
			binStr = "0" + binStr;
		}
		return binStr;
	}

}
