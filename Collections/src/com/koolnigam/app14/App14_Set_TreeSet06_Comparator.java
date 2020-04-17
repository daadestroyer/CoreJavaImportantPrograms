package com.koolnigam.app14;
/*
>>> WAP in which insert both String and StringBuffer Object and Sorting Order is based on increasing length 
*/

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	
	public int compare(Object obj1, Object obj2) {
		String S1 = obj1.toString();
		String S2 = obj2.toString();
		
		int s1 = S1.length();
		int s2 = S2.length();
		
		if(s1<s2) {
			return -1;
		}
		else if(s1>s2) {
			return +1;
		}
		else {
			return S1.compareTo(S2);
		}
		
	}
	
}
public class App14_Set_TreeSet06_Comparator {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCE");
        t.add("A");
        System.out.println(t); // [A, AA, XX, ABC, ABCE]

	}

}
