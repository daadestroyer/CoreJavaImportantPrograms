package com.koolnigam.app7;
/*
ACCESSING ALL MEMBERS OF OUTER CLASS (private,static,non-static,non-private members) FROM INNER CLASS
======================================================================================================
1. To call Inner class m1 method compulsory we've to create Inner class object because it is instance member
2. But first we've to create Outer class object after that we've to create Inner class object because without creating Outer class object creation of Inner class object
   isn't allow
3. 
*/
class Outer{	
	int x = 10;
	static int y = 20;
	
	static void m1() {
		System.out.println("Outer class static m1 method");
	}
	void m2() {
		System.out.println("Outer class instance m2 method");
	}
	class Inner{
		public void m1() {
			System.out.println(x+" "+y);
			m1();
			
		}
	}
	public static void main(String[] args) {
       new Outer().new Inner().m1(); // way-1
	}

}
