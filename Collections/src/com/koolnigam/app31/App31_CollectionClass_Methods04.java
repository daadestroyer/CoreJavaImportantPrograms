package com.koolnigam.app31;
/*
Searching in Customized sorting
===============================
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Object>{
	public int compare(Object obj1 , Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		return -i1.compareTo(i2);
	}
}
public class App31_CollectionClass_Methods04 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		
		System.out.println(l); // by default natural sorting [15, 0, 20, 10, 5]
        Collections.sort(l,new MyComparator()); 
        System.out.println(l); // by customized sorting order [20, 15, 10, 5, 0]
        
        System.out.println(Collections.binarySearch(l, 10, new MyComparator())); // 2
        System.out.println(Collections.binarySearch(l, 13, new MyComparator())); // -3 (coz after 15 13 will come)
        System.out.println(Collections.binarySearch(l, 17, new MyComparator())); // -2 (coz after 20 17 will come)
	}

}
