package com.koolnigam.app5;
/*
ACCESSING INNER CLASS CODE FROM INSTANCE ARE OF OUTER CLASS
=========================================================
1. To call Inner class m1 method compulsory we've to create Inner class object because it is instance member
2. But first we've to create Outer class object after that we've to create Inner class object because without creating Outer class object creation of Inner class object
   isn't allow
3. 
*/
class Outer {
	class Inner {
       public void m1() {
    	   System.out.println("Inner class m1 method");
       }
	}
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args) {
	Outer o = new Outer();
	o.m2();
	}
	
}
