package com.koolnigam.app23;


class A{
	public synchronized void d1(B b) {	
		System.out.println("Thread-1 Starts Executiong Of d1 Method");
	  try {
          Thread.sleep(5000);		
	} catch (Exception e) {
    }
	  System.out.println("Thread-1 Trying To Call B last method...");
	  b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A Last Method");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread-2 Starts Executiong Of d2 Method");
	  try {
          Thread.sleep(5000);		
	} catch (Exception e) {
    }
	  System.out.println("Thread-2 Trying To Call A last method...");
	  a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B Last Method");
	}
}

public class App23Deadlock extends Thread{
    
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start(); //all the current object class Thread will be started
		a.d1(b); // this executed by main thread
		
	}
	public void run() {
		b.d2(a); // this executed by child thread
	}
	
	public static void main(String[] args) {
		App23Deadlock a23 = new App23Deadlock();
		a23.m1();
		
	}

}
