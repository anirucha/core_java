package com.capgemini.lesson20.nonsynchronization;
public class NonSyncDemo {
	public static void main(String[] args) {
		Display display = new Display();
		MyThread myThread1 = new MyThread(display, "Dhoni");
		MyThread myThread2 = new MyThread(display, "Kohli");
		myThread1.start();
		myThread2.start();
	}
}