package com.thisisjava.chap11.string;

import java.io.*;

public class StringBuilderExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("StringBuilder 문자 입력 : ");
		StringBuilder sb = new StringBuilder(br.readLine());
		
		System.out.println(sb);
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(4, "나마스테");
		System.out.println(sb);
		
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		sb.delete(4, 10);
		System.out.println(sb);
		
		
	}

}
