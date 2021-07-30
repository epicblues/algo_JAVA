package com.thisisjava.chap12.yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA thrA = new ThreadA();
		ThreadB thrB = new ThreadB();
		
		thrA.start();
		thrB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thrA.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thrA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thrA.stop = true;
		thrB.stop = true;

	}

}
