package com.thisisjava.chap11;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID: {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String[] input = {id,name,tel};
		String result = MessageFormat.format(text, input);
		System.out.println(result);
	}
}
