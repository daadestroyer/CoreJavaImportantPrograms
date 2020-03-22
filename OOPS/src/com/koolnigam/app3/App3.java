package com.koolnigam.app3;

public class App3 {

	void m1(String a) {
		System.out.println("String method");
	}
	void m1(StringBuffer a) {
		System.out.println("StringBuffer method");
	}
	public static void main(String[] args) {
		App3 a = new App3();
		a.m1("Shubham"); // String method
		a.m1(new StringBuffer("Shubham")); // StringBuffer method
		// a.m1(null); // CE: Failure of overloading refrence to m2 is ambigous
	}
}
