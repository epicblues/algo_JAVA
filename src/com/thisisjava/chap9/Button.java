package com.thisisjava.chap9;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
		System.out.println("새로운 Listener 탑재");
	} // 매개 변수의 다형성
	
	void touch()  {
		listener.onClick(); // 구현 객체의 onClick() 메소드 호출
	}
	
	interface OnClickListener {
		void onClick();
	}
}


class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}
	
}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
		
	}
	
}
