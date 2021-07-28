package com.thisisjava.chap15.practice;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(studentNum).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return Integer.valueOf(studentNum).equals(((Student)obj).studentNum);
		}
		return super.equals(obj);
	}
}
