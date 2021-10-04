package com.thisisjava.chap18;
import java.io.*;
public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf))!= -1) {
			String data = new String(cbuf,0, readCharNo - 2);
			System.out.println(data);
			System.out.println();
		}
		
		reader.close();
		

	}

}
