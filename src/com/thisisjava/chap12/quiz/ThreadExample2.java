package com.thisisjava.chap12.quiz;

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new MovieThread();
		thread1.setDaemon(true);
		thread1.start();
		
		Thread.sleep(1000);
		
		

	}

}
