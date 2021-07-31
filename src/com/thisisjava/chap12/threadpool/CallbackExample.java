package com.thisisjava.chap12.threadpool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.*;

public class CallbackExample {
	private ExecutorService executorService;

	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<>() {

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행 : " + result);

		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.err.println("failed() 실행 : " + exc.getMessage());

		}

	};

	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch (NumberFormatException e) {
					callback.failed(e, null);
				}

			}

		};

		executorService.submit(task);
	}

	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("삼", "6");
		example.executorService.shutdown();
		
	}

}
