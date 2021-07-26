package com.thisisjava.chap13.genmethod;

import java.util.Scanner;

public class CompareMethodExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pair<Integer,String> pair1 = new Pair<Integer, String>(1,sc.next());
		Pair<Integer,String> pair2 = new Pair<Integer, String>(1,new String("홍길동"));
		
		System.out.println(pair1 == pair2);
		System.out.println(Util.compare(pair1, pair2));
		

	}

}
