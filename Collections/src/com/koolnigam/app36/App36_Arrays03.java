package com.koolnigam.app36;

import java.util.Arrays;

public class App36_Arrays03 {

	public static void main(String[] args) {
		
		int[] a = {10,5,12,20,3};
		
	    Arrays.sort(a); // sort by natural sorting order 
	    for (int a1 : a) {
			System.out.println(a1); // 3 5 10 12 20
			
		}
	    System.out.println();
	    System.out.println(Arrays.binarySearch(a,12)); // 3
        System.out.println(Arrays.binarySearch(a, 4)); // -2 this is insertion point of 4
	}

}
