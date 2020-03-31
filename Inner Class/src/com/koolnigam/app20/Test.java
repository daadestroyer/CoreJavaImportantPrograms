package com.koolnigam.app20;

class Test 
{
	int x = 10;
	static int y = 20;
	
    static class Nested
    {
      public void m1()
      {
    	  final int y = 2000;
    	  //Test t = new Test();
    	  // System.out.println(t.x); // from static context we can't access non-static variable of outer class directly
    	  System.out.println(y);
    	  System.out.println(Test.y);
      }
    }
	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();

	}

}
