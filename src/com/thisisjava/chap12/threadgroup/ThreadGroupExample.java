package com.thisisjava.chap12.threadgroup;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ " + Thread.currentThread().getName() +" 스레드 그룹의 list() 메소드 출력 내용 ]");
		Thread.currentThread().getThreadGroup().list();
		
		System.out.println();
		
		System.out.println("[ " + myGroup.getName() +" 스레드 그룹의 list() 메소드 출력 내용 ]");
		myGroup.list();
		System.out.println();
		myGroup.setDaemon(true);
		Thread.currentThread().getThreadGroup().interrupt();
//		System.out.println("[ " + myGroup.getName() +" 스레드 그룹의 interrupt() 메소드 호출 ]");
//		myGroup.interrupt();

	}

}
