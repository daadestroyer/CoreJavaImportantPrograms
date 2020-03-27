package com.koolnigam.app18;


class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("I'm lazy thread "+i);
		}
		System.out.println("I want to sleep");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
	
}
public class App18Interrupt {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt(); // main thread is waiting for child thread that whenever child thread goes to sleep or wait state after completing her task main will interrupt the child
		System.out.println("End of main method");

	}

}
