package com.koolnigam.app14;

public class StringBufferImportantMethods {

	public static void main(String[] args) {
	/*
	// length()
	StringBuffer sb = new StringBuffer("shubham");
	System.out.println(sb.length()); // 7
	*/
	
    /******************************************************************/

    /*
    // charAt()
	StringBuffer sb = new StringBuffer("shubham");
    System.out.println(sb.charAt(3)); // b
	
	*/
	
	/******************************************************************/
	/*
	// setCharAt()
	StringBuffer sb = new StringBuffer("shubham");
	sb.setCharAt(2,'z'); // shzbham
	System.out.println(sb);
	*/
	
	/******************************************************************/
    /*
    delete(int begin , int end) --> end = end-1
	StringBuffer sb = new StringBuffer("shubham");
	sb.delete(2, 5);
	System.out.println(sb);
	*/
	
	/*******************************************************************/
	/*
	deleteCharAt()	
	StringBuffer sb = new StringBuffer("shubham");
	sb.deleteCharAt(3);
	System.out.println(sb);
	*/
	
	
	/*******************************************************************/
	/*
	reverse()
	StringBuffer sb = new StringBuffer("shubham");
	System.out.println(sb);
	System.out.println(sb.reverse());
	*/
	
	/*******************************************************************/
	/*
	setLength()
	StringBuffer sb = new StringBuffer("shubhamnigam");
	sb.setLength(5);
	System.out.println(sb); // shubh
	*/
	
	/*******************************************************************/
	/*
	trimToSize()
    StringBuffer sb = new StringBuffer(1000);
    sb.append("shubham");
    System.out.println(sb.capacity()); // 1000
    sb.trimToSize();
    System.out.println(sb.capacity()); // 7
	
    */
	
	/********************************************************************/
	
	/*
	insert(int index , Datatype d);	
	StringBuffer sb = new StringBuffer("Shubham");
	sb.insert(0, 1);
	System.out.println(sb);
	sb.insert(2, 4.2f);
	System.out.println(sb);
	*/
	
	/********************************************************************/
	
	}
}
