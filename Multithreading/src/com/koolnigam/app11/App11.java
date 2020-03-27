package com.koolnigam.app11;
/*
>>> Default priority for main thread (parent thread) is 5 
>>> Default priority for all child thread except main will be inherited from parent thread
*/
class MyThread extends Thread{
	
}
public class App11 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority()); // 5 which is default set by JVM
	//	Thread.currentThread().setPriority(15); // RE: Exception in thread "main" java.lang.IllegalArgumentException 
        Thread.currentThread().setPriority(7);
        MyThread t = new MyThread(); // main thread create child thread so whatever parent thread have priority child also have same priority
        System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
        System.out.println("Child Thread "+t.getPriority());
        
	}

}
