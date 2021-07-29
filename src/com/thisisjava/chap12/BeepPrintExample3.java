package com.thisisjava.chap12;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		});
			

		
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("빕");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
