package com.thisisjava.chap12.stopinterrupt;

public class StopFlagExample {
	public static void main(String[] args) throws InterruptedException {
		PrintThread1 thread = new PrintThread1();
		thread.start();
		Thread.sleep(100);
		thread.setStop(true);
	}
}
