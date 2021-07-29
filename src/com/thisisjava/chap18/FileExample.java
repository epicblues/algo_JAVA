package com.thisisjava.chap18;

import java.io.*;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.*;


public class FileExample {
	static final String temp1 = "C:/Temp/";
	public static void main(String[] args) throws Exception {
		
		File dir = new File(temp1 + "Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) dir.mkdir();
		if(file1.exists() == false) file1.createNewFile();
		if(file2.exists() == false) file2.createNewFile();
		if(file3.exists() == false) file3.createNewFile();
		
		File temp = new File("C:/Temp/");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a	HH:mm");
		File[] contents = temp.listFiles();
		for(File f : contents) {
			String type = null;
			if(f.isDirectory()) {
				type = "<DIR>";
			} else {
				type = " ";
				FileWriter fw = new FileWriter(f);
				fw.write("Kms is Godlike한".toCharArray());
				fw.flush();
				fw.close();
			}
			System.out.printf("%s\t%s\t%d\t%s%n"
					,sdf.format(f.lastModified())
					,type,f.length(),f.getName()
					);
			if(f.getName() == "image.gif") {
				f.renameTo(new File(temp1 + "image2.gif") );
			}
			
		}
		
		
	}

}
