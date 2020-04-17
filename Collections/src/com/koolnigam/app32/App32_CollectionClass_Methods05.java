package com.koolnigam.app32;
/*
1. Successfull search result range 0 to n-1
2. Unsuccessfull search result range -(n+1) to -1
3. Total result range (-n+1) to n-1
*/
import java.util.ArrayList;
import java.util.Collections;

public class App32_CollectionClass_Methods05 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");

		System.out.println(l); // [Z, A, M, K, a]
        Collections.sort(l);
        System.out.println(l); // using default naturals sorting [A, K, M, Z, a]
        
        System.out.println(Collections.binarySearch(l, "Z")); // 3
        System.out.println(Collections.binarySearch(l, "a")); // 4
        System.out.println(Collections.binarySearch(l, "b")); // -6 coz b comes after a
	}

}
