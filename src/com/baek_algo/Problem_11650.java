package com.baek_algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem_11650 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    var N = Integer.parseInt(br.readLine());

    var answer = new StringBuilder();
    var table = new int[N][2];
    for (int i = 0; i < N; i++) {
      var buffer = br.readLine().split(" ");
      table[i][0] = Integer.parseInt(buffer[0]);
      table[i][1] = Integer.parseInt(buffer[1]);


    }

    Arrays.sort(table, (a,b) -> {
      int firstComparison = Integer.compare(a[0],b[0]);
      if(firstComparison != 0) {
        return firstComparison;
      }
      return  Integer.compare(a[1],b[1]);

    });

    for (int i = 0; i < N; i++) {
      var value = table[i];
      bw.write(value[0]+" "+value[1] +"\n");

    }
    bw.flush();
    bw.close();
  }

}


