package com.koolnigam.app2;
/*
If we're not overriding run() then Thread class run() will be executed which has empty implementation and hence we won't get any output
it is highly recommended to override run() otherwise don't go for multithreading concept
*/
class MyThread extends Thread{
	
}
public class App02 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

	}

}
