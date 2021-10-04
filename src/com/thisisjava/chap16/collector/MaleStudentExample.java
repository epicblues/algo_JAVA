package com.thisisjava.chap16.collector;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

	public static void main(String[] args) {
		
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE),
				new Student("김수애",6,Student.Sex.FEMALE),
				new Student("신용권",10,Student.Sex.MALE),
				new Student("박수미",6,Student.Sex.FEMALE)
				);
		
		MaleStudent maleList = totalList.parallelStream()
				.filter(stu -> stu.getSex()==Student.Sex.MALE)
				.collect(()->new MaleStudent(), (malestu,stu)->malestu.accumulate(stu), (ms1,ms2)->ms1.combine(ms2));
		
		for(Student male : maleList.getList()) {
			System.out.println(male.getName());
		}
		
		MaleStudent maleList2 = totalList.stream()
				.filter(stu -> stu.getSex()==Student.Sex.MALE)
				.collect(MaleStudent::new, MaleStudent::accumulate,MaleStudent::combine);
		
		for(Student male : maleList2.getList()) {
			System.out.println(male.getName());
		}
	}

}
