package com.koolnigam.app21;
/*
>>> We can declare an interface inside another interface , nested interface are always public , static hence we can implement another interface directly without implementing Outer interface
*/


interface Outer
{
  public void OuterMethod();
  
  interface Inner
  {
	  public void InnerMethod();
  }
}

class Demo1 implements Outer , Outer.Inner
{
  public void OuterMethod()	{
	  System.out.println("Demo1 outer class method");
  }

  public void InnerMethod() {
	 System.out.println("Demo1 inner class method");
  }
}

class Demo2 implements Outer.Inner
{
	public void InnerMethod() {
		 System.out.println("Demo2 inner class method");
	  }
}

class Test {

	public static void main(String[] args) {
		new Demo1().OuterMethod();
		new Demo1().InnerMethod();
		new Demo2().InnerMethod();
	}

}
