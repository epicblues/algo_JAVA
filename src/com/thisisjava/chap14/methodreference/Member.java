package com.thisisjava.chap14.methodreference;

public class Member {
	private String name;
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id) 실행");
	}
	
	public Member(String name, String id) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String name, String id) 실행");
	}
}
