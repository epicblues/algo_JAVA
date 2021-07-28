package com.thisisjava.chap15;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		System.out.println(treeSet.size());
		
		Iterator<Person> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			
			System.out.println("이름 : " + person.name + " \\ 나이 : " + person.age);
		}
	}

}
