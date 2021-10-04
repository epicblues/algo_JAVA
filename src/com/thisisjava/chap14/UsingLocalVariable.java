package com.thisisjava.chap14;

public class UsingLocalVariable {
	void method(int arg) { // arg는 final 특성을 가짐
		int localVar = 40; // localVar는 final 특성을 가짐

		// 람다식

		MyFunctionalInterface fi = () -> {
			System.out.println("arg :" + arg);
			System.out.println("localVar: " + localVar + "\n");

		};

		fi.method();
	}
}
