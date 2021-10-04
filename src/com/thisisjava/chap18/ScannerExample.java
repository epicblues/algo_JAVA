package com.thisisjava.chap18;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inputString = scan.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inputInt = scan.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력> ");
		double doubleInt = scan.nextDouble();
		System.out.println(doubleInt);
		
		
	}

}
