package com.thisisjava.chap14;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;

		for (Student student : list) {
			sum += function.applyAsInt(student);
		}

		return sum / list.size();

	}

	public static void main(String[] args) {

		double englishAvg = avg(student -> student.getEnglishScore());
		System.out.println("영어 평균 점수 :" + englishAvg);
		double mathAvg = avg(student -> student.getMathScore());
		System.out.println("영어 평균 점수 :" + mathAvg);

	}

}
