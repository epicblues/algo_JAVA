package com.thisisjava.chap11.array;

public class Member implements Comparable<Member>{

	String name;
	@Override
	public String toString() {
		return name;
	}
	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		
		
		
		return name.compareTo(o.name);
		
		
	}
	
	
	
	

}
