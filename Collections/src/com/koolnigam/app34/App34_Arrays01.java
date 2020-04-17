package com.koolnigam.app34;

import java.util.Arrays;
import java.util.Comparator;

/*

Sorting Elements of Array:-
===========================
1. sort(primitive[] p);  		  --> to sort primitive type array according to natural sorting order
2. sort(Object[] o);     		  --> to sort object type array according to natural sorting order
3. sort(Object o , Comparator c)  --> to sort object type array according to customized order  

Searching Elements of Array:-
===========================
1. binarySearch(primitive[] a , target element); --> to search primitive type array according to natural sorting order
2. binarySearch(Object[] a , target elements);   --> to search object type array according to natural sorting order
3. binarySearch(Object[] a , target elements , Comparator c);  --> to search object type array according to customized order

>>> For Object type array we can sort and search elements in both natural and customized sorting order
>>> For primitive type array we can sort and search elements in only natural sorting order
*/

 
public class App34_Arrays01 {

	public static void main(String[] args) {
		int[] a = {10,15,20,11,5};
		System.out.println("Primitive type array before sorting");
		for(int a1 : a) {
			System.out.println(a1); // 10,15,20,11,5
		}
		
		System.out.println("Primitive type array after sorting");
		Arrays.sort(a);
		for(int a1 : a) {
			System.out.println(a1); // 5,10,11,15,20
		}
		
	}

}
