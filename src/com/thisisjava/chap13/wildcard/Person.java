package com.thisisjava.chap13.wildcard;

public class Person {
	private String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Worker extends Person {

	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}