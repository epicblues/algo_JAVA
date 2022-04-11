package com.thisisjava.Chap19;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileExample {

  public static void main(String[] args) throws IOException {
//    Path dir = Paths.get("C:/hello/baka");
//
//    if(Files.notExists(dir)) {
//      Files.createDirectories(dir);
//
//    }
//
//    var babo = Paths.get(dir.toString(), "babo.txt");
//    Files.writeString(babo,"sdfasdfafasdf\nsdafsdafsd");
//    Files.readAllLines(babo).forEach(System.out::println);

    FileChannel fileChannel = FileChannel.open(Path.of("file.txt"), StandardOpenOption.WRITE,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    fileChannel.write(Charset.defaultCharset().encode("muyaho"));
    fileChannel.close();

  }

}
