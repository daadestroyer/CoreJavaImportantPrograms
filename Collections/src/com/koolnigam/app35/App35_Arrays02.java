package com.koolnigam.app35;
import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<Object>{
	public int compare(Object obj1 , Object obj2) {
		String i1 = (String)obj1;
		String i2 = (String)obj2;
		
		return -i1.compareTo(i2);
	}
}

public class App35_Arrays02 {

	public static void main(String[] args) {
		
		String[] s = {"A","Z","B"};
		
		System.out.println("Object type array before sorting");
		for (String s1 : s) {
			System.out.println(s1); // A Z B
		}
		
		System.out.println("Object type array after sorting");
		Arrays.sort(s,new MyComparator());
		
		for (String s1 : s) {
			System.out.println(s1); // Z B A [in descending order]
		}

	}

}
