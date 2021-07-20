package com.baek_algo;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inputWord = br.readLine();
        int[] countArray = new int[26];
        for(int i = 0; i < 26; i++) {
            countArray[i] = -1;
            for (int j=0; j< inputWord.length(); j++) {
                if(inputWord.charAt(j) == i + 97) {
                    countArray[i] = j;
                	break;
                }
            }
            System.out.print(countArray[i] + " ");
        }
        
        
        
    }
}