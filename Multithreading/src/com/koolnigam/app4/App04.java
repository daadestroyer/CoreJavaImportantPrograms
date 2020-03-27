package com.koolnigam.app4;

class MyThread extends Thread{
	public void run() {
		System.out.println("Run method");
	}
	public void start() {
		System.out.println("Start method");
	}
}

public class App04 {

	public static void main(String[] args) {
		MyThread t = new MyThread(); // main thread create Child thread
		t.start();                   // main thread start Child thread
      /*
       if we override start() then our start() will be executed just like normal method as our overrided start() has not much capablity
       to start thread at that time no thread will be started
       >>> it i never recommended to override start()
     */
	}

}
