package com.thisisjava.chap16.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class StreamExample4 {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		Map<String,List<String>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(Member::getJob,Collectors.mapping(Member::getName, Collectors.toList())));
		
		System.out.print("[개발자] ");
		groupingMap.get("개발자").forEach(name -> System.out.print(name + " "));
		
		System.out.print("[디자이너] ");
		groupingMap.get("디자이너").forEach(name -> System.out.print(name + " "));
	}
	
	static class Member {
		private String name;
		private String job;

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

	}
}
