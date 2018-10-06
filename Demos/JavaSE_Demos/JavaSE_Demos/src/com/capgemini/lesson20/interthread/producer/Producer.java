package com.capgemini.lesson20.interthread.producer;

import com.capgemini.lesson20.interthread.factory.Factory;

public class Producer extends Thread {

	private Factory factory;
	private int speed;

	public Producer(Factory factory, int speed) {
		super();
		this.factory = factory;
		this.speed = speed;
	}

	public   void  run()
	{
		for(int i=1 ;i<=10 ;i++)
		{
			factory.set(i);
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
