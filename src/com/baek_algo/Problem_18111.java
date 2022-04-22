package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_18111 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    var meta = br.readLine().split(" ");

    int N = Integer.parseInt(meta[0]);
    int M = Integer.parseInt(meta[1]);
    int block = Integer.parseInt(meta[2]);

    int[][]table = new int[N][M];

    for (int i = 0; i < N; i++) {
      var temp = br.readLine().split(" ");
      for (int j = 0; j < temp.length; j++) {
        var num = Integer.parseInt(temp[j]);
        table[i][j] = num;
      }

    }
    // 브루트 포스 : 효율 계산하지 말고 하나씩 다 해보기
    int time = Integer.MAX_VALUE;
    int height = 0;
    start:
    for (int targetHeight = 0; targetHeight <= 256; targetHeight++) {
      // 256블록을 초과할 수 없다.

      int requiredBlock = 0;
      int movingTime = 0;

      for (int j = 0; j < N; j++) {
        for (int k = 0; k < M; k++) {

          if(movingTime > time ) continue start;
          int num = table[j][k];
          if(num == targetHeight) continue;
          if(num > targetHeight) {
            // 블록을 빼는 상황
            movingTime += (num - targetHeight) * 2;
            requiredBlock -= num - targetHeight;
            continue;
          }
          // 블록을 쌓아 올리는 상황
          movingTime += (targetHeight - num);
          requiredBlock += targetHeight - num;

        }
      }

      if(requiredBlock > block) continue;
      if(movingTime <=time ) {
        time = movingTime;
        height = targetHeight;
      }
    }

    System.out.println(time + " " + height);
    
    


  }

}
