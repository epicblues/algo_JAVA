package com.thisisjava.chap12;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Thread user1 = new Thread(() -> {
			Thread.currentThread().setName("User1");
			cal.setMemory(100);
		});
		user1.start();
		Thread user2 = new Thread(() -> {
			Thread.currentThread().setName("User2");
			cal.setMemory(50);
		});
		
		
		user2.start();

	}

}
