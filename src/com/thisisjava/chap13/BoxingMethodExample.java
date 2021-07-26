package com.thisisjava.chap13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<String> box1 = Util.boxing("150");
		System.out.println(box1.get());
	}

}
