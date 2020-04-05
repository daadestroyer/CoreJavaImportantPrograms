package com.koolnigam.app8;
/*
1. In String,Wrapper,Collection classes .equals() is overriden for content comparison
2. In StringBuffer,StringBuilder,Object class .equals() isn't overriden so Object class .equals() which is for reference comparison
*/
public class App08_StringClassCase02 {

	public static void main(String[] args) {
		// IN THE CASE OF STRING CLASS
		String s1 = new String("Shubham");
		String s2 = new String("Shubham");
		
		System.out.println(s1==s2); // false --> here object class == operator executed which is meant for reference comparison
		System.out.println(s1.equals(s2)); // True --> Here in String class .equals() act as content comparison
		
		
		// IN THE CASE OF STRINGBUILDER
		
		StringBuffer sb1 = new StringBuffer("Shubham");
		StringBuffer sb2 = new StringBuffer("Shubham");
		System.out.println(sb1.equals(sb2)); // False --> Here in StringBuffer .equals() is act as reference comparison
 		
		
	}

}
