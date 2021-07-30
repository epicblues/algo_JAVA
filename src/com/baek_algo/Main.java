package com.baek_algo;

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int count = 0;
        for (int j=0; j<inputNum;j++) {
            HashSet<Character> set = new HashSet<>();
            String inputStr = br.readLine();
            if (inputStr.length() == 1) break;
            for(int i =0; i<inputStr.length();i++) {
                if(!(set.add(Character.valueOf(inputStr.charAt(i))))) {
                    count++;
                    break;
                }
            }
        }
         System.out.println(count);
        }
      
        
        
    }
