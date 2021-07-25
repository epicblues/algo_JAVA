package com.thisisjava.chap11.string;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-2406-5216";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) System.out.println("정규식과 일치합니다.");
		else System.out.println("정규식과 일치하지 않습니다.");
		
		regExp = "\\w{4,5}@\\w{5}\\.\\w{3}(\\.\\w{8})?";
		data = "angel@naver.com.hedgehog";
		
		result = Pattern.matches(regExp, data);
		
		if(result) System.out.println("정규식과 일치합니다.");
		else System.out.println("정규식과 일치하지 않습니다.");
	}

}
