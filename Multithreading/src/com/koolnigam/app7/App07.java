package com.koolnigam.app7;
/*
>>> We can also create Thread by implementing Runnable interface
>>> Runnable interface only contain run() and doesn't contain start()
*/
class MyThread implements Runnable{
	public void run() {
		System.out.println("Run-Method");
	}
}
public class App07 {

	public static void main(String[] args) {
	    MyThread r = new  MyThread();
	    Thread t = new Thread(r); // As Runnable interface won't contain start() 
	    t.start(); /* Here we're creating object of class Thread and called start() which is present in Thread class
	                  as we're calling Thread class start() internally Thread class start method called run() so by this our implemented run() won't call
	                  for this problem we're passing MyThread refrence variable 'r' to Thread constructor
	    */
	    
	    
	}

}
