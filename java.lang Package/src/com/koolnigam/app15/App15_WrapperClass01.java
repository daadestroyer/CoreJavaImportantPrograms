package com.koolnigam.app15;

public class App15_WrapperClass01 {

	public static void main(String[] args) {
	
/*****************************************************************************************/
		
// All most all wrapper classes define 2 constructors one can take String and other can take respective primitive
// Integer wrapper class can have 2 constructor String and Int
	
   /*
   Integer i1 = new Integer(10);
   Integer i2 = new Integer("10");
   // Integer i3 = new Integer("ten"); // RE: NumberFormatException
   System.out.println(i1+" "+i2);
   */
		
/*****************************************************************************************/
		
// All most all wrapper classes define 2 constructors one can take String and other can take respective primitive
// Float wrapper class can have 2 constructor String and Float
		
   /*
   Float f1 = new Float(10.5f);
   Float f2 = new Float(10.5);
   Float f3 = new Float("10.5");
   System.out.println(f1+" "+f2+" "+f3);
   */

/*****************************************************************************************/		

// All most all wrapper classes define 2 constructors one can take String and other can take respective primitive
// Character wrapper class can have 1 constructor char 

	/*
	Character c1 = new Character('a');
 // Character c2 = new Character("a"); // invalid
    System.out.println(c1);
	*/

/*****************************************************************************************/

// All most all wrapper classes define 2 constructors one can take String and other can take respective primitive
// Boolean wrapper class can have 2 constructor char 
	
	/*
   	Boolean b1 = new Boolean(true);     // true
	Boolean b2 = new Boolean(false);    // false
	Boolean b3 = new Boolean("true");   // true
	Boolean b4 = new Boolean("false");  // false
	Boolean b5 = new Boolean("True");   // true
	Boolean b6 = new Boolean("False");  // false
	Boolean b7 = new Boolean("TRUE");   // true
	Boolean b8 = new Boolean("FALSE");  // false
	
	System.out.println(b1); // true
	System.out.println(b2); // false
	System.out.println(b3); // true
	System.out.println(b4); // false
	System.out.println(b5); // true
	System.out.println(b6); // false
	System.out.println(b7); // true
	System.out.println(b8); // false
	*/

/*****************************************************************************************/		

	/*	
    Boolean b1 = new Boolean("yes");
    Boolean b2 = new Boolean("no");
    System.out.println(b1); // false
    System.out.println(b2); // false
    System.out.println(b1.equals(b2)); // true
    // Case insensitive String of true gives ---> true
    // Case insensitive String if false gives ---> false
    // Other than String of true/false it always gives false
	*/
	
/*****************************************************************************************/
	}
	

}
