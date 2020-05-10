package com.test.ravi;


public class PerformThread implements Runnable {
	
	int number;
	public PerformThread(int number) {
		this.number=number;
	}

	@Override
	public void run() {
		System.out.println(number);
	}

}
