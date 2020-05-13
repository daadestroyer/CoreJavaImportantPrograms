package com.koolnigam.app24;

class ChildThread extends Thread{
	public void run() {
		Thread.currentThread().setName("Child Thread");
		System.out.println(Thread.currentThread().getName()+" is Daemon Thread or not : "+Thread.currentThread().isDaemon());
	}
}
public class App24_DaemonThread {

	public static void main(String[] args) {
		System.out.println("main thread is Daemon or not :"+Thread.currentThread().isDaemon()); // false main thread is non-daemon thread.
		ChildThread c = new ChildThread();
	    c.setDaemon(true);  
		                   
		c.start();
	 // c.setDaemon(true); // if we change the nature of Child thread as Daemon thread before starting child thread we will get
		                   //RE: IllegalStateException
	}

}
