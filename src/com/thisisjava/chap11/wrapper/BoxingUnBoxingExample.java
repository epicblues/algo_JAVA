package com.thisisjava.chap11.wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		Integer obj3 = Integer.valueOf(0xFF);
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(value3);
		

	}

}
