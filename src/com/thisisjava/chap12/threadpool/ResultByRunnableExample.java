package com.thisisjava.chap12.threadpool;

import java.util.concurrent.*;

public class ResultByRunnableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		// Runnable 인터페이스 구현 Task 클래스 생성
		class Task implements Runnable {

			public Result result;

			public Task(Result result) {
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result.setResult(result.getResult() + sum);
			}

		}
		Result result = new Result();
		System.out.println("작업 처리 요청");
		executorService.submit(new Task(result));
		executorService.submit(new Task(result)).get();
		
		System.out.println("[처리 결과] " + result.getResult() );
		executorService.shutdown();
		System.out.println("작업 처리 완료");
		
		
	}

}

class Result {
	private int result;

	public Result() {
		result = 0;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
