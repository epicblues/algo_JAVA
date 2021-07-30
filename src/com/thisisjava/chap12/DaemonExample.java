package com.thisisjava.chap12;

public class DaemonExample {

	public static void main(String[] args) throws InterruptedException {
		Thread autoSave = new Thread(() -> {
			while(true) {
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				break;
			}
			System.out.println("작업 내용을 저장함");
			}
			
		});
		
		autoSave.setDaemon(true);
		autoSave.start();
		
		Thread.sleep(3001);
		System.out.println("메인 스레드 종료");
		
		
		

	}

}
