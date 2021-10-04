package com.thisisjava.chap18.serialize;

import java.io.*;

public class NonSerializableParentExample {

	static String path = com.thisisjava.chap18.serialize.SerialVersionUIDExample1.target;

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Child c = new Child();
		c.field1 = "홍길동";
		c.field2 = "홍삼원";
		oos.writeObject(c);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		c = (Child)ois.readObject();
		ois.close();
		System.out.printf("field1: %s%nfield2: %s", c.field1,c.field2);

	}

}
