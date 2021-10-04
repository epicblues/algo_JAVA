package com.thisisjava.chap6;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기.
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "] ");
				//구분선 출력
				for(int i =0; i <printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				} catch (Exception e) {}	
				System.out.println();
				}
			}
		}

	}


