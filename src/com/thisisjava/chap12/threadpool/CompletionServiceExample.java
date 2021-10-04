package com.thisisjava.chap12.threadpool;

import java.util.concurrent.*;

public class CompletionServiceExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

		System.out.println("[작업 처리 요청]");
		for (int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}

					return sum;
				}
			});
		}

		System.out.println("[처리 완료된 작업 확인]");
		executorService.submit(() -> {
			for (int i = 0; i < 3; i++) {
				try {
					int result = completionService.take().get(); // 3번 호출 후 take()에서 멈춘 상태. 새로운 future가 나올 떄가지
																	// 무한pending.
					System.out.println("[처리 결과] " + result);
				} catch (Exception e) {
					break;
				}
			}
			return;
		});

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		;
		executorService.shutdown();

	}

}
