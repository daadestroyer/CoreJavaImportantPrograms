package com.koolnigam.app2;

public class App2 {

	void m1(String a) {
		System.out.println("String method");
	}
	void m1(Object O) {
		System.out.println("Object method");
	}
	public static void main(String[] args) {
		App2 a = new App2();
		a.m1("Shubham");
		a.m1(new Object());
		a.m1(null);
	}
}
