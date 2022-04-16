package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Problem_11866 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    var buffer = br.readLine().split(" ");
 int   N = Integer.parseInt(buffer[0]);
   int K = Integer.parseInt(buffer[1]);
   var answer = new StringBuilder();

    List<Integer> list =  new LinkedList<>();

    answer.append("<");
    int position = 0;
   for(int i = 1; i< N+1; i++) {
     list.add(i);
   }

   while (!list.isEmpty()) {
      position = (position  +(K - 1)) % list.size() ;

      answer.append(list.remove(position)).append(", ");
   }

   answer.replace(answer.length() - 2, answer.length(), ">");

    System.out.println(answer);
  }

}
