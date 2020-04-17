package com.koolnigam.app29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator{

	public int compare(Object obj1 , Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		return -s1.compareTo(s2);
	}
	
}


public class App29_CollectionClass_Methods02 {

	public static void main(String[] args) {
		
      ArrayList l = new ArrayList();
      l.add("Z");
      l.add("A");
      l.add("K");
      l.add("L");
      System.out.println("Before Sorting : "+l);  // Before Sorting : [Z, A, K, L]
      Collections.sort(l , new MyComparator());   // providing customized sorting
      System.out.println("After Sorting : "+l);   // After Sorting : [A, K, L, Z]
	}

}
