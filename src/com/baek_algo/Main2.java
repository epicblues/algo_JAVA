package com.baek_algo;

// 버퍼 문제풀이 템픞릿

import java.io.*;


public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(bf.readLine()); 
		 bf.close();
		
		int newN = N;
        
		int count = 0;
        
        
            do {
            	char[] charN;
            	if(newN<10) {
            		charN= ("0" + Integer.toString(newN)).toCharArray();
                } else {
                	charN= Integer.toString(newN).toCharArray();
                }
            	
                
                int firstN = Character.getNumericValue(charN[0]);
                int secondN =Character.getNumericValue(charN[1]);
                
                
                int thirdN = firstN + secondN; 
                char[] charThirdN =Integer.toString(thirdN).toCharArray();
                int lastThirdN = Character.getNumericValue(charThirdN[charThirdN.length-1]);
                
                if(secondN==0) {
                	newN = lastThirdN;
                } else {
                	newN = Integer.parseInt(Integer.toString(secondN) + Integer.toString(lastThirdN));
                }
                count++;
            
            } while(newN != N);
            	System.out.println(count);
            
            }
        

	

}