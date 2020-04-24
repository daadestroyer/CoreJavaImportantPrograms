package com.koolnigam.app7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Rules to check valid mobile no:-
-----------------------------
1. Every no.s should contain exactly 10 digit
2. The first digit should be 7,8 or 9
*/
public class App7_RegeDemo_MobileNo {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter mobile no");
	String no = sc.next();
    /*
    // for 10 digit mobile no
    Pattern p = Pattern.compile("[789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
    Matcher m = p.matcher(no);
    // OR
    // Pattern p = p.compile([7-9][0-9]{9}); // act like [0-9] 9 times
    
    */

/*====================================================================================================================*/
		
	/*
    // If we want to represent both 10 and 11 digit mobile no 
    Pattern p1 = Pattern.compile("0?[6-9][0-9]{9}");
    Matcher m = p1.matcher(no);
    
    if(m.find()&&m.group()==no) {
    	System.out.println("valid no");
    }
    else {
    	System.out.println("invalid no");
    }
    
    */
	
/*====================================================================================================================*/	
	
	// If we want to represent both 10 , 11 , 12 digit mobile no 
	
	Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
    Matcher m = p.matcher(no);
    
    if(m.find()&&m.group().equals(no)) {
    	System.out.println("valid no");
    }
    else {
    	System.out.println("invalid no");
    }
	}
	
}
