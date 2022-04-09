package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Problem_4949 {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder stringBuilder = new StringBuilder();

    String line;

    while (true) {
      line = bufferedReader.readLine();
      boolean isChecked = false;
      if (line.equals(".")) {
        
        break;
      }
      Deque<Character> stack = new LinkedList<>();
      for (int i = 0; i < line.length(); i++) {
        char word = line.charAt(i);

        if (word == ')') {
          if (stack.isEmpty() || stack.peek() != '(') {
            stringBuilder.append("no\n");
            isChecked = true;
            break;
          }
          stack.pop();
          continue;
        }

        if (word == ']') {
          if (stack.isEmpty() || stack.peek() != '[') {
            stringBuilder.append("no\n");
            isChecked = true;
            break;
          }
          stack.pop();
          continue;
        }

        if (word == '(' || word == '[') {
          stack.push(word);

        }


      }
      if (!isChecked) {
        stringBuilder.append(stack.isEmpty() ? "yes\n" : "no\n");

      }

    }

    System.out.println(stringBuilder);
  }

}
