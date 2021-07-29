package com.thisisjava;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
		int result = safeAdd(200000000,200000000);
		System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println(e + "하여 정확하게 계산할 수가 없음");
		}
		
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left + right < Integer.MIN_VALUE) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right;
		
	}
}
