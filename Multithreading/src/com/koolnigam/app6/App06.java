package com.koolnigam.app6;

class MyThread extends Thread{
	public void run() {
		System.out.println("Run-Method");
	}
}
public class App06 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		// t.start(); After starting Thread Lifecycle if we again trying to start the Thread Lifecycle then we get RE: saying : IllegalThreadStateException
		
	}

}
