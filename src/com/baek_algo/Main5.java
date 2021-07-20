package com.baek_algo;



import java.io.*;


public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        int[] intArray = new int[10];
        int[] remainderArray= new int[42];
        for(int i=0; i<10;i++) {
            intArray[i]= Integer.parseInt(bf.readLine()); 
            remainderArray[(intArray[i]%42)]++;
        } // 숫자 저장
        
        int diffCount = 0;
         for(int i=0; i<42;i++) {
             if(!(remainderArray[i] == 0)) {
                 diffCount++;
             }
         }    
		
       
        bw.write(diffCount + "\n");
        bf.close();
        bw.flush();
		bw.close();   
        
     
	}

}