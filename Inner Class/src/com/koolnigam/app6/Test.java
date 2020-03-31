package com.koolnigam.app6;
/*
ACCESSING INNER CLASS CODE FROM OUTSIDE OF OUTER CLASS
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
}
class Test{
	public static void main(String[] args) {
		new Outer().new Inner().m1(); // way-1
		
		Outer o = new Outer(); 
		Outer.Inner i = o.new Inner(); // way-2
		i.m1();
	}
}
