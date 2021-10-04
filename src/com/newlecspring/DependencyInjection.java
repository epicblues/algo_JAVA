package com.newlecspring;

public class DependencyInjection {
	
	private DependencyInterface B;
	
	public void setInterface(DependencyInterface implementedClass) {
		B = implementedClass; // Association has a
		// 외부에서 생성된 부품을 인자로 받아서 자신의 멤버로 갖고 있는다.
		// 외부 객체를 세팅받고 사용
		// 조립형 관계
	}
	
	public DependencyInjection() {
		B = new ImplementedClass();
		// Composition has a  클래스 내에서 부품을 직접 생성해서 멤버로 갖고 있는다.
		// 일체형 관계 A가 B 객체를 갖고 있다. // B는 A의 부품(Dependency)이다.
	}
	
	
}
