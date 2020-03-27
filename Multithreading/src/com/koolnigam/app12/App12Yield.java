package com.koolnigam.app12;

// in this example main thread will get more chance to execute her task because child thread call yield() after doing her 1 task
// hence main thread complete her task first
// if line Thread.yield() will be commented then which thread will complete first we can expect it may be child thread or main thread

class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child-Thread");
			Thread.yield();  // this line executed by child thread and child thread will be paused and give chance to execute main thread
		}
	}
}
public class App12Yield {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();  // after this line there are 2 Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main-Thread");
		}
		

	}

}
