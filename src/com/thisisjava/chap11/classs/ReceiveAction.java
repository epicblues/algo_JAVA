package com.thisisjava.chap11.classs;

public class ReceiveAction implements Action{
	
	public int number;
	
	public ReceiveAction(int number) {
		this.number = number;
	}
	@Override
	public void execute() {
		System.out.println(number + " 번 데이터를 받습니다.");
		
	}

}
