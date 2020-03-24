package com.koolnigam.app2;


import java.io.IOException;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
	
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
	    System.out.println(a/b);
	}
	catch (NullPointerException e) {
		System.out.println("Null Pointer Exception");
	}
    catch (IndexOutOfBoundsException e) {
    	System.out.println("Index Out Of Bound Exception");
	}
    
    catch (ArithmeticException e) {
    	System.out.println("Arithmetic Exception");
	}
    catch (Exception e) {
    	System.out.println("Exception");
	}
    
  }
}
