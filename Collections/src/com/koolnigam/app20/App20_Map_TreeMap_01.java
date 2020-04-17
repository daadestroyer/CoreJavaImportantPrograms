package com.koolnigam.app20;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{
	
	public int compare(Object obj1 , Object obj2) {
		
	String s1 = obj1.toString();
	String s2 = obj2.toString();	
		return -s1.compareTo(s2);
	}
}
public class App20_Map_TreeMap_01 {

	public static void main(String[] args) {
		/*
		// In default natural sorting order keys should Comparable and Homogeneous Other we will get CCE ,
		// In default natural sorting order keys can't be null but values can be
		
		TreeMap t = new TreeMap();
		
		t.put(100,"AAA");
		t.put(103,"YYY");
		t.put(101,"XXX");
		t.put(104,"106");
		t.put(107,null); 
		// t.put("AAA",103);  // CCE get because in Default natural sorting keys can't be heterogeneous
		// t.put(null,"CCC"); // NPE get because in keys can't be null can be
		System.out.println(t);
		*/

/************************************************************************************************************/
		
        TreeMap t = new TreeMap(new MyComparator());
		
		t.put(100,"AAA");
		t.put(103,"YYY");
		t.put(101,"XXX");
		t.put(104,"106");
		t.put(107,null); 
		t.put("AAA",103);  // CCE get because in Default natural sorting keys can't be heterogeneous
		// t.put(null,"CCC"); // NPE get because in keys can't be null can be
		System.out.println(t); // Ascending order  {100=AAA, 101=XXX, 103=YYY, 104=106, 107=null, AAA=103}
                               // Descending order {AAA=103, 107=null, 104=106, 103=YYY, 101=XXX, 100=AAA}

	}

}
