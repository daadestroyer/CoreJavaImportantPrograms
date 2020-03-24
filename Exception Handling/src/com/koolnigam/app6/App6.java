package com.koolnigam.app6;

public class App6 {

	static void doStuff() throws InterruptedException{
		Thread.sleep(5000);
	}
	static void doMoreStuff() throws InterruptedException {
		doStuff();
	}
	public static void main(String[] args) throws InterruptedException {
		doMoreStuff();
    }

}
/*
THROWS:-
========
>>> in our program if there is any chance or raising checked exception then compulsort we've to handle that exception by throws or 
    try-catch
>>> we'll use throws keyword to deligate the responsiblity of exception handling to called method
>>> throws keyword is use for checked exception , if we use throws keyword for unchecked then there is no use
>>> we use throws keyword for Throwable type only otherwise we will get CE:
*/
