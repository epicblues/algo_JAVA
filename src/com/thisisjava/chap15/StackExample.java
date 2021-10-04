package com.thisisjava.chap15;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<Coin>();
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		stack.push(new Coin(10));
		
		while(!stack.isEmpty()) {
			System.out.println("Coin : " + stack.pop().getValue() + "원");
		}

	}

}
