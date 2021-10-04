package com.thisisjava.chap11.quiz;

import java.util.Calendar;
import java.util.HashMap;

public class StudentApp {

	public static void main(String[] args) {
		
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student,String> hashMap = new HashMap<Student,String>();
		
		hashMap.put(new Student("123456","김민성"), "95");
		
		String score = hashMap.get(new Student("123456", "김수구"));
		System.out.println("1번 학생의 총점 : " + score);
		
		
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		
		
	}

}
