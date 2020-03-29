package com.koolnigam.app19;

class Display{
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning : ");
			try {
			    Thread.sleep(1000);	
			} catch (InterruptedException e) {
			
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	
	String name;
	Display d;
	MyThread(Display d , String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
	
}
public class App19SynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		//Display d2 = new Display();
		MyThread t1 = new MyThread(d1,"Dhoni");
		MyThread t2 = new MyThread(d1,"Sachin"); // there is no gurrantee that which thread get lock 1st depend on JVM and default priority
		//MyThread t3 = new MyThread(d,"Kohli");
		//MyThread t4 = new MyThread(d,"Rohit");
        t1.start();
        t2.start();
        //t3.start();
        //t4.start();
	}

}
