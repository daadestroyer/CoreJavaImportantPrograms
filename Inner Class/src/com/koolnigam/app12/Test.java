package com.koolnigam.app12;
// valid modifier for method local inner classes are final , abstract , strictfp
class Test 
{
	int i = 10;
	static int j = 20;
   
	 public void m1() 
	 {
		 int k = 30;
		 final int m = 40;
		 
		  class Inner
		 {
			 public  void m2() 
			 {
				 System.out.println(i);  // if m2 method declare static then i we can't access directly
				 System.out.println(j);  
				 System.out.println(k);    
				 System.out.println(m);   
			 }
		 }
		Inner i = new Inner();
		i.m2();
	 }
	 
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
	
}
