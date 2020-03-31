package com.koolnigam.app11;

class Outer {
	int a = 10;
	static int b = 20;
  public void m1() {
	  int c = 30;
	  final int d = 40;
	  
	   class Inner{
		  void m2() {
			  System.out.println(a);
			  System.out.println(b);
			  System.out.println(c);
			  System.out.println(d);
		 }
	  }
	  new Inner().m2();
  }
  public static void main(String[] args) {
	  new Outer().m1();
  }
}


