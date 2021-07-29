package com.thisisjava.chap18.serialize;

import java.io.*;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		String target = com.thisisjava.chap18.ObjectInputOutputExample.TARGET;
		FileInputStream fos = new FileInputStream(target);
		ObjectInputStream oos = new ObjectInputStream(fos);
		ClassC c = (ClassC)oos.readObject();
		System.out.println(c.field1);
		
		
		
		oos.close();
		fos.close();

	}

}

