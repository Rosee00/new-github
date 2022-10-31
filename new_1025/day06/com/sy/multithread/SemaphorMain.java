package com.sy.multithread;

import java.util.concurrent.Semaphore;

public class SemaphorMain {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);
		
		Thread th1 = new Thread(new SemaphoreThread("유재석", semaphore));
		Thread th2 = new Thread(new SemaphoreThread("김종국", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("지석진", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("하하", semaphore));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}