package com.koolnigam.app33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator<Object>{
	public int compare(Object obj1 , Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		return -i1.compareTo(i2);
	}
}
public class App33_CollectionClass_Methods06 {

	public static void main(String[] args) {
    ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		System.out.println(l); // [10, 20, 30, 40, 50]
        Collections.reverse(l);
        System.out.println(l); // [50, 40, 30, 20, 10]

	}

}
