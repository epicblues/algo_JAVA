package com.thisisjava.chap11;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,9,0,0);
		System.out.println("시작일: " + startDateTime);
		
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3,31,18,0,0);
		System.out.println("종료일: " + endDateTime + "\n");
		
		//--------------------------------------------------------------
		if(startDateTime.isBefore(endDateTime)); {
			System.out.println("진행 중입니다." + "\n");
		} 
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);

	}

}
