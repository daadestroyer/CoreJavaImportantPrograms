package com.koolnigam.app11;

import java.util.Comparator;
import java.util.TreeSet;

/*
Comparator(I):-
===============
>>> It is meant for customized sorting order
>>> This interface contains compare() and equals() only

1. public int compare(Object obj1 , Object obj2)
------------------------------------------------
obj1.compareTo(obj2)
|--Returns -ve if obj1 comes before obj2
|--Returns +ve if obj1 comes after obj2
|--Return 0 if obj1 == obj2

obj1.compareTo(Obj2);
-----------------------
obj1--> The object which is to be inserted
obj2--> The object which is already inserted

2. public boolean equals(Object obj)
------------------------------------------------
 
*/
class MyComparator implements Comparator<Object>{
	
	public int compare(Object obj1 , Object obj2) {
		
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		/*if(I1<I2) {
			return +1;	 // I1<I2 I1 comes after I2 so return +ve
		}
		else if(I1>I2) {
			return -1;  // I1>I2 I1 comes before I2 so retun -ve
		}
		return 0;       // If I1 and I2 are same return 0
		*/
		
		
		
		return -I1.compareTo(I2);  // for descending order
		//return I1.compareTo(I2); // for ascending order
	    
	}
}
public class App11_Set_TreeSet03_Comparator {

	public static void main(String[] args) {
		/*
		// ======BY USING DEFAULT NATURAL SORTING ORDER======
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println("Default Natural Sorting Order : "+t); // by default natural sorting order [0, 5, 10, 15, 20]
       */

/**********************************************************************************************************/
		
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		 // if we're not passing comparator object then JVM will call compareTo() which is meant for default natural sorting order
		 // implementing descending order sorting
		t.add(10);
		t.add(0);    // compare(0,10)  means 0 will come after 10 return +ve 
		t.add(15);   // compare(15,10) means 15 will come before 10 return -ve
		t.add(5);    // compare(5,10)  means 5 will come after 10 return +ve
		t.add(20);   // compare(20,10) means 20 will come before 10 return -ve
		t.add(20);   // compare(20,10)  return 0
		
		System.out.println("Customized Sorting Order : "+t); // by customized sorting order [20,15,10,5,0]
	}

}
