package com.koolnigam.app1;
/*
finding no of occuerence of "ab"

m.find()  --> it start to find the next batch and return true otherwise false
m.start() --> return the index from where the index of match found
m.group() --> return the group of match which is been found
d.end()   --> return the end+1 index of match
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App1_RegeDemo {
	 
	    public static void main(String[] args) 
	    { 
	    	int count=0;
	        Pattern p = Pattern.compile("ab"); // compile method which is static present in Pattern class
	        // Pattern p = new Pattern.compile("[ab]"); // here we're searching either 'a' or 'b'
	        Matcher m = p.matcher("abbabbba");
	        
	        while(m.find()) {
	        	count++;
	        	System.out.println(m.start()+"...."+m.end()+"...."+m.group());
	        }
	        System.out.println("The total no of occurence : "+count);
	        
	    } 
}
