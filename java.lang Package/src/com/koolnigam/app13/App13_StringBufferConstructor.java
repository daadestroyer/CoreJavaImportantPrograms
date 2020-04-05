package com.koolnigam.app13;

public class App13_StringBufferConstructor {

	public static void main(String[] args) {
	    /*
	    
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial Capacity:"+sb.capacity()); // create empty StringBuffer object with default capacity 16
        
        */
		
		/***************************************************************/
		
		/*
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefghijklmnop"); // 16 characters added capacity of sb object is full
		System.out.println("Capacity after adding 16 character:"+sb.capacity());
		sb.append("q"); // capacity is fill and if we trying to add new character then new sb object with all these elements creates
		System.out.println(sb.capacity()); //34
		  // NewCapacity = (CurrentCapacity+1)*2; --> new capacity = 34
		
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("qr"); // here all 34 characters are filled so 34 capacity of sb object is filled
		System.out.println(sb.capacity());
		*/
		
		
		/***************************************************************/
		/*
		
		StringBuffer sb = new StringBuffer(100); // create StringBuffer object with specified capacity
		System.out.println(sb.capacity());
		
		*/
		
		/****************************************************************/
		
		/*
		// create an StringBuffer object with provided content
		// StringBuffer sb = new StringBuffer(String s);
		// Capacity = s.length+16
		StringBuffer sb = new StringBuffer("Shubham");
		System.out.println("Length of sb is :"+sb.length()+" "+sb.capacity());
		*/
		
		
		/****************************************************************/
	}

}
