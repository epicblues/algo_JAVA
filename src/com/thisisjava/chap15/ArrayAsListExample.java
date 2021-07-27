package com.thisisjava.chap15;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		
		for(String name: list1) {
			System.out.println(name);
		}
		
		
		List<Integer> list2 = Arrays.asList(new Integer[] {1,2,3});
		
		for(Integer name: list2) {
			System.out.println(name);
		}
		
		
	}

}
