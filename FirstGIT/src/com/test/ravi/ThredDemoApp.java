package com.test.ravi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThredDemoApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()* 2);
		PerformThread thread = new PerformThread(1);
		PerformThread thread1 = new PerformThread(2);
		PerformThread thread2 = new PerformThread(3);
		PerformThread thread3 = new PerformThread(4);
		PerformThread thread4 = new PerformThread(5);
		PerformThread thread5 = new PerformThread(6);
		
		/*
		 * for (int i = 0; i < 10; i++) { Future<String>
		 * result=executorService.submit(thread); System.out.println(result.get()); }
		 */
		
		
		Thread t=new Thread(thread);
		t.start();
		
		
		/*
		 * executorService.submit(thread); executorService.submit(thread1);
		 * executorService.submit(thread2); executorService.submit(thread3);
		 * executorService.submit(thread4); executorService.submit(thread5);
		 */
		
		
		
		
		
		
	}

}
