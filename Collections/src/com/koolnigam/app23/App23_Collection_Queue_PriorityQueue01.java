package com.koolnigam.app23;

import java.util.PriorityQueue;

/*
Methods:-
=========
1. offer()     --> to add object to queue
2. poll        --> remove and return head of queue
                   if queue is empty this method return null
3. remove()    --> remove and return head of queue
                   if queue is empty this method NLPE
4. peek()      --> return head element of queue
                   if queue is empty this method return null
5. element()   --> return head element of queue 
                   if queue is empty this method raise RE : NoSuchElementException
                   
Constructors:- 
==============
1. PQ pq = new PQ();
   --> create PQ with def cap : 11
   --> element inserted using def natural sorting

2. PQ pq = new PQ(int capacity);

3. PQ pq = new PQ(int cap , Comparator c);
   --> create PQ with some initial cap 
   --> elements inserted using customized sorting

4. PQ pq = new PQ(SortedSet);
   --> inter conversion b/w sorted set
   --> For a given TreeSet i  want to create PQ

5. PQ pq = new PQ(Collection C);
   --> for any Collection i want to create PQ  
*/
public class App23_Collection_Queue_PriorityQueue01 {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		//System.out.println(q.element());     // java.util.NoSuchElementException
		//System.out.println(q.peek());          // null
          
		for (int i = 0; i <=10; i++) {
		  q.offer(i);	
		}
		System.out.println(q);        // using DNSO [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(q.poll()); // remove and return head of queue --> 0 will be removed
        System.out.println(q);        // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]

	}

}
