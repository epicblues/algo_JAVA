package com.thisisjava.chap12.stopinterrupt;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
		
			while(!Thread.interrupted()) {
				System.out.println("실행 중");
			}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
