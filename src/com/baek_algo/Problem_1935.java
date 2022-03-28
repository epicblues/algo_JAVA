package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_1935 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    char[] tokens = br.readLine().toCharArray();
    double[] realValue = new double[N];
    for (int i = 0; i < N; i++) {
      realValue[i] = Double.parseDouble(br.readLine());
    }
    Stack<Double> stack = new Stack<>();

    for (char token : tokens) {
      double result = 0;
      if (Character.isAlphabetic(token)) {
        // 캐릭터일 때는 매칭시킨다.
        double value = realValue[token - 'A'];
        stack.push(value);
      } else {
        double curr = stack.pop();
        double pre = stack.pop();
        switch (token) {
          case '+':
            result = pre + curr;
            break;
          case '-':
            result = pre - curr;
            break;
          case '*':
            result = pre * curr;
            break;
          case '/':
            result = pre / curr;
            break;

        }
        stack.push(result);

      }
    }

    System.out.printf("%.2f", stack.pop());

  }

}
