package com.thisisjava.chap10;

public class TryWithResourceExample {

	public static void main  (String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("ㅅㅇㄹ");
			fis.read();
		fis.close();
		
		
	}

}
