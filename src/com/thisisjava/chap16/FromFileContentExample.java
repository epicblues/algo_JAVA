package com.thisisjava.chap16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	
	public static final String path = System.getProperty("user.dir");
	public static final String target = path + "\\files\\linedata.txt";
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(target)));
		bw.write("Java8에서 추가된 새로운 기능\n1.람다식\n2.메소드 참조\n3.디폴트 메소드와 정적 메소드\n4.새로운 API 패키지");
		bw.flush();
		bw.close();
		
		Stream<String> stream;
		
		stream = Files.lines(Paths.get("files\\linedata.txt"),Charset.defaultCharset());
		
		stream.forEach(line -> System.out.println(line));
		stream.close();
		
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(target)));
		stream = br.lines();
		stream.forEach(System.out::println);
		br.close();
		stream.close();
		
		

	}

}
