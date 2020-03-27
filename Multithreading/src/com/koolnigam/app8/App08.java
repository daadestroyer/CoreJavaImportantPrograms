package com.koolnigam.app8;
/*
************Not Recommended To Use************
*/
class MyThread extends Thread{
	public void run() {
		System.out.println("Child-Thread");
	}
}
public class App08 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main-Method");
	}

}
