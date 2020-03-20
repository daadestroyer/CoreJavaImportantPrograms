package com.koolnigam.app4;

public class App4_Equality_Operator {

	public static void main(String[] args) {
     // equality operator can be applied on primitive and object type including boolean also
	 // == operator is use to compare refrence

	/*
		System.out.println(10==20); // false
		System.out.println(10==10); // true
		System.out.println('a'=='b'); // false
		System.out.println(false==false); // true
	*/
		
    /*		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t3 = t1;
		
		System.out.println(t1==t2); // false
		System.out.println(t1==t3); // true
    */
	
    /*
	String s1 = new String("ashoka");
	String s2 = new String("ashoka");
	System.out.println(s1==s2); // false
	s1 = s2;
	System.out.println(s1==s2); // true
	System.out.println(s1.equals(s2)); // true
    */

		
/*=====================================================================================================*/ 

/*
Q. Difference b/w new operator and newInstance():-

Ans:-
new operator:-
-------------
1. it is used to create object
2. if we know the class name at begining then we can use it for creation of object

Test t = new Test();

3. if class is not found then error will be CE: NoClassDefFoundError

newInstance():-
-------------
1. newInstance() is used to create object
2. if we don't know the class name at begining then we can use it for object creation
 
  Object o = Class.forName(arg[0]).newInstance();
 
3. if class is not found then error will be CE: ClassNotFoundException



*/	
	
	
	
	
	}

}
