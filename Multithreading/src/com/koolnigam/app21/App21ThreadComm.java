package com.koolnigam.app21;


class ThreadB extends Thread{
	int total = 0;
	public  void run() {
		synchronized(this) {
			System.out.println("Child Start Calculating");
			for (int i = 1; i <= 100; i++) {
				total = total+i;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Giving Notification To Main");
			this.notify(); // notify to main when child completed
		}
	}
}
public class App21ThreadComm {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start(); // after this there are 2 thread 
		// Thread.sleep(1000); // main sleep for 10 second meanwhile child get chance first
		// b.join();
		//Thread.sleep(10000);
		synchronized(b) {
			System.out.println("Main Thread Calling Waiting Method");
			b.wait(); // it will wait until child is not completed and child will notify to main also , and we can call wait(),notify(),notifyAll() in synchronized area only
			
		}
		Thread.sleep(2000);
		System.out.println("Main Got Notification");
		System.out.print(b.total);
		
	}

}
/*
>>> it is never recommended to call sleep() for getting some updation because if we call sleep() for 10 second and updation is ready with in 1 nano second then
    in remaining time thread is sleeping unnecessary and may be thread will awake for some given time but updation will not performed in that time so we get 
    intermediate value 

>>> we can also don't use join() to get updation because if child thread is completed then immediatly main will get the lock but suppose after completing child 
    thread if child want to execute some other task then that time main is waiting unnecessary it increases waiting time of main , it means after completing 
    updation then also main thread is waiting for child as main can join when child thread is completed  
*/
 