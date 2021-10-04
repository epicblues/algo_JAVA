package com.thisisjava.chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	static class Student {
		private String name;
		private String sex;
		private int score;

		public Student(String name, String sex, int score) {
			super();
			this.name = name;
			this.sex = sex;
			this.score = score;
		}

		public String getSex() {
			return sex;
		}

		public int getScore() {
			return score;
		}
	}

	private static List<PredicateExample.Student> list = new ArrayList<>();
	
	
	private static double avg(Predicate<PredicateExample.Student> predicate) {
		int total = 0;
		int members = 0;
		for(PredicateExample.Student student : list) {
			if (predicate.test(student)) {
				total += student.getScore();
				members++;
			}
		}
		return (double)total / members;
	}
	
	public static void main(String[] args) {
		list.add(new PredicateExample.Student("홍길동", "남자", 90));
		list.add(new PredicateExample.Student("김순희", "여자", 90));
		list.add(new PredicateExample.Student("감자바", "남자", 95));
		list.add(new PredicateExample.Student("박한나", "여자", 92));
		
		System.out.println("남자 평균 점수 : " + avg(student -> student.getSex().equals("남자")));
		System.out.println("여자 평균 점수 : " + avg(student -> student.getSex().equals("여자")));
	}

}
