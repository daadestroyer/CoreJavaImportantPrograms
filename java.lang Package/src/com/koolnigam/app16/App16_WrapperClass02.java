package com.koolnigam.app16;
/*

1. In all Wrapper class toString() is overridden directly to return it content
2. In all Wrapper class .equals() is overridden directly for content comparison 
3. Every wrapper class except character class contain static value of method to create wrapper object for the 
   given String
   
public static wrapper valueOf(String s)
======================================
>>> To create wrapper object for given primitive or String

public static wrapper xxxValue()
================================
>>> To convert wrapper object to primitive

public static primitive parseXxx(String s)
==========================================
>>> To convert String to respective primitive

public String toString(Object o)
==================================
>>> To convert wrapper object/primitive to String

*/
public class App16_WrapperClass02 {

	public static void main(String[] args) {

		/*
		public static wrapper ValueOf()
		===============================
		Integer i = Integer.valueOf("10");      // it take String and respective primitive also
		Double d = Double.valueOf("10.5");      // it take String and respective primitive also
		Boolean b = Boolean.valueOf("true");    // it take String and respective primitive also
		Boolean b1 = Boolean.valueOf("durga");  // it take String and respective primitive also
		Character c1 = Character.valueOf('a');  // it take only respective primitive but not String 
		System.out.println(i+" "+d+" "+b+" "+b1);
		*/

/**************************************************************************************************/
		
		/*
		public static wrapper valueOf(String s , int Radix)
		===================================================
		// this method is applicable in integral type wrapper classes [byte,short,int,long]
		Integer i = Integer.valueOf("1111");
		System.out.println(i); // 1111
		
		Integer i2 = Integer.valueOf("1111",2); // converting binary to decimal where 2 is decimal base
		Integer i3 = Integer.valueOf("1111",8); // taking octal base
		Integer i4 = Integer.valueOf("1111",16); // taking hexadecimal base 
		System.out.println(i2); // 15 is the decimal value of 1111
        */

/**************************************************************************************************/
		
		/*
		public dataType XxxValue()
        ============================
		public byte byteValue()     //--> used to convert Byte object to byte primitive
		public short shortValue()   //--> used to convert Short object to short primitive
		public int intValue()       //--> used to convert Integer object to int  primitive
		public long longValue()     //--> used to convert Long object to long primitive
		public float floatValue()   //--> used to convert Float object to Char primitive
		public double doubleValue() //--> used to convert Double object to Double primitive
	    public char charValue()     //--> used to convert Character object to char primitive
		*/
		
		/*
		Integer i = Integer.valueOf(130);
		System.out.println(i.intValue());    // 130
		System.out.println(i.byteValue());   // -126
		System.out.println(i.shortValue());  // 130
		System.out.println(i.longValue());   // 130
		System.out.println(i.floatValue());  // 130.0
		System.out.println(i.doubleValue()); // 130.0
		*/
		

/**************************************************************************************************/
		/*
		Integer I = Integer.valueOf("10");
		int i = I.intValue();
		System.out.println(i);
		
		Boolean B = Boolean.valueOf("durga");
		Boolean b = B.booleanValue();
		System.out.println(b);
		*/
		
/**************************************************************************************************/		
		
		/*
		public static primitive parseXxx() --> To convert String to respective primitive
		==================================
		*/
		
		// FORM-1
		/*
		int i = Integer.parseInt("10");
		System.out.println(i);
		float f = Float.parseFloat("10.4F");
		System.out.println(f);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		Double d = Double.parseDouble("10.502");
		System.out.println(d);
		*/
		
/**************************************************************************************************/				
		

		/*
		public String toString(Object o) ---> To convert wrapper object/primitive to String
		================================
		*/
		
		Integer I = Integer.valueOf("10");
		String s = I.toString();
		System.out.println(s);
		
		Boolean B = Boolean.valueOf("Durga");
		String b = B.toString();
		System.out.println(b);
		
		String S = Integer.toString(10); // 
		System.out.println(S);
		
		
		
		
		
		
		
		
    }

}	
