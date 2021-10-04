package com.thisisjava.chap18;
import java.io.*;
public class PrintStreamTableExample {
	static final String TARGET = DataInputOutputStreamExample.path + "\\files\\test.dat";
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(TARGET,true);
		PrintStream ps = new PrintStream(fos);
		ps.println();
		ps.println("Print Stream Check");
	
		ps.close();
	}
	
}
