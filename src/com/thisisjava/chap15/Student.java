package com.thisisjava.chap15;

public class Student {
	private int sno;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student o = (Student)obj;
			return sno == o.sno && name.equals(o.name);
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
