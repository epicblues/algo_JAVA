package com.thisisjava.chap15.practice;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "홍길동"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iter = set.iterator();
		
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}

}
