package com.koolnigam.app12;

import java.util.Comparator;
import java.util.TreeSet;

/*
>>> WAP to insert String Objects into the TreeSet where the Sorting Order is of Reverse of the Alphabetical Order
  (means in descending order)

*/

class MyComparator implements Comparator<Object>{

	
	public int compare(Object obj1, Object obj2) {
		String S1 = (String)obj1;
		String S2 = (String)obj2;
		
		
		return -S1.compareTo(S2);
	}
	
} 
public class App12_Set_TreeSet04_Comparator {

	public static void main(String[] args) {
	
	 /*
	   // Print in ascending order which is (default sorting order) using Comparable
       TreeSet<String> t = new TreeSet<String>();
       t.add("Roja");         
       t.add("Sobha Rani");    // Sobha Rani.compareTo(Roja);    +ve [Roja,Sobha Rani]
       t.add("Raja Kumrai");   // Raja Kumrai.compareTo(Roja);   -ve [Raja Kumrai,Roja,Sobha Rani]
       t.add("Ganga Bhavani"); // Ganga Bhavani.compareTo(Roja); -ve [Ganga Bhavani,Raja Kumrai,Roja,Sobha Rani]
       t.add("Ramulamma");     // Ramulamma.compareTo(Roja);     +ve [Ganga Bhavani,Raja Kumrai,Ramulamma,Roja,Sobha Rani]
       System.out.println(t);  // [Ganga Bhavani, Raja Kumrai, Ramulamma, Roja, Sobha Rani]
     */
   

/***********************************************************************************************************************/
		
	// Print in descending order by using Comparator
		  TreeSet<String> t = new TreeSet<String>(new MyComparator());
	       t.add("Roja");         
	       t.add("Sobha Rani");    // Sobha Rani.compareTo(Roja);     [Sobha Rani,Roja]
	       t.add("Raja Kumrai");   // Raja Kumrai.compareTo(Roja);    [Sobha Rani,Roja,Raja Kumrai]
	       t.add("Ganga Bhavani"); // Ganga Bhavani.compareTo(Roja);  [Sobha Rani,Roja,Raja Kumrai,Ganga Bhavani]
	       t.add("Ramulamma");     // Ramulamma.compareTo(Roja);      [Sobha Rani,Roja,Ramulamma,Raja Kumrai,Ganga Bhavani]
	       System.out.println(t);  // [Sobha Rani,Roja,Ramulamma,Raja Kumrai,Ganga Bhavani]
		
	}

}
