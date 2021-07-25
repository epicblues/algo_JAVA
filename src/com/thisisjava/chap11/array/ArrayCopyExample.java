package com.thisisjava.chap11.array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = "JAVA".toCharArray();
		
		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// 방법2
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// 방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr4, 1, 2);
		System.out.println(Arrays.toString(arr4));
	}

}
