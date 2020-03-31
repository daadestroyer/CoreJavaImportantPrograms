package com.koolnigam.app4;
/*
ACCESSING INNER CLASS CODE FROM STATIC ARE OF OUTER CLASS
=========================================================
1. To call Inner class m1 method compulsory we've to create Inner class object because it is instance member
2. But first we've to create Outer class object after that we've to create Inner class object because without creating Outer class object creation of Inner class object
   isn't allow
3. 
*/
class Outer {
  class Inner{
	  public void m1() {
		  System.out.println("inner class method");
	  }
  }
  public static void m2() {
	  System.out.println("outer class method");
  }
  public static void main(String[] args) {
	/*
	   Outer o = new Outer(); // by using this create Inner class object
	   Outer.Inner i = o.new Inner(); // by using outer class refrence create inner class object
	   i.m1();
	   o.m2();
	*/
	  
	/*
	// Combining above two line
	Outer.Inner i = new Outer().new Inner();
    Outer.m2();
	i.m1();
	*/
	
	/*
	new Outer().m2();
	new Outer().new Inner().m1();
    */
  }
}

