package com.thisisjava.chap11.quiz;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	
	public String toString() {
		return String.format("%s: %s", id,name);
	}
	
}
