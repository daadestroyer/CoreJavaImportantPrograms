package com.koolnigam.app22;


class ShubhanshuThread extends Thread{
	public void run() {
		System.out.println("Shubhanshu Boarding Started"+"\n");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
			}
			System.out.println("Shubhanshu Departed From Lucknow Airport"+"\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
			}
			for (int i = 1; i <= 5; i++) {
				System.out.println("Shubhanshu is in air....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Shubhanshu Accident Occured !!!");
					e.printStackTrace();
				}
			}
			System.out.println("\n"+"Hello Shubham This Is Shubhanshu I'm Reached To Bengaluru");
			synchronized(this) {
			notify();
		}
	}
}
public class App22ThreadComm {

	public static void main(String[] args) throws InterruptedException {
		ShubhanshuThread st = new ShubhanshuThread();
		st.start();
		System.out.println("Shubham Is Waiting To Get Notification From Shubhanshu"+"\n");
		synchronized(st) {            
			st.wait();       
		}
		
		
		
		System.out.println("\n"+"Ok Shubhanshu Take Care...");
	}

}
/* the main thread which is calling wait() should be the owner of that object i.e main thread should have  
 have lock of that object once Thread call wait method on the given object 1st it release lock of 
			                  current object and then it should be enter in the waiting state */ 
