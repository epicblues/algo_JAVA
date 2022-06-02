package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem_17219 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    var input = br.readLine().split(" ");
    var N = Integer.parseInt(input[0]);
    var M = Integer.parseInt(input[1]);
    Map<String, String> table = new HashMap<>();
    for (int i = 0; i < N; i++) {
      var records = br.readLine().split(" ");
      table.put(records[0], records[1]);
    }

    StringBuilder buffer = new StringBuilder();
    for (int i = 0; i < M; i++) {
      buffer.append(table.get(br.readLine())).append("\n");
    }
    buffer.delete(buffer.length() - 1, buffer.length());

    System.out.println(buffer);
  }
}
