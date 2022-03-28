package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.Stack;

public class Problem_1918 {


  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(addSmallParenthesis(br.readLine()));

    br.close();


  }


  private static String addSmallParenthesis(String input) {
    StringBuilder answer = new StringBuilder(300);
    Stack<Character> stack = new Stack<>();
    Set<Character> operator = Set.of('+', '-', '*', '/');

    for (char c : input.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        answer.append(c);
        continue;
      }
      if (c == '(') {
        stack.push(c);
        continue;
      }
      if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          answer.append(stack.pop());
        }
        stack.pop();
      }

      if (operator.contains(c)) {

        if (stack.isEmpty()) {
          stack.push(c);
        } else {
          // 새로 들어오는 연산자보다 우선순위가 높은 연산자가 있으면 먼저 처리한다.
          while (!stack.isEmpty() && (getPriority(stack.peek()) >= getPriority(c))) {
            answer.append(stack.pop());
          }
          // 더 이상 새로운 연산자보다 우선순위가 높은 연산자가 없을 때
          stack.push(c);

        }
      }

    }

    while (!stack.isEmpty()) {
      answer.append(stack.pop());
    }

    return answer.toString();
  }

  private static int getPriority(char c) {
    // 높을 수록 빨리 처리해야 하는 연산
    // 괄호는 ')'가 처리하기 때문에 절대 다른 연산자보다 먼저 계산될 수 없다.
    if (c == '(') {
      return 0;
    }

    if (c == '-' || c == '+') {
      return 1;
    }

    return 2;
  }

}
