package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1259 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input;
    StringBuilder answer = new StringBuilder();
    input = br.readLine();
    do {
      char[] charArr = input.toCharArray();
      boolean isPalindrome = true;
      for (int i = 0; i < charArr.length; i++) {
        int opposite = charArr.length - i - 1;
        if (charArr[i] != charArr[opposite]) {
          isPalindrome = false;
          break;
        }
      }

      answer.append(isPalindrome ? "yes\n" : "no\n");

      input = br.readLine();
    } while (!input.equals("0"));

    System.out.println(answer.toString());
  }
}
