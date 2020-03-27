package com.koolnigam.app3;
/*
We can overload run() but Thread class start() always invoke no args run() the other overload run() we've to call explicitly then it
will executed like normal method call
*/
class MyThread extends Thread{
	 public void run() {
		 System.out.println("No-args run");
	 }
	 public void run(int a) {
		 System.out.println("int-args run");
	 }
}
public class App03 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}

}
