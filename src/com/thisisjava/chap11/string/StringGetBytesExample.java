package com.thisisjava.chap11.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str= "안녕하세요"; 
		
		byte[] byte1 = str.getBytes();
		System.out.println("bytes.length: " + byte1.length); // utf-8 한글 바이트 3
		String str1 = new String(byte1);
		System.out.println("bytes1 -> String : " + str1);

		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2 -> String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes2 -> String: " + str3);
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
