package com.thisisjava.chap14.quiz;

import java.util.function.*;

public class LambdaExample2 {

	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93),

	};

	private static double getAvg(ToIntFunction<Student> function) {
		int total = 0;
		int member = students.length;
		for (Student student : students) {
			total += function.applyAsInt(student);
		}

		return (double) total / member;
	}

	public static void main(String[] args) {
		System.out.printf("영어 점수 평균 : %.1f%n", getAvg(Student::getEnglishScore));
		System.out.printf("수학 점수 평균 : %.1f%n", getAvg(Student::getMathScore));

	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

	}
}
