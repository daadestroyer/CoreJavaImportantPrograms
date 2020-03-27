package com.koolnigam.app9;

class MyThread extends Thread{
	
}
public class App09 {

	public static void main(String[] args) {
	  System.out.println(Thread.currentThread()); // by this we can find total current thread
	  System.out.println(Thread.currentThread().getName()); // name of current thread
	  MyThread t = new MyThread();
	  System.out.println(t.getName()); // Thread-0 default name given by JVM
	  Thread.currentThread().setName("Shubham-Thread");
	  System.out.println(Thread.currentThread().getName());
	  // System.out.println(10/0); // Exception in thread "Shubham-Thread" java.lang.ArithmeticException: / by zero
	}

}
