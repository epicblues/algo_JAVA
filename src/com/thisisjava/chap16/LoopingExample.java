package com.thisisjava.chap16;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };

		System.out.println("peek()을 마지막에 호출한 경우");
		Arrays.stream(intArr)
			.filter(n -> n % 2 == 0)
			.peek(System.out::println); // 동작하지 않음
		
		System.out.println("최종 처리 메소드를 호출한 경우");
		
		Arrays.stream(intArr)
			.filter(n -> n % 2 == 0)
			.peek(System.out::println) // 동작함
			.sum();					   // 최종 메소드
		
		System.out.println("forEach메소드를 호출한 경우");
		Arrays.stream(intArr)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println); // 최종 메소드로 동작
			
	
			
		
		
	}

}
