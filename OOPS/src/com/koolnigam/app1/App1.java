package com.koolnigam.app1;

public class App1 {

	void m1(int i) {
		System.out.println("M1 of int");
	}
	void m1(float f) {
		System.out.println("M1 of float");
	}
	public static void main(String[] args) {
		App1 a = new App1();
		a.m1(10);
		a.m1(10.f);
		a.m1('a');
		a.m1(10L);
	}

}
