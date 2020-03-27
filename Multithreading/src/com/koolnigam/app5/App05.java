package com.koolnigam.app5;

class MyThread extends Thread{
	public void start() {
		super.start(); // calling Thread class start() after super.start() there are two thread main and MyThread
		System.out.println("Start-Executed");
	}
	public void run() {
		System.out.println("Run-executed");
	}
}
public class App05 {

	public static void main(String[] args) {
		MyThread t = new MyThread(); // Main Thread create Child Thread
		t.start(); 
	}

}
