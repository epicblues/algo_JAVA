package com.thisisjava.chap18;

import java.io.*;
import java.util.*;

public class DataInputOutputStreamExample {
	static final String path = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {

		File dir = new File(path + "\\files");
		if (!dir.exists())
			dir.mkdir();
		System.out.println(path);

		FileOutputStream fos = new FileOutputStream(path + "\\files\\test.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();
		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream(path + "\\files\\test.dat");
		DataInputStream dis = new DataInputStream(fis);
		for (int i = 0; i < 2; i++) {
			System.out.println(dis.readUTF() + " : " + dis.readDouble() + " : " + dis.readInt());
		}
		dis.close();
//		FileOutputStream fos = new FileOutputStream(path + "");

	}

}
