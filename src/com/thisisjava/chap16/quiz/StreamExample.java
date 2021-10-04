package com.thisisjava.chap16.quiz;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a java book", "Lambda Exrpession",
				"Java8 supports lambda expressions"

		);
		
		list.stream().filter(str -> str.toLowerCase().contains("java")).forEach(System.out::println);
	}

}
