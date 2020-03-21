package com.koolnigam.app1;

public class App1_Selection_Statement {

	public static void main(String[] args) {
        /*
		int x = 0;
        if(x) {
        	System.out.println("Hello");
        }
        else {
        	System.out.println("World");
        }
        */ // CE: if args contain boolean only
    
	   /*
	   int x = 10;
		if(x=20) {
			System.out.println("Hello");
		}
		else {
		    System.out.println("World");
		}
	   */ // CE: if args contain boolean only
	
	   /*
	   int x = 0;
	   if(x==20) {
		   System.out.println("Hello");
	   }
	   else {
		   System.out.println("World");
	   }
	   */  // x==20 is false and if always expects boolean type
		
		/*
		boolean b = false;
		if(b=true) {
			System.out.println("Hello");
		}
		else {
			System.out.println("World");
		}
	    */ // if argument always expects boolean type and assignment of boolean type in if is valid
		
		/*
		boolean b = false;
		if(b==true) {
			System.out.println("Hello");
		}
		else {
			System.out.println("World");
		}
		*/ // if argument always expects boolean type and comparison of boolean in if args is valid
		
		/*
		if(true) 
			System.out.println("Hello");
		else
			System.out.println("World");
		*/ // without curly braces it is valid but after if and else sopln should be next statement
		
		/*
		if(true); //semicolon is valid java statement
		*/
		
		/*
		if(true) 
			int x=10; //CE: without curly braces only sopln statement is allowed no declarative statement is allow
		*/
		
		/*
		if(true) {
			int x=10; //CE: with curly braces declarative statement is allow
		}
		*/
		
		/*
		if(true)
			System.out.println("Hello");
		*/
		
		
		/*
		int x = 20;
		int y = 30;
		if(x==10)
			if(y==20)
				System.out.println("Hello");
		    else System.out.println("World");
		    else System.out.println("Java");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
