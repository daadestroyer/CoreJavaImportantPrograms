package com.koolnigam.app25;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer s1 = (Integer)obj1;
		Integer s2 = (Integer)obj2;
		
		
		return -s1.compareTo(s2);
	}
	
}
public class App25_Collection_Queue_PriorityQueue03 {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(15,new MyComparator()); // 15 is initial capacity
       
		for (int i = 0; i <=15 ; i++) {
			pq.offer(i);
		}
				
        System.out.println(pq);  // using default natural sorting  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

        System.out.println(pq);  // using customized sorting  [15, 14, 13, 9, 8, 10, 12, 6, 3, 2, 7, 1, 5, 4, 11, 0]


	}

}
