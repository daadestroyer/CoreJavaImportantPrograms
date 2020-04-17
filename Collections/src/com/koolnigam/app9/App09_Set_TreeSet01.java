package com.koolnigam.app9;

import java.util.TreeSet;

/*
Constructor of TreeSet(C):-
==========================
1. TreeSet t = new TreeSet();
   ---> for default natural sorting order
   
2. TreeSet t = new TreeSet(Comparator C);
   ---> for customized sorting order
   
3. TreeSet t = new TreeSet(Collection C);
4. TreeSet t = new TreeSet(SortedSet S);
*/
public class App09_Set_TreeSet01 {

	public static void main(String[] args) {
		
		/*
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("C");
		t.add("D");
		t.add("E");
		// t.add(10);      // Exception in thread "main" java.lang.ClassCastException: 
		// t.add(null); // NullPointerException
		System.out.println(t); // [A, C, D, E, a]
	   */

// If we're depending on natural sorting order compulsory object should be homogeneous and comparable
/* By default String class are comparable so there is no problem in above example . But StringBuffer is not
   Comparable so ClassClassException will come   */
	
	  /*
	  
	   TreeSet t = new TreeSet();
	  t.add(new StringBuffer("A"));
	  t.add(new StringBuffer("Z"));
	  t.add(new StringBuffer("L"));
	  t.add(new StringBuffer("M"));
	  System.out.println(t); // ClassCastException java.lang.StringBuffer cannot be cast to java.lang.Comparable
	  
	  */
		
		
	}

}
