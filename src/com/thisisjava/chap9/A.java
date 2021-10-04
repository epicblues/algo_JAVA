package com.thisisjava.chap9;

// 바깥 클래스

class A {
	
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
//	static B field3 = new B(); // A의 인스턴스가 형성되는 것을 전제로 형성되는 인스턴스 멤버 클래스
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}
	
	A() {System.out.println("A 객체가 생성됨");}
	
	
	
	
	// 인스턴스 멤버 클래스
	class B {
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
		//static int field2;
		void method1() {}
		
	}
	
	// 정적 멤버 클래스
	static class C {
		C() {System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}
	
	void method() {
		/** 로컬 클래스 **/
		class D {
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
//			static int field2;
			void method1() {}
			// static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
}
