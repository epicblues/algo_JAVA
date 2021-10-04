package com.thisisjava.chap18;
import java.io.*;
import java.util.*;
public class BufferedInputStreamExample {
	public static final String path = "C:\\\\Users\\\\epicb\\\\git\\\\JavaEx\\\\JavaEx\\\\files\\\\";
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:\\Users\\epicb\\git\\JavaEx\\JavaEx\\files\\img.jpg"));
		
		long startTime = System.nanoTime();
		List<Byte> container = new ArrayList<Byte>(10000);
		int data = 0;
		while((data = bis.read()) != -1) {
			
			container.add(Byte.valueOf((byte)data));
		}
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
		bis.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\epicb\\git\\JavaEx\\JavaEx\\files\\img.jpg");
		startTime = System.nanoTime();
		List<Byte> container2 = new ArrayList<Byte>(10000);
		data = 0;
		while((data = fis.read()) != -1) {
			container2.add(Byte.valueOf((byte)data));
		}
		stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
		fis.close();
		
	}
}
