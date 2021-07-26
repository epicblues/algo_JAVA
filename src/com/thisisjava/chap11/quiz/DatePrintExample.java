package com.thisisjava.chap11.quiz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("YYYY년 MM월 dd일 E요일 hh시 mm분");
		
		System.out.println(format.format(now));
		

	}

}
