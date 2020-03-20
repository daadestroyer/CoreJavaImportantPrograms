package com.koolnigam.app1;

public class App1_Datatype_and_Identifier {

	public static void main(String[] args) {
	//	boolean b1 = true;
	//	boolean b2 = True; // CE: 
	//	boolean b3 = "True"; // CE: incompatible type String can't assign to boolean
	//	boolean b4 = 0; // CE: incompatible type int can't assign to boolean

		
/*
Decimal literals allowed digits are 0 to 9
Octal literals allowed digits are 0 to 7
Hexadecimal literals allowed digits are 0 to 9 , A to Z [A-->10,B-->11] 

*/	
   //  int x = 0x10; // --> 16
   //  int x = 0776; // --> valid
   //  int x = 0778; // --> invalid octal no to large
   //  int x = 0xFACE; // --> valid
   //  int x = 10; // valid
   //  int x = 010; // valid
   //  int x = 0x10; // valid
		
/*
1. By default every integral is of int type
2. By default every floating point is of double type
3. Decimal,Octal,Hexadecimal always work on integral value only
   if we use floating point in Octal it is treated as decimal
   if we use floating point in Hexadecimal it is malformed error 
*/
	
		
	// int x = 10; // valid
	// long l = 10L; // valid
	// long l = 10; // valid
	// int x = 10L; // invalid
	 
	// float f = 123.456;     // invalid CE: double can't assign to float
    // float f = 123.456F;    // valid	
	// double d = 123.456;    // valid
	// double d = 123.456D;   // valid
    // double d = 0123.456;   // valid but it is treated as decimal not octal
	// double d = 0x123.456;  // malormed error floating point can't valid in hexadecimal
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
