package com.thisisjava.chap18.serialize;

import java.io.*;

public class SerialVersionUIDExample1 {
	static String target = com.thisisjava.chap18.ObjectInputOutputExample.TARGET;
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(target);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC c = new ClassC();
		c.field1 = 15;
		oos.writeObject(c);
		oos.flush();
		oos.close();
		fos.close();

	}

}

