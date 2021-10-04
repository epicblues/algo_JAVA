package com.thisisjava.chap11.string;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 0x11,0x42, 0x50,-0x23,-0x15,0x73,-0x62,-0x24,0x51,0x13 };
		
		String str;
		try {
			str = new String(bytes,"ASCII");
			System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
