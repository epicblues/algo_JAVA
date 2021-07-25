package com.thisisjava.chap11.array;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		// 얕은 복사후 비교 -> 배열 안의 참조 데이터는 복제되지 않고 똑같은 데이터를 참조한다.
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : " + 
		Arrays.equals(original, cloned1)); // 1차 배열의 항목값인 해쉬코드만 비교? {1,2}의 는 따로 생성됐기 떄문에?
		System.out.println("중첩 배열 항목값 비교 : " 
		+ Arrays.deepEquals(original, cloned1)); // 순수하게 중첩 배열의 항목값인 기본데이터형 1,2,3,4 각자 비교?
		
		// 깊은 복사 후 비교 -> 배열 안의 참조 데이터들도 복사한다. 값은 같지만 번지는 다른 데이터들을 다루고 있다.
		
		System.out.println("\n깊은 복제후 비교");
		int[][] cloned2 = new int[][] {Arrays.copyOf(original[0], original[0].length),Arrays.copyOf(original[1], original[1].length)};
		System.out.println("배열 번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + 
		Arrays.equals(original, cloned2)); // 1차 배열의 항목값인 해쉬코드만 비교? {1,2}의 는 따로 생성됐기 떄문에?
		System.out.println("중첩 배열 항목값 비교 : " 
		+ Arrays.deepEquals(original, cloned2)); // 순수하게 중첩 배열의 항목값인 기본데이터형 1,2,3,4 각자 비교?

	}

}
