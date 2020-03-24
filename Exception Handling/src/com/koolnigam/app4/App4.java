package com.koolnigam.app4;

import java.util.Scanner;

public class App4 {

	static String m1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number");
		int b = sc.nextInt();
	   
		try {
			 System.out.println("\n"+"Answer is : "+a/b);
			// System.exit(0); // if we use this statement finally won't be execute
			 return "try-executed";
		} catch (Exception e) {
			return "catch-executed";
			
		}
		finally {
			return "finally-executed";
		}
	}
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
/*
RETURN VS FINALLY BLOCK:-
======================== 
>>> Even thru try block contain some return statement but 1st finally block will be executed then after that return statement consider
>>> It means that finally block dominates return statement

*/
