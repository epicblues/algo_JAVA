package com.thisisjava.chap12;
import java.util.*;
public class ThreadInfoExample {

	public static void main(String[] args) {
		Thread autoSave = new Thread(() -> {
			while(true) {
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				break;
			}
			System.out.println("작업 내용을 저장함");
			}
			
		});
		
		autoSave.setDaemon(true);
		autoSave.setName("AutoSaveThread");
		autoSave.start();
		
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Map.Entry<Thread, StackTraceElement[]>> set = map.entrySet();
		Iterator<Map.Entry<Thread, StackTraceElement[]>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Thread, StackTraceElement[]> entry = iter.next();
			Thread thread = entry.getKey();
			System.out.printf("name: %s%s%n\t소속그룹: %s%n",
					thread.getName(),
					(thread.isDaemon()?"(데몬)":"(주)"),
					thread.getThreadGroup().getName()
					);
			}
		}
		

	}


