package com.thisisjava.chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println("이름 : " + iter.next());
		}

		Stream<String> stream = list.stream();
		stream.forEach(str -> System.out.println("이름 : " + str));

	}

}
