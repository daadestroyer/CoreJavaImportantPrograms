package com.koolnigam.app12;

public class App12_String_Class_Important_Methods {

	public static void main(String[] args) {
	// public char charAt(int index)
	/*
	String s = "Shubham"; // length is 7
	System.out.println(s.charAt(0)); // S
	System.out.println(s.charAt(2)); // u
	System.out.println(s.charAt(6)); // m
	*/
		
	/*************************************************************************/
	
    // public String concat(String str)
	/* here + and =+ operator are overloaded for concatanation
	String s = "shubham";
	s = s.concat("software");
	 s = s+"software";
	 s += "software";
    */
		
	/*************************************************************************/
		
    // public boolean equals(Object o)
    /*   
    >>> To perform content comparison where case is important , this is object class overridden method
	String s1 = "Shubham";
	String s2 = "shubham";
	
	System.out.println(s1.equals(s2)); // false [case is important]
	*/
		
	/*************************************************************************/
	
	// public boolean equalIgnoreCase(String o)
    /*
    >>> To perform content comparison where case isn't important 
	String s1 = "Shubham";
	String s2 = "shubham";
    System.out.println(s1.equalsIgnoreCase(s2)); // true
	*/
	
	/*************************************************************************/
	// public String substring(int begin)
	/*	
	String s = "abcdefg";
	System.out.println(s.substring(3)); // defg return String from 0 to provided number
	System.out.println(s.substring(2, 6)); // cdef // return String from beginning position to end-1
	System.out.println(s.substring(4,5)); // e
	System.out.println(s.substring(2,7)); // cdefg
	*/
	
	
	/*************************************************************************/
	// public int length(Object o)
	/*
	String s = "Shubham";
	System.out.println(s.length()); // 7 length() applicable for String object but not for arrays for arrays length keyword is there
	*/
		
	/*************************************************************************/
	// public String replace(char old , char new)
	/*
    String s = "ababa";
    System.out.println(s.replace("a","b")); // bbbbb
    */
    
		
	/*************************************************************************/
	
	/*
	public String toLowerCase()
	public String loUpperCase()
	*/
	
	/*************************************************************************/
	/*
	// >>> Remove spaces from String
	
	String s1 = "    Shubham";
	System.out.println(s1+" "+s1.length());
	s1 = s1.trim();
	System.out.println(s1+" "+s1.length());
	
	*/
	
	/*************************************************************************/
	/*
	String s1 = "ababab";
	System.out.println(s1.indexOf("a")); // 0 find a in 1st occurence of String 
	System.out.println(s1.indexOf("b")); // 1 find b in 1st occurence of String
	*/
	
	
	/*************************************************************************/
	/*
	String s1 = "ababab";
	System.out.println(s1.lastIndexOf("b")); // 5
	System.out.println(s1.lastIndexOf("a")); // 4
	*/
	
		
	String s1 = new String("Durga");
	String s2 = s1.toString();
	String s3 = s1.toUpperCase();
	String s4 = s1.toLowerCase();
	String s5 = s1.toUpperCase();
	String s6 = s3.toLowerCase();
	System.out.println(s2==s4);  // false
	System.out.println(s4==s3);  // false
	System.out.println(s2==s3);  
	
	
	
	
	
	}
	
} 
