package com.thisisjava.chap11.quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String id = sc.nextLine();
		
		String regExp = "[a-zA-Z]\\w{7,11}";
		
		if (Pattern.matches(regExp, id)) {
			System.out.println("조건에 일치합니다.");
		} else {
			System.out.println("조건과 어긋납니다.");
		}
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);
	}
	
	
}
