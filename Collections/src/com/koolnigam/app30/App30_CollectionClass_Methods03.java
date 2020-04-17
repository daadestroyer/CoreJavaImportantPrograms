package com.koolnigam.app30;
/*
Searching in Default natural sorting order
=============================================
*/
import java.util.ArrayList;
import java.util.Collections;

public class App30_CollectionClass_Methods03 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);  // [2, A, M, K, a]
        Collections.sort(l);
		System.out.println(l);  // [A, K, M, Z, a]

		System.out.println(Collections.binarySearch(l, "Z")); // 3
		System.out.println(Collections.binarySearch(l, "J")); // -2
	}

}
