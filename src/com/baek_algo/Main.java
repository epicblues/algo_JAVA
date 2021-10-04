package com.baek_algo;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg0[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 최대합
        
        // N개의 숫자만큼 읽기
        st = new StringTokenizer(br.readLine());
        int[] numBox = new int[N];
        for(int i = 0; i < N; i++) 
        {
            numBox[i] = Integer.parseInt(st.nextToken()); 
        }
        if (N == 3) {
            System.out.println(numBox[0] + numBox[1] + numBox[2]);
            return; // 숫자가 3개면 바로 3개의 합 구하고 끝내기
        }
        
        
        
        
        Arrays.sort(numBox);
        int[] answer = {numBox[0],numBox[1],numBox[2]};
        int sum = answer[0] + answer[1] + answer[2];
        if(sum == M-1) {
            System.out.println(sum);
            return;
        }
        // answer를 조작해서 배열을 얻는다.
        for(int i = 3; i<N; i++) {
            if(numBox[i] + answer[1]+ answer[2] < M - 1) 
            {
                answer[0] = answer[1];
                answer[1] = answer[2];
                answer[2] = numBox[i];
            } else if (answer[0] + numBox[i] + answer[2] < M -1 )
            {
                answer[1] = answer[2];
                answer[2] = numBox[i];
            } else if (answer[0] + answer[1] + numBox[i] < M - 1)
            {
                answer[2] = numBox[i];
            } else {
                
                break;
            }
            
        }
        
        System.out.println(answer[0] + answer[1] + answer[2]);
      
        
         
        
        
    }
}