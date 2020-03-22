package com.koolnigam.app6;

public class App6 {
    void m1(int...i) {
    	System.out.println("Var-args method");
    }
    void m1(int i) {
    	System.out.println("Normal Method");
    }
	public static void main(String[] args) {
    App6 a = new App6();
    a.m1(1,2,3); // Var-args method
    a.m1(1);  // Normal Method
    a.m1(); // Var-args method
	}

}
