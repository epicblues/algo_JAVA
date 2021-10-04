package com.thisisjava.chap9.anonymous;

public interface RemoteControl {
	int MAX_NUMBER = 10;
	public void turnOn();
	public void turnOff();
	default void defaultMethod() {
		System.out.println("Interface's Default Method");
	}
}

class Anonymous2 {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			String target = "Audio";
			@Override
			public void turnOn() {
				System.out.println(target +"를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println(target +"를 끕니다.");
			}
			
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}