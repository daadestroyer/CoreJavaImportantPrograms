package com.koolnigam.app10;

class MethodLocalInnerClass {
    int x = 10;
    static int y = 20;
  public void m1() {
	  class Inner{
		  void sum(int x , int y) {
			  System.out.println("Sum is : "+(x+y));
		 }
		  void m2() {
			  // Outer o = new Outer();
			  System.out.println("value of x is : "+x);
			  //  System.out.println("value of x is : "+o.x); // non-static members can't access if we declare m1() as static coz from static context we can't access non-static member directly
			  System.out.println("value of y is : "+y);
		  }
	  }
	  Inner i = new Inner();
	  //i.sum(10, 20);
	  i.m2();
	  i.sum(10, 20);
  }
  
  public static void main(String[] args) {
     new MethodLocalInnerClass().m1();	  
  }
}
/*
>>> we can access method local inner class only within method where we declared it i.e from outside of the method we can't access because it is local to that method and its having less scope
>>> we can declare method local inner class inside both static and non-static method
>>> if we're declaring method local inner class inside instance method then we can access both static and non-static members of outer class directly
>>> but if we're declaring method local inner class inside static method then we can access static members of outer class directly and we can't access instance member directly
*/
