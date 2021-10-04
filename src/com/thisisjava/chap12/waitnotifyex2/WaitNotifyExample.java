package com.thisisjava.chap12.waitnotifyex2;

public class WaitNotifyExample {

	public static void main(String[] args) throws InterruptedException {
		DataBox db = new DataBox();
		ConsumerThread cThread = new ConsumerThread();
		ProducerThread pThread = new ProducerThread();
		
		cThread.setDataBox(db);
		pThread.setDataBox(db);
		
		cThread.start();
		pThread.start();

	}

}
