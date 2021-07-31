package com.thisisjava.chap12.threadpool;

import java.util.concurrent.*;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("[작업 처리 요청]");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i = 1; i<=10; i++) {sum += i;}
				System.out.println("[처리 결과] " + sum);
				
			}
		};
		Future future = executorService.submit(runnable);
		
		try {
			
			future.get();
			System.out.println("작업 처리 완료");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		
		
	}
	
	
}
