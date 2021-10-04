package com.thisisjava.chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		inputList1.stream()
				.flatMap(data -> Arrays.stream(data.split(" ")))
				.forEach(System.out::println);
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60" );
		
		inputList2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(", ");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i< strArr.length;i++) {
					intArr[i] = Integer.parseInt(strArr[i]);
				}
				
				return Arrays.stream(intArr);
			})
			.forEach(System.out::println);
			
				
				

	}

}
