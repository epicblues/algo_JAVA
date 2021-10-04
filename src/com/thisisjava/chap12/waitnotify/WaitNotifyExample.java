package com.thisisjava.chap12.waitnotify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		Thread threadA = new ThreadA(sharedObject);
		Thread threadB = new ThreadB(sharedObject);
		Thread.currentThread().setName("MAIN");
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
