package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_1874 {

  public static void main(String[] args) throws IOException {

    var br = new BufferedReader(new InputStreamReader(System.in));

    var N = Integer.parseInt(br.readLine());

    var stack = new Stack<Integer>();

    var targetArr = new int[N];

    for (int i = 0; i < N; i++) {
      targetArr[i] = Integer.parseInt(br.readLine());
    }
    int p1 = 1, p2 = 0;
    var answer = new StringBuilder();
    while (p1 <= N && targetArr[p2] >= p1) {
      while (p1 <= targetArr[p2]) {
        stack.push(p1++);
        answer.append("+\n");
      }
      while (stack.size() > 0 && stack.peek() == targetArr[p2]) {
        stack.pop();
        answer.append("-\n");
        p2++;
      }

    }

    System.out.println(p2 == N ? answer : "NO");
  }

}
