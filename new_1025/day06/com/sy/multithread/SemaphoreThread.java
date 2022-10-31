package com.sy.multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreThread implements Runnable {

	String message;
	Semaphore semaphore;

	public SemaphoreThread(String message, Semaphore semaphore) {
		this.message = message;
		this.semaphore = semaphore;

	}

	@Override
	public void run() {
		try {
			//리스소 확보
			semaphore.acquire();
			Thread.sleep(10000);
			System.out.println(message);
		} catch(Exception e) {}
		//리소스 해체
		semaphore.release();

	}


}
