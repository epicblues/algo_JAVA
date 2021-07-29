package com.thisisjava.chap18;
import java.io.*;
import com.thisisjava.chap15.practice.Student;
public class ObjectInputOutputExample {
	public static final String TARGET = DataInputOutputStreamExample.path + "\\files\\Object.dat";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream(TARGET);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Student(5,"김민성"));
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream(TARGET);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu =(Student)ois.readObject();
		ois.close();
		System.out.println(stu);
		
		
		
		
	}
	

}


