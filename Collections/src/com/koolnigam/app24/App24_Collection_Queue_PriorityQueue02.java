package com.koolnigam.app24;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return -s1.compareTo(s2);
	}
	
}
public class App24_Collection_Queue_PriorityQueue02 {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(15,new MyComparator()); // 15 is initial capacity
        pq.offer("Z");
        pq.offer("A");
        pq.offer("L");
        pq.offer("B");
       
				
        System.out.println(pq);  // using default natural sorting  [A, B, L, Z]
        System.out.println(pq);  // using customized sorting  [Z, B, L, A]


	}

}
