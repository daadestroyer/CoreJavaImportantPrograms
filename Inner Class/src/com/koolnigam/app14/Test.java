package com.koolnigam.app14;

class PopCorn
{
  public void taste()
  {
	  System.out.println("Normal Taste");
  }
}
public class Test {

	public static void main(String[] args) {
		PopCorn p = new PopCorn()
		{
			public void taste()
			{
				System.out.println("Spicy Taste");
			}
			public void m1()
			{
				System.out.println("M1 of Inner class Test$1");
			}
			
		};
		PopCorn p1 = new PopCorn();
		p1.taste();
		p.taste();
		
		/* p.m1(); // here we can't call this because during object creation of Inner class of Test which is Test$1.class we use parent refrence to hold child object so by using parent refrence we 
		 can't call child class method that's why we can't call m1()*/
	
	}

}
