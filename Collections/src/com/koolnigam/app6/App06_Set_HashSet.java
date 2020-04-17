package com.koolnigam.app6;
/*
1. Underlying data structure is Hashtable
2. Duplicates object aren't allow
3. Insertion order won't preserved and it based on hashCode of objects
4. null insertion is possible
5. Heterogeneous objects are allowed
6. implements serializable,cloneable but not RandomAccess(I)
7. Best suitable if our operation is search then HashSet is best choice

Constructors:-
--------------
1. HashSet hs = new HashSet();
   --> default cap : 10
   --> default fill ration is : 0.75 means after filling 75% HashSet a new HashSet object will be created

2. HashSet hs = new HashSet(int initial capacity);
   --> default fill ration is same which is : 0.75
   
3. HashSet hs = new HashSet(int capacity , float fill ratio);
   --> create HashSet with provided capacity and fill ratio

4. HashSet hs = new HashSet(Collection C);
*/
import java.util.HashSet;

public class App06_Set_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Orange");
		hs.add("Bannana");
		hs.add("Apple");
		hs.add(null);
		System.out.println(hs.add("Apple")); // false
		System.out.println(hs); // [null, Apple, Bannana, Orange]
		
		
	 
	}

}
