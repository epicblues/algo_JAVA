package com.thisisjava.chap16;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };

		boolean result = Arrays.stream(intArr).allMatch(n -> n % 2 == 0);
		System.out.println("모두 2의 배수인가? : " + result);

		result = Arrays.stream(intArr).peek(System.out::println).anyMatch(n -> n % 3 == 0);
		System.out.println("어떤 요소는 3의 배수인가? : " + result);

		result = Arrays.stream(intArr).noneMatch(n -> n % 3 == 0);
		System.out.println("모두 3의 배수가 아닌가? : " + result);

	}

}
