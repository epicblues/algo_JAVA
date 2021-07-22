package com.thisisjava.chap8;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(50);
		rc.setMute(true);
		
		rc.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		}; // 익명 구현 객체.
	}

}
