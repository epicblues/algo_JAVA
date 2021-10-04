package com.thisisjava.chap12.threadpool;

import java.util.concurrent.*;
public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		System.out.println("[작업 처리 요청]");
		
		Callable<Integer> task = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i<=10; i++) {
					sum += i;
				}
				Thread.sleep(5000);
				return sum;
			}
		};
		Integer result = 0;
		try {
			result = executorService.submit(task).get();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("[처리 결과] " + result);
			System.out.println("[작업 처리 완료]");
		}
		
		executorService.shutdown();
		
			

	}

}
