package com.koolnigam.app10;


class MyThread extends Thread{
	public void run() {
		// System.out.println("Run method executed Thread "+Thread.currentThread().getName());
		Thread.currentThread().setName("MyThread");
		System.out.println("Run method executed Thread "+Thread.currentThread().getName());
	}
}
public class App10 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); // After this line there are 2 Thread
		System.out.println("Main method execute by Thread "+Thread.currentThread().getName());
		MyThread.currentThread().setPriority(1);
		System.out.println(MyThread.currentThread().getPriority());
		
	}

}
