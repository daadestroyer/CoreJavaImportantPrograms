package com.koolnigam.app13;
/*
>>> WAP to insert StringBuffer Objects into the TreeSet where sorting order is default natural sorting means
    in alphabetical order
 
>>> By default StringBuffer doesn't implement Comparable interface so to insert StringBuffer Object and provide
    default natural sorting means in alphabetical order we've to make Comparator interface so we can get 
    in both Ascending and Descending Order
    
 
 
 
*/

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{

	
	public int compare(Object obj1, Object obj2) {
		String S1 = obj1.toString();
		String S2 = obj2.toString();
		
		//return S1.compareTo(S2); // for Ascending Order
		 return -S1.compareTo(S2); // for Descending Order
	}
	
}
public class App13_Set_TreeSet05_Comparable {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComparator());
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);   // [A, K, L, Z] --> Ascending Order
       // System.out.println(t);     // [Z, L, K, A] --> Descending Order


	}

}
