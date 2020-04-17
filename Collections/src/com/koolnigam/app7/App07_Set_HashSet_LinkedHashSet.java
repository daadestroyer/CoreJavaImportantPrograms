package com.koolnigam.app7;

import java.util.LinkedHashSet;

/*
1. All properties are same with HashSet
2. The main difference is:-
   >> In LinkedHashSet underlying data structure is LinkedList and HashTable
3. Duplicates aren't allowed but insertion order is preserved

Constructors:-
--------------
>>> all are same has HashSet
*/
public class App07_Set_HashSet_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Orange");
		lhs.add("Apple");
		lhs.add("Bannana");
		lhs.add(null);
		System.out.println(lhs.add("Apple"));
		System.out.println(lhs);  // [Orange, Apple, Bannana, null]
		
	}

}
