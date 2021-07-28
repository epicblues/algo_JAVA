package com.thisisjava.chap18;
import java.io.*;
public class Practice {

	public static void main(String[] args) throws IOException {
//		InputStream is = new FileInputStream("C:/abcdefg.txt");
		int readByte;
//		while((readByte = is.read()) != -1) {
//			System.out.println(Integer.valueOf(readByte));
//		}
//		is.close();
//		
		InputStream is2 = new FileInputStream("C:/abcdefg.txt");
		byte[] byteArr= new byte[5];
		while((readByte = is2.read(byteArr,1,3)) != -1) {
			
			for(int i = 0; i<byteArr.length;i++)
			System.out.print(byteArr[i] + " ");
			System.out.println();
			System.out.println("----------------------");
			
		}
		is2.close();

		
		OutputStream os = new FileOutputStream("C:/abcdefg.txt");
		os.write("I love you!".getBytes());
		os.flush();
		os.close();
		
		Reader reader = new FileReader("C:/abcdefg.txt");
		int readData;
		while ((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		reader.close();
		
		Writer writer = new FileWriter("C:/abcdefg.txt");
		writer.write("Hello World!");
		writer.flush();
		writer.close();
		
		System.out.println();
		reader = new FileReader("C:/abcdefg.txt");
		
		while ((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		reader.close();
	}

}
