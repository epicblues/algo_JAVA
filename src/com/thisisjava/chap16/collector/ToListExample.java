package com.thisisjava.chap16.collector;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.thisisjava.chap16.collector.Student.Sex;

public class ToListExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Sex.MALE),
				new Student("김수애",6,Sex.FEMALE),
				new Student("신용권",10,Sex.MALE),
				new Student("박수미",6,Sex.FEMALE)
				);
		
		List<Student> maleList = totalList.stream()
				.filter(student -> student.getSex()==Sex.MALE)
				.collect(Collectors.toList());
		
		for(Student male : maleList) {
			System.out.println(male.getName());
		}

		HashSet<Student> femaleList = totalList.stream()
				.filter(student -> student.getSex()==Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		
		Iterator<Student> iter = femaleList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
	}

}
