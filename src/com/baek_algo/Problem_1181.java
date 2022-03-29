package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem_1181 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    PriorityQueue<String> heap = new PriorityQueue<String>((a, b) -> {
      if (a.length() != b.length()) {
        return a.length() - b.length();
      }
      return a.compareTo(b);
    });

    for (int i = 0; i < N; i++) {
      String newString = br.readLine();
      heap.add(newString);
    }

    br.close();
    String before = null;
    StringBuilder sb = new StringBuilder(N);
    for (int i = 0; i < N; i++) {
      String word = heap.poll();
      if (!word.equals(before)) {
        // 매번 method chaining으로 하면 매번 새로운 상수 풀을 만들 필요가 없다.
        // word + "\n" 매번 새로운 word 마다 {word}\n 라는 상수 메모리에 생성

        sb.append(word).append("\n");
        before = word;
      }
    }
    // I/O를 건드리는 작업은 최대한 줄이는 것이 좋다!
    // Stringbuilder로 한 번에 모아서 출력!
    System.out.println(sb.toString());
  }
}
