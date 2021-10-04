package com.thisisjava.chap16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	private static final String target = FromFileContentExample.path + "\\files";
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get(target);
		
		Stream<Path> stream = Files.list(path);
		
		stream.forEach(p -> System.out.println(p.getFileName()));
		
		stream.close();

	}

}
