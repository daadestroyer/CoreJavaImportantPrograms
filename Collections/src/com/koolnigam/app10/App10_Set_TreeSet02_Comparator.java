package com.koolnigam.app10;

import java.util.Comparator;
import java.util.TreeSet;

/*
Comparable(I):-
===============
>>> It is meant for default and natural sorting order
>>> This interface contains only compareTo() only

obj1.compareTo(obj2)
|--Returns -ve if obj1 comes before obj2
|--Returns +ve if obj1 comes after obj2
|--Return 0 if obj1 == obj2


obj1.compareTo(Obj2);
-----------------------
obj1--> The object which is to be inserted
obj2--> The object which is already inserted




*/

class MyComparator implements Comparator{

	
	public int compare(Object obj1, Object obj2) {
		
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		return s1.compareTo(s2);
	}
	
}
public class App10_Set_TreeSet02_Comparator {

	public static void main(String[] args) {
		/*TreeSet<String> t = new TreeSet<String>();
		
		t.add("K");  // K will  be added first
		
		t.add("Z"); // Z.compareTo("K")  --> +ve [K,Z]
		t.add("B"); // A.compareTo("K")  --> -ve [B,K,Z]
		t.add("A"); // A.compareTo("K")  --> -ve [A,B,K,Z]
		t.add("C"); // C.compareTo("K")  --> -ve [A,B,C,K,Z]
		t.add("A"); // A.compareTO("K"); --> 0    
		// t.add(null); // NullPointerException (performing operation on null) null.compareTo("K");
		
		System.out.println(t); //  [A, B, C, K, Z]*/
		
		TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add("B");
        t.add("C");
        t.add(10);
        t.add(20);
        System.out.println(t);
	}

}

