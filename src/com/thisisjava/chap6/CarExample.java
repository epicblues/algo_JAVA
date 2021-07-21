package com.thisisjava.chap6;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		
		System.out.println("제작회사:" + myCar.company);
		System.out.println("제작회사:" + myCar.model);
		System.out.println("제작회사:" + myCar.color);
	
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		System.out.println(myCar.sum(1,2,3,4,5,6,7,8,9,10));
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가없습니다.");
			
		} else {
			System.out.println("gas를 주입하세요");
		}
		myCar.keyTurnOn();
		myCar.run1();
	}

}
