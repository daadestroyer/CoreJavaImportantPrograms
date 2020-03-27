package com.koolnigam.app1;
// Defining Thread by extedning Thread class
/*
1. Override run() which is present in Thread class this total process is called defining a thread
2. Whatever the code we write in run() is the job of thread which is performed by thread or u can say run()
3. Every java program can contain one thread which is by default main thread but internally there are many thread
*/

class MyThread extends Thread{
	public void run() {
		 for (int i = 0; i < 10; i++) {
			System.out.println("Job Of Child Thread");
		  }	
		}
}
public class App01 {
	
	public static void main(String[] args) { // main is default thread  
       MyThread t = new MyThread(); 		 // main thread create Child thread
       t.start(); 						     // main thread start Child thread
                                             //--> at this line there are 2 thread main and MyThread
                                            //--> at this line if we use run() then there is only 1 thread which is main
       for (int i = 0; i < 10; i++) {
			System.out.println("Job Of Main Thread");
	}	
	}

}
