package com.thisisjava.chap12;

public class ThreadNameExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(() -> {
			Thread.currentThread().setName("K-Thread");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + "가 출력한 내용!");
		});
		thread.start();
		
		Thread thread2 = new Thread(() -> {
			Thread.currentThread().setName("J-Thread");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + "가 출력한 내용!");
		});
		
		
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName());
		thread2.start();
	}

}
