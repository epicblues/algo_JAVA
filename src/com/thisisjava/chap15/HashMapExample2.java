package com.thisisjava.chap15;
import java.util.*;
public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<>();
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(2,"홍길동"), 96);
		
		System.out.println("총 entry 수 : " + map.size());
	}

}
