package com.thisisjava.chap12;

public class ThreadClassExample {

	public static void main(String[] args) {
		Thread targetThread = new TargetThread();
		Thread thread = new StatePrintThread(targetThread);
		
		thread.start();
		
		

	}

}
