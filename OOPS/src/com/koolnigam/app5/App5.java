package com.koolnigam.app5;

public class App5 {

	void m1(int i , float f) {
		System.out.println("int-float");
	}
	void m1(float f , int i) {
		System.out.println("float-int");
	}
	public static void main(String[] args) {
		App5 a = new App5();
		a.m1(1, 1.2F); // int-float
		a.m1(1.2F,1); // float-int
	//	a.m1(10,10); // CE: refrence to m1 is ambigious
	}

}
