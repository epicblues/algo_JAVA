package com.thisisjava.chap9.anonymous;

public class RemoteControlApp {

	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		// 익명 객체 필드 사용.
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용.
		anony.method1();
		
		// 익명 개체 매개값 사용
		anony.method2(new RemoteControl() {
			
			String target = "SmartTV";
			@Override
			public void turnOn() {
				
				System.out.println(target + "를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println(target + "를 끕니다.");
			}
		});
		
	}

}
