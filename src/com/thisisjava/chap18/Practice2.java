package com.thisisjava.chap18;
import java.io.*;
public class Practice2 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		byte [] a= new byte[5];
		int b = in.read(a);
		OutputStream out= System.out;
		out.write(a);
		out.flush();
		
		System.out.println("읽은 바이트 수 : " + b);

	}

}
