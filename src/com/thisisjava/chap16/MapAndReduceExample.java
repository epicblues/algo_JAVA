package com.thisisjava.chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30)

		);

		Stream<Student> stream1 = list.parallelStream();
		double avg = stream1.mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균 점수 : " + avg);

	}

}
