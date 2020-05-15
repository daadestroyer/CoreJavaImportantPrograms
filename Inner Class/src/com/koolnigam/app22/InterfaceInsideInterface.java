package com.koolnigam.app22;

interface OuterI{
	public void OuterMethod();
	
	interface InnerMethod{
	  public void InnerMethod();	
	}
}

class Demo implements OuterI , OuterI.InnerMethod{
	public void OuterMethod() {
		System.out.println("this is outer method");
	}
	public void InnerMethod() {
		System.out.println("this is inner method");
	}
}
class InterfaceInsideInterface {
    public static void main(String[] args) {
		new Demo().OuterMethod();
		new Demo().InnerMethod();
	}
}
