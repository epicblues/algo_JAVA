package com.thisisjava.chap15;
import java.io.*;
import java.net.URLDecoder;
import java.util.*;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = Class.forName("com.thisisjava.chap15.PropertiesExample")
				.getResource("ant/axis_client.properties")
				.getPath();
		path = URLDecoder.decode(path, "UTF-8");
		properties.load(new FileReader(path));
		
		Set<Map.Entry<Object, Object>> propSet = properties.entrySet();
		
		for(Map.Entry<Object, Object> entry : propSet) {
			System.out.printf("Key : %s, Value : %s %n", 
					(String)entry.getKey(),
					(String)entry.getValue());
		}
		
		String ListRuntimes = properties.getProperty("ListRuntimes");
		System.out.println(ListRuntimes);
		System.out.println(properties.getProperty("InitialSelection"));

	}

}
