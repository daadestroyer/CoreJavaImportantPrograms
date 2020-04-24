package com.koolnigam.app5;

import java.util.regex.Pattern;

public class App5_RegeDemo_StringClass_split_method {

	public static void main(String[] args) {
		
		/*
		Pattern p = Pattern.compile("\\s"); // searching for space character
		
		// we want to split string after space
		String[] s = p.split("Durga Software Solutions"); // we will get group of String so hold it in String array
		
		for (String s1 : s) {
			System.out.println(s1); // Durga
			 	 				    // Software
									// Solutions
		}
		*/
	
/*=========================================================================================================================*/		
	    /*
	    // Pattern class split() take target String as a arguement
		Pattern p = Pattern.compile("[.]"); // search for any elements we can also write like this \\s
		
		// we want to split String after a dot (.)
		
		String[] s = p.split("www.shubhamnigam.com"); // returning group of String so we've to hold it in String array

		for (String s1 : s) {
			System.out.println(s1); // www 
							        // shubhamnigam 
				      	 	 	    // com 
			 
		}
		*/
/*=========================================================================================================================*/
		
		/*
		// String class split() take target regular expression as a arguments
		
		*/
	
		String s = "www.durgajobs.com";
		String[] s1 = s.split("[.]");
		for (String s2 : s1) {
			System.out.println(s1); // www 
	        					    // durgajobs 
	 	 	    	    	 	    // com 
		}
	
/*=========================================================================================================================*/
	}

}
