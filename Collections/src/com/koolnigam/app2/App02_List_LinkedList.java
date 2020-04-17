package com.koolnigam.app2;

import java.util.LinkedList;

/*
LinkedList class contains following Methods:-
===========================================
1. void addFirst(Object O)
2. void addLast(Object O)
3. Object getFirst()
4. Object getLast()
5. Object removeFirst()
6. Object removeLast()
*/
public class App02_List_LinkedList {

	public static void main(String[] args) {
	
		LinkedList l = new LinkedList();
		l.add("Shubham");
		l.add("Shubhanshu");
		l.add("Sakshi");
		l.add(null);
		System.out.println(l); // [Shubham, Shubhanshu, Sakshi, null]
  
		l.addFirst("First");
		l.addLast("Last");
		System.out.println(l); // [First, Shubham, Shubhanshu, Sakshi, null, Last]
		
		l.set(4, 30);
		System.out.println(l); // [First, Shubham, Shubhanshu, Sakshi, 30, Last]
		
		l.removeLast();
		System.out.println(l); // [First, Shubham, Shubhanshu, Sakshi, 30]
		
	}

}
