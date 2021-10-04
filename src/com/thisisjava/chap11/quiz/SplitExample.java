package com.thisisjava.chap11.quiz;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름&패스워드";

		String[] strArr = str.split(",|&");
		for(String strSam : strArr) {
			System.out.println(strSam);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i ++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
