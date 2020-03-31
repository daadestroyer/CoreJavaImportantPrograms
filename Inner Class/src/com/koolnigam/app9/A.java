package com.koolnigam.app9;
/*
>>> Inside inner class we can declare another inner class , means nesting of inner classes is possbile 
*/
class A {
  class B{
	  class C{
		  public void m1() {
			  System.out.println("m1 method of class C");
		  }
	  }
  }
  public static void main(String[] args) {
	  new A().new B().new C().m1(); // way-1
     
	  A a = new A(); // create A object
	  A.B b = a.new B(); // create b object by using class A refrence method
	  A.B.C c = b.new C(); // create c object by using class B refrence method
	  c.m1();
  }
}
