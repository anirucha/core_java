package com.capgemini.lesson20.nonsynchronization;
public class Display {
	public void wish(String name) {
		for (int i = 0; i < 10; i++) {
			//System.out.print("Hello ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("Hello "+name);
		}
	}
}
