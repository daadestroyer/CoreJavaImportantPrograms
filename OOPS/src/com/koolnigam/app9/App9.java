package com.koolnigam.app9;

class P{
   void m1(int...i) {
	   System.out.println("Parent class var-args method");
   }	
}
class C extends P{
      void m1(int... i) {
    	  System.out.println("Child class single args method");
      }
}
public class App9 {

	public static void main(String[] args) {
		P p = new C();
		p.m1(10);

	}

}
/*
overloading & methodhiding --->method call based on runtime refrence
overriding ---> method call based on runtime object
*/
 