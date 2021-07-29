package com.thisisjava.chap18;
import java.io.*;
public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(FileExample.temp1+"file.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("김민성천재 godlike metaverse bitcoin rollercoaster");
		osw.flush();
		osw.close();
		
		FileInputStream fis = new FileInputStream(FileExample.temp1+"file.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char[] data = new char[100];
		int length;
		while((length = isr.read(data)) != -1) {
			
			System.out.println(new String(data,0,length));
		}
		isr.close();

	}

}
