package com.thisisjava.chap12.waitnotify;

public class ThreadB extends Thread{
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		super();
		this.workObject = workObject;
		this.setName("B");
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodB();
		}
	}
}
