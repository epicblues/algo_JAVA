package com.thisisjava.chap12.waitnotify;

public class ThreadA extends Thread{
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		super();
		this.workObject = workObject;
		this.setName("A");
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodA();
		}
	}
}
