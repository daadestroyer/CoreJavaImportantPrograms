/*
DEFAULT EXCEPTION HANDLING MECHANISM
====================================
1. If an exception is arises in any method then it is the responsiblity of that method to handle that exception with the following 
   details >>name of exception >>description of exception >>location of exception
2. JVM check whether this method will handle the exception or not if not then JVM abnormally terminate the method
3. JVM check whether is there any caller method which call the method which is not handling exception then it is the respnsiblity of
   caller method to handle the exception if the called method also don't handle the exception than JVM also terminate called method
   abnormally
4. this process goes until reaching to the main and if main also don't handle the exception JVM handover the responsiblity to Default
   exception handling



*/
package com.koolnigam.app1;


public class App1 {
	

	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		finally {
		   
		}
	}
	/*
	public static void m1() {
		System.out.println(10/0);
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args){
     m2();
	}
	*/
  
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero

