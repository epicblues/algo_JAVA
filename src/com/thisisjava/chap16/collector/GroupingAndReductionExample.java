package com.thisisjava.chap16.collector;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE),
				new Student("김수애",12,Student.Sex.FEMALE),
				new Student("신용권",10,Student.Sex.MALE),
				new Student("박수미",12,Student.Sex.FEMALE)
				);
		
		// 성별로 평균 점수를 저장하는 Map 얻기.
		
		Map<Student.Sex, Double> sexAvgMap = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,Collectors.averagingDouble(Student::getScore)));
		
//		Iterator<Map.Entry<Student.Sex, Double>> iter = sexAvgMap.entrySet().iterator();
//		
//		while(iter.hasNext()) {
//			Map.Entry<Student.Sex, Double> entry = iter.next();
//			System.out.println(entry.getKey() + " 평균 점수 : " + entry.getValue());
//		}
		
		System.out.println("남학생" + " 평균 점수 : " +sexAvgMap.get(Student.Sex.MALE));
		System.out.println("여학생" + " 평균 점수 : " +sexAvgMap.get(Student.Sex.FEMALE));
		
		Map<Student.Sex, String> nameBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,Collectors.mapping(Student::getName,Collectors.joining(","))));
		
		System.out.println("남학생" + " 이름 : " +nameBySex.get(Student.Sex.MALE));
		System.out.println("여학생" + " 이름 : " +nameBySex.get(Student.Sex.FEMALE));
	}

}
