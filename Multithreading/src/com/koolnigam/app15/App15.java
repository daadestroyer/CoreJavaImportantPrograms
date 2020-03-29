package com.koolnigam.app15;

// Child thread wait for main after that child complete her task
class MyThread extends Thread{
	 static Thread mt;
	public void run() {
	    try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class App15 {

	public static void main(String[] args) throws InterruptedException {
		// Thread.currentThread.join(); // this line executed by main it means main thread wait for herself forever it is deadlock state
		MyThread.mt = Thread.currentThread();	 
		MyThread t = new MyThread();
		t.start();
		// t.join(); // here if we use this both main and child thread wait forever for each other it is deadlock situation 
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}

	}

}
