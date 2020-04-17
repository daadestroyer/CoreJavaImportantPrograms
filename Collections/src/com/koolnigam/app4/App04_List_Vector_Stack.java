package com.koolnigam.app4;

import java.util.Stack;

/*
>>> It is a child class of Vector
>>> It is specailly designed class for Last In First Out[LIFO]

METHODS IN STACK:-
==================
1. push(Object O);  ---> To insert object into stack
2. pop(Object O);   ---> To remove and return top of the stack
3. peek();          ---> To return top of the stack without removal
4. empty();         ---> Stack is empty or not
5. search(Object O) ---> Return offset if the element is available otherwise return -1
 

*/
public class App04_List_Vector_Stack {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s); // [A, B, C, D, E]
		
		s.pop();
		System.out.println(s); // [A, B, C, D]
		
		System.out.println("Peek the top os stack : "+s.peek()); // D
		
		System.out.println("Stack is empty or not : "+s.empty()); // false
		
		System.out.println("Search element A : "+s.search("A")); // 4
		System.out.println("Search element D : "+s.search("D")); // 1
		
	}

}
