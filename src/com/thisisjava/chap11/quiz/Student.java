package com.thisisjava.chap11.quiz;

public class Student {
	private String studentNum;
	private String name;

	public Student(String studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return studentNum.equals(other.studentNum) ? true : false;
		} else
		return false;
	}
}
