package com.koolnigam.app26;

import java.util.TreeSet;

/*
1. floor(e)        --> before e which element is <= e
2. ceiling(e)      --> after e which element is >= e
3. lower(e)        --> before e which element is < e
4. higher(e)       --> after e which element is > e
5. pollFirst(e)    --> it remove & return 1st element
6. pollLast(e)     --> it remove & return last element
7. descendingSet() --> it return reverse order of set
 
*/
public class App26_Set_SortedSet_NavigableSet{

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(1000);
		t.add(2000);
		t.add(4000);
		t.add(3000);
		t.add(5000);
		
		System.out.println(t);               // follow DNSO [1000, 2000, 3000, 4000, 5000, 6000]
        System.out.println(t.ceiling(2000)); // after 2000 which element is >= 2000 = 2000
		System.out.println(t.higher(2000));  // after 2000 which element is > 2000  = 3000
		System.out.println(t.floor(3000));   // before 3000 which element is <= 3000 = 3000
		System.out.println(t.lower(3000));   // before 3000 which element is < 3000 = 2000
		System.out.println(t.pollFirst());   // get 1st element of set = 1000
		System.out.println(t.pollLast());    // get last element of set = 5000

	}

}
