package com.thisisjava.chap11.system;

public class ExitExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
				System.out.println("status == 5 이므로 프로그램을 종료합니다.");
			} // checkExit 코드 블록을 아무런 오류 없이 읽으면 종료되는 구조?
		});
			
		for (int i=0; i<10; i++) {
			// i 값 출력
			System.out.println(i);
			try {
				//JVM 종료 요청
				System.exit(i);;
			} catch(SecurityException e) {System.out.println("5가 아닙니다");}
		}

	}

}
