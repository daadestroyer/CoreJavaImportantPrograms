package com.koolnigam.app20;

class Display{
	public  synchronized void wish(String name) {
		/* 
	1 laks line of code
	  ------
	  ------
	  ------	   
		*/
		synchronized(Display.class) {
			for (int i = 0; i < 5; i++) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					
				}
				System.out.println(name);
			}
		}
		/* 
		1 laks line of code
		  ------
		  ------
		  ------	   
			*/
		 
	}
}
class MyThread extends Thread{
	Display d ; 
	String name;
	
	MyThread(Display d , String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
public class App20 {

	public static void main(String[] args) {
	  	Display d1 = new Display();
	  	Display d2 = new Display();
	  	MyThread t1 = new MyThread(d1,"Dhoni");
	  	MyThread t2 = new MyThread(d2,"Yuvaraj");
	  	t1.start();
	  	t2.start();
	}

}
