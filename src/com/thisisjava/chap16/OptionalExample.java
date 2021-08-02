package com.thisisjava.chap16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
//		double avg = list
//				.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.getAsDouble();
		
		// 방법 1
		
		double avg = list
				.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		
		System.out.println(avg);
		

		// 방법 2
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if (optional.isEmpty()) {
			System.out.println(0.0);
		} else {
			optional.ifPresent(System.out::println);
		}
		
		// 방법 3
		
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a));
	}

}
