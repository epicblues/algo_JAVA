package com.practice.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromDirectoryExample {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("C:/");

    var stream = Files.list(path);

    // 최종 처리가 시작되지 않았으므로 이 내부 콜백은 작동하지 않는댜.
    stream.map(p -> {
      System.out.println(p.getFileName());
      return "baka";
    }).map(s -> {
      System.out.println("asdf");
      return "fdf";
    });

  }

}
