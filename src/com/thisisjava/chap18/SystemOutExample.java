package com.thisisjava.chap18;
import java.io.*;
public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.flush();
		os.write("\n".getBytes());
		os.flush();
		
		for(byte b = 97; b<97+26; b++) {
			os.write(b);
		}
		os.flush();
		os.write("\n".getBytes());
		os.flush();
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		os.flush();
		os.close();

	}

}
