package com.baek_algo;

import java.util.*;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        double sum = 0;
        
        for(int i = num1; i<= num2; i ++) {
        	int temp = i;
            for(int n=9; n>=0; n--) {
            	double num;
            	if ( Math.pow(10, n)> temp) {} 
            	else {
            	num = Math.floor(temp / Math.pow(10, n));
            	temp = temp - num * Math.pow(10, n);
            	sum += (num >=1 ? num : 0);
            	}
            }
        } 
        
        System.out.println((int)sum);
        
        
        
        		
        		
        		
        	
    }
}
