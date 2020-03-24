package com.koolnigam.app7;

public class App7 {

	public static void main(String[] args) throws InterruptedException {
		try {
	        	System.out.println("Ghar se nikal gaye");
	        	System.out.println("Raste me police ne roka");
				System.out.println(10/0);
				System.out.println("Friend Party");
			} catch (ArithmeticException e) {
				System.out.println("Accident Hogaya Hospital Agaye");
			}
		}

}
