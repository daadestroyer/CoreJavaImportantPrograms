package com.koolnigam.app37;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<Object>{
	public  int compare(Object obj1 , Object obj2) {
		String i1 = (String)obj1;
		String i2 = (String)obj2;
		return -i1.compareTo(i2);
	}
} 
public class App37_Arrays04 {

	public static void main(String[] args) {
		
		String[] a = {"A","Z","B"};
		Arrays.sort(a);  // sorting based on default natural sorting
		System.out.println("sorting based on default natural sorting");
		for (String s1 : a) {
			System.out.println(s1);  // A B Z
		}
		System.out.println(Arrays.binarySearch(a,"A")); // 0
 		System.out.println(Arrays.binarySearch(a,"C"));	// -3	
		
		
		Arrays.sort(a, new MyComparator());
		System.out.println("sorting based on customized sorting (descending order)");
		for (String s1 : a) {
			System.out.println(s1);  //  Z,B,A
		}
		
 		System.out.println(Arrays.binarySearch(a,"A",new MyComparator())); // 2
		System.out.println(Arrays.binarySearch(a, "C", new MyComparator())); // -2

	}

}
