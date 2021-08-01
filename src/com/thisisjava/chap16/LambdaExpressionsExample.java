package com.thisisjava.chap16;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
public class LambdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("신용권", 92));
		
		Stream<Student> stream = list.stream();
		
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}

}



class Student implements Comparable<Student>{
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	

	@Override
	public int compareTo(Student o) {
		return Integer.valueOf(score).compareTo(o.score);
	}

}