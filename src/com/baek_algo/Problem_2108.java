package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_2108 {


  public static void main(String[] args) throws IOException {

    var br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] buffer = new int[N];

    int sum = 0;

    Map<Integer, Integer> table = IntStream.range(-4000, 4001).boxed()
        .collect(Collectors.toMap(num -> num, num -> 0));

    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      sum += x;
      table.put(x, table.get(x) + 1);
      buffer[i] = x;
    }

    Arrays.sort(buffer);
    // 산술 평균
    System.out.println(Math.round(sum * 1.0 / N));
    System.out.println(buffer[N / 2]);

    int maxVal = -1;
    var candidate = new LinkedList<>();

    for (int i = -4000; i < 4001; i++) {
      int target = table.get(i);
      if (target == 0) {
        continue;
      }
      if (target > maxVal) {
        maxVal = target;
        candidate = new LinkedList<>();
        candidate.add(i);
      } else if (Objects.equals(target, maxVal)) {
        candidate.add(i);

      }
    }
    System.out.println(candidate.size() > 1 ? candidate.get(1) : candidate.get(0));

    System.out.println(buffer[N - 1] - buffer[0]);
  }

}
