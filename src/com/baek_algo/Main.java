package com.baek_algo;

import java.io.*;
import java.util.StringTokenizer;

 class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();  // ' ' = 32
        int countWord = 0;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == 32) {
                countWord++;
            }
        }
        
        
       
        System.out.println(countWord);
        
    }
}