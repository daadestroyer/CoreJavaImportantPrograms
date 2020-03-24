package com.koolnigam.app3;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter 1st number");
			int a = sc.nextInt();
			System.out.print("Enter 2nd number");
			int b = sc.nextInt();
		    System.out.println("\n"+"Answer is : "+a/b);
			
		} catch (ArithmeticException e) {
		  System.out.println("Arithmetic Exception");
		}
		catch (Exception e) {
		  System.out.println("Exception");
		}
		finally{
			System.out.println("Finally exectuted");
		}
   }

}
/*
FINALLY BLOCK:-
====================
>>> Finally is the block which will executed always whether any exception is raised or not raised , the work of finally block is to
    free up the resources which was previously initialized finally block is also called as resource clean up block
>>> It is not recommended to write the clean up code inside the try block because there is no gurantee of execution of try block
    always
>>> It is not recommended to write the clean up code inside the catch block because there is no gurantee of execution of catch block
    always
    try{
    ---risky code---
    }
    catch(Exception e){
    ---handling code---
    }
    finall{
    ---resource cleanup code---
    }
*/