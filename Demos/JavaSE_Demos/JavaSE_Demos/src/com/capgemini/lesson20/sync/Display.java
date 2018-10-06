package com.capgemini.lesson20.sync;
public class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			//System.out.println("Hello ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("Hello "+name);
		}
	}
}
