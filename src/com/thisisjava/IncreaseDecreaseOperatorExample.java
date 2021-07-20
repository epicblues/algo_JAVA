package com.thisisjava;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------");
		x++;
		++x;
		System.out.println("x= " + x);
		
		System.out.println("----------------");
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("----------------");
		
		z = x++; // z = x 연산을 먼저 하고 x는 더해진다. 따라서 z는 더해지기 이전의 x의 값 저장.
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("----------------");
		
		z = ++x; 
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("----------------");
		
		z= ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}
