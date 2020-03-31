package com.koolnigam.app13;

 class PopCorn{
	public void taste() {
		System.out.println("Simple Taste");
	}
	// 100 more methods are there
}
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
    	PopCorn p = new PopCorn() // first anonymous inner class present in Test named with Test$1.class 
    			                  // here we created Test$1.class object
        { // creating a class that extends pop corn 
    		public void taste() { // this is overrided method
    			System.out.println("Spicy Taste");
    			
    		}
    	};
    	System.out.println(p.getClass().getName()); // by this we can check also which class object created 
    	p.taste();
    		
    	PopCorn p1 = new PopCorn();
    	p1.taste();
    	
    	PopCorn p2 = new PopCorn() // second anonymous inner class present in Test named with Test$2.class
    							   // here we created Test$2.class object
    	{
    		public void taste() {
    			System.out.println("Sweet Taste");
    		}
    	};
    	System.out.println(p.getClass().getName());
    	p2.taste(); 
    }
	

}
/*
 PopCorn p = new PopCorn(){
 
 };
 
 here we create a class that extends a popcorn class and creating child class object by using parent class refrence
 
javac Test.java

after this 4 class file will be generated
Test.class
PopCorn.class
Test$1.class
Test$2.class
*/ 
 