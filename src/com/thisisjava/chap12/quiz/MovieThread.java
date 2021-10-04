package com.thisisjava.chap12.quiz;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while (true){
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}

class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
