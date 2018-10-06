package com.capgemini.lesson20.interthread.ui;

import com.capgemini.lesson20.interthread.producer.Producer;
import com.capgemini.lesson20.interthread.consumer.Consumer;
import com.capgemini.lesson20.interthread.factory.Factory;

public class Main {

	
	public static void main(String[] args) {
		   Factory  factory = new Factory();
		   int consumerSpeed = Integer.parseInt(args[0]);
		   int producerSpeed = Integer .parseInt(args[1]);
		   Producer producer = new Producer(factory,producerSpeed);
		   Consumer consumer = new Consumer(factory,consumerSpeed);
		   
		   producer.start();
		   consumer.start();
		   
	}
}
