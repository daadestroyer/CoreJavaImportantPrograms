package com.koolnigam.app18;

class Outer {
    
	class Inner
	{
	  int x = 10;
	  
	  public void m1()
	  {
		  System.out.println("Inner class method "+x);
	  }
	}
	static class Nested // Internall generated .class file name is Outer$Nested
	{
		static int x = 10;
		
		public void m1()
		{
			System.out.println("Static class nested method "+x);
		}
	}
	public static void main(String[] args) {
     // To access static class nested variable we don't need Outer class object i.e Outer class and static class nested having week association 
		Nested n = new Nested();
		n.m1();
	
	// but to access Inner class variable we comulsory need object i.e Outer and Inner class having strong assocation
		new Outer().new Inner().m1();
		
	// if we want to create nested class object from outside outer class then we can create as follows
		Outer.Nested n1 = new Outer.Nested();
		
		
   // if we want to create Inner class object
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		
	}

}
