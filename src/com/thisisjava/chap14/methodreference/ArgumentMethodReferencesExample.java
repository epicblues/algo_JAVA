package com.thisisjava.chap14.methodreference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String,String> function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		
		printResult (function.applyAsInt("JAVA8", "java8"));
		
		function = String :: compareToIgnoreCase;
		
		printResult (function.applyAsInt("JAVA8", "java8"));
		

	}
	
	
	public static void printResult(int index) {
		if (index == 0) System.out.println("동일한 문자열입니다.");
		else if (index == -1) System.out.println("사전순으로 배열된 문자열입니다.");
		else System.out.println("사전순으로 역배열된 문자열입니다.");
	}
}
