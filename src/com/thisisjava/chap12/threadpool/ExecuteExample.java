package com.thisisjava.chap12.threadpool;

import java.util.*;
import java.util.concurrent.*;

public class ExecuteExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		
		for(int i = 0; i<10; i++) {
		executorService.submit(() -> {
			ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
			int poolSize = threadPoolExecutor.getPoolSize();
			String threadName = Thread.currentThread().getName();
			System.out.printf("[총 스레드 개수 : %d] 작업 스레드 이름 : %s%n"
					,poolSize,threadName);
			int value = Integer.parseInt("삼");
		});
		
		Thread.sleep(100);
		
		}
		
		executorService.shutdown();
		

	}
}
