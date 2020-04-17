package com.koolnigam.app28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class App28_CollectionClass_Methods01 {

	public static void main(String[] args) {
		
      ArrayList l = new ArrayList();
      
      l.add("Z");
      l.add("A");
      l.add("K");
      l.add("N");
     // l.add(10); // adding hetrogeneous element to list is not problem but calling sort method is problem
       
      System.out.println("Before Sorting : "+l); // [Z, A, K, N]
      Collections.sort(l);
      System.out.println("After Sorting : "+l);  // [A, K, N, Z]
      
      
      ArrayList l1 = new ArrayList();
      
      l1.add(40);
      l1.add(30);
      l1.add(20);
      l1.add(60);
      
       
      System.out.println("Before Sorting : "+l1); // [40, 30, 20, 60]
      Collections.sort(l1);
      System.out.println("After Sorting : "+l1);  // [20, 30, 40, 60]

	}

}
