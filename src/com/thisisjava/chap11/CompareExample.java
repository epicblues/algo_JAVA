package com.thisisjava.chap11;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student stu1 = new Student(1);
		Student stu2 = new Student(2);
		Student stu3 = new Student(3);

		int result1 = Objects.compare(stu1, stu2, new StudentComparator());
		int result2 =Objects.compare(stu3, stu1,new StudentComparator());
		
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(Objects.equals(new String[] {new String("yaho")},new String[] {new String("yaho")}));
	}

	
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
//			if (a.sno < b.sno) return -1;
//			else if (a.sno == b.sno) return 0;
//			else return 1;
			return Integer.compare(a.sno, b.sno);
			
		}
		
	}
}
