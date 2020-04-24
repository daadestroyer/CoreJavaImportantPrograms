package com.koolnigam.app8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App8_RegeDemo_Mail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id");
		String email = sc.next();
		
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9-.]*[@]gmail([.][a-zA-Z]+)+");
        Matcher m = p.matcher(email);
        
        if(m.find()&& m.group().equals(email)) {
	    	System.out.println("valid email");
	    }
	    else {
	    	System.out.println("invalid email");
	    }
	}
}
