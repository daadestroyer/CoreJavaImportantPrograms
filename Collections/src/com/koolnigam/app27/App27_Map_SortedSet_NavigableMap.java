package com.koolnigam.app27;

import java.util.TreeMap;

public class App27_Map_SortedSet_NavigableMap {

	public static void main(String[] args) {
	   TreeMap<String,String> tm = new TreeMap<String,String>();
	   tm.put("b","bannana");
	   tm.put("c","chiku");
	   tm.put("a","apple");
	   tm.put("o","orange");
	   tm.put("k","kiwi");
	   
	   System.out.println(tm);                  // according to DNSO {a=apple, b=bannana, c=chiku, k=kiwi, o=orange}
	   System.out.println(tm.ceilingKey("c"));  // after c which element is >= c
	   System.out.println(tm.floorKey("c"));    // before c which element is <= c
	   System.out.println(tm.lowerKey("c"));    // before c which element is < c
	   System.out.println(tm.higherKey("c"));   // after c which element is > c
	   System.out.println(tm.lowerEntry("c"));  // b=bannana
	   System.out.println(tm.higherEntry("c")); // k=kiwi

   }

}

