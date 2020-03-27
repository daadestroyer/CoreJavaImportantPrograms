package com.koolnigam.app17;


class MyThread extends Thread{
	public void run() {
		try {
		 for (int i = 0; i < 10; i++) {
			System.out.println("I'm always lazy thread");
			Thread.sleep(2000); // whenever child thread sleep then main thread interrupt child thread
		}	
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
public class App17Interrupt {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); // after this line there are 2 thread after this line main thread is responsible to execute that line
		t.interrupt(); // this line executed by main thread means main thread interrupt child thread
		System.out.println("End of main");
	}

}
