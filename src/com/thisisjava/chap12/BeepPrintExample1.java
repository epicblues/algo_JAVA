package com.thisisjava.chap12;
import java.awt.*;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("띵");
				System.out.println(System.nanoTime());
				try {Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		
		
		thread.start();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println(System.nanoTime());
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		
		

	}

}
