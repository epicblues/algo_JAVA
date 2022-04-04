package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_10814 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    Record[] arr = new Record[N];

    for (int i = 0; i < N; i++) {
      arr[i] = Record.parseStringAndCreateRecord(br.readLine(), i);
    }

    Arrays.sort(arr, (n1, n2) -> {
      if (n1.age != n2.age) {
        return Integer.compare(n1.age, n2.age);
      }
      return Integer.compare(n1.order, n2.order);
    });

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      sb.append(arr[i].age).append(" ").append(arr[i].name).append("\n");
    }

    System.out.println(sb);
  }

}


class Record {

  public int age;
  public String name;
  public int order;


  public static Record parseStringAndCreateRecord(String input, int order) {
    var record = new Record();
    String[] splittedArr = input.split(" ");
    record.age = Integer.parseInt(splittedArr[0]);
    record.name = splittedArr[1];
    record.order = order;
    return record;
  }
}
