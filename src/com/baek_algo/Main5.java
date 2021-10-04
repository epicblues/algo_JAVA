package com.baek_algo;
import java.io.*;
import java.util.*;

public class Main5{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder[] numArr = {new StringBuilder(st.nextToken()), new StringBuilder(st.nextToken())};
        
        
        for(int i=0; i<2;i++) {
            numArr[i].reverse();
        }
        int result = 0;
        
        if (Integer.parseInt(numArr[0].toString()) > Integer.parseInt(numArr[1].toString())) {
            result = Integer.parseInt(numArr[0].toString());
        } else {
            result = Integer.parseInt(numArr[1].toString());
        }
        System.out.println(result);
    }
}