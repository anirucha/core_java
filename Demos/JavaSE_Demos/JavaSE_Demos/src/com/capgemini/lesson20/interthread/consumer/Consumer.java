package com.capgemini.lesson20.interthread.consumer;

import com.capgemini.lesson20.interthread.factory.Factory;

public class Consumer extends Thread {

	private Factory factory;
	private int speed;

	public Consumer(Factory factory, int speed) {
		super();
		this.factory = factory;
		this.speed = speed;
	}

	public  void  run()
	{
		for(int i=1 ;i<=10 ;i++)
		{
			factory.get();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
