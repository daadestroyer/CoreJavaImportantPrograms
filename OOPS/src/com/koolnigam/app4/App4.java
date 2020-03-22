package com.koolnigam.app4;

public class App4 {
    void m1(int a , long y) {
    	System.out.println("int-long");
    }
    void m1(long y , int a) {
    	System.out.println("long-int");
    }
	public static void main(String[] args) {
     App4 a = new App4();
    // a.m1(10, 10); // CE: refrence to m1 is ambigious
	 a.m1(10, 10L); // int-int
	 a.m1(10L,10); // long-int
	}

}
