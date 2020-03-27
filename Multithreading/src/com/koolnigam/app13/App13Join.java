package com.koolnigam.app13;

class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread Executing After 2 Seconds");
			try {
				Thread.sleep(2000); // Seeta minimum sleeps 20 Second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class App13Join {
    public static void main(String[] args) throws InterruptedException {
    	MyThread t = new MyThread();
    	t.start(); // after this line there are thread
    	//t.join(); // after this line Main thread enter into waiting state Untill Child thread completed and Child thread get the chance to execute
    	t.join(5000);// main thread is setting deadline of waiting is 10000 ms if Child thread can't complete in 10000 MS then Main thread will be executed 
    	
    	for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
    }
}
