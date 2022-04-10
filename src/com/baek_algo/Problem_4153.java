package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_4153 {

  public static void main(String[] args) throws IOException {


    var br = new BufferedReader(new InputStreamReader(System.in));

    var answer = new StringBuilder();

    while (true) {
      String line = br.readLine();
      if(line.equals("0 0 0")) {
        break;
      }

      var numArr = new int[3];
      var strArr = line.split(" ");
      for (int i = 0; i < strArr.length; i++) {
        numArr[i] = Integer.parseInt(strArr[i]);
      }
      Arrays.sort(numArr);
      if(Math.pow(numArr[0],2) +Math.pow(numArr[1],2) == Math.pow(numArr[2],2) ) {
        answer.append("right\n");
        continue;
      }
      answer.append("wrong\n");

    }

    System.out.println(answer);
  }

}
