package com.thisisjava.chap13;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("bullshit");
		System.out.println(box.get());

		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(12345);
		System.out.println(box2.get());
	}

}
