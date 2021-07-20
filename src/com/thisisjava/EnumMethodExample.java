package com.thisisjava;

import java.util.Calendar;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name(); 
		System.out.println(name); // 그냥 today를 출력시는 것은 안 되나?
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.valueOf("MONDAY");
		Week day2 = Week.valueOf("WEDNESDAY");
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
