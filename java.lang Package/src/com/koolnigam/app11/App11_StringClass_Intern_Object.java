package com.koolnigam.app11;

public class App11_StringClass_Intern_Object {

	public static void main(String[] args) {
		
		
		String s1 = new String("Durga"); // 1 durga object created at heap and 1 created at SCP
		String s2  = s1.concat("Software");
		String s3 = s2.intern(); // here what happen in SCP DurgaSoftware isn't present so s3 it self create DurgaSoftware object and point it..
		System.out.println(s2==s3); // false
	    String s4 = "DurgaSoftware"; // s4 point to DurgaSoftware object in SCP which s3 also point
		System.out.println(s3==s4); // true
	
	}

}
