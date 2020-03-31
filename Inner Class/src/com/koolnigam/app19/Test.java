package com.koolnigam.app19;

class Test 
{
    static class NestedClass // here Test$NestedClass created
    {
    	public static void main(String[] args)
    	{
    		System.out.println("Static nested class main method");
    	}
    }
	 
	public static void main(String[] args) {
		System.out.println("Outer class test main method");

	}

}

/*
javac Test.java
java Test---> Outer class test main method
java Test$NestedClass ---> static nested class main method
*/
 