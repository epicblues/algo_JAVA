package com.thisisjava.chap11;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(s1 == s2);
		System.out.println(Objects.deepEquals(s1, s2));
		System.out.println(Objects.equals(s1, s2));
		
		System.out.println(s1.equals(s2));
	}
	
	
	static class Student {
		int sno;
		String name;
		
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
		@Override
		public boolean equals(Object obj) {
			if(((Student)obj).hashCode() == hashCode()) {
				return true;
			} return false;
			
		}
	}
}
