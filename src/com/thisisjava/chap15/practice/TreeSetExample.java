package com.thisisjava.chap15.practice;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student2> set = new TreeSet<Student2>();
		set.add(new Student2("blue",96));
		set.add(new Student2("hong",86));
		set.add(new Student2("white",92));
		
		Student2 student= set.last();
		
		System.out.println("최고 점수 : " + student.score);
		System.out.println("최고 점수를 받은 아이디 : " + student.id);

	}

}
