package com.koolnigam.app7;
/*
1. Once we create a String Object we can't perform any changes if we perform some changes with existing object then new Object will be created , it means String are immutable in nature .
2. Once we create a StringBuffer Object we can perform some changes with existing Object then no new object will be created a changes will happen in existing object that means StringBuffer are mutable
   in nature .
3. IMMUTABLE--> The in changeable behaviour of String object is called immutablity.
4. MUTABLITY--> The changeable behaviour of StringBuffer object is called mutablity. 
*/
public class App07_StringClassCase01{

	public static void main(String[] args) {

		// IN THE CASE OF STRING 
		String s = new String("String is");
		s.concat("Immutable");
		System.out.println(s); /* here we're trying to perform some changes with existing object of String so new object will be created but we can't hold it so thats't why it print Shubham only and
		                       that new object will be eligible for GC */
		
		String s1 = s.concat("Immutable"); // Here after performing changes will existing String object a new object will be created which we will store in s1 so it print ShubhamSoftware
		System.out.println(s1);
	
	   // IN THE CASE OF STRINGBUFFER 
		StringBuffer sb = new StringBuffer("StringBuffer is");
		sb.append("Mutable"); // Here in StrinngBuffer we perform some changes and that changes will be happen in existing object only no new Object will be created ..
		System.out.println(sb);
	}

}
