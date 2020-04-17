package com.koolnigam.app3;

import java.util.Vector;

/*
1. Default initial capacity of vector is 10
   Vector v = new Vector();
   When vector is fill then New Capacity = Current Capacity * 2
   
2. We can create vector with specified capacity
   Vector v = new Vector(1000);

3. We can create vector with specified Collection object
   Vector v = new Vector(Collection c);
   
4. 
   Vector v = new Vector(int capacity , int incremental capacity);
   Ex. Vector v = new Vector(1000 , 5);
       after filling 1000 capacity again 5 capacity will created
       means total capacity = 1000+5 = 1005
       
METHODS IN VECTOR:-
===================
1. addElement(Object O);
2. addElement(int index);
3. removeElement(Object O);
4. removeElement(int index);
5. removeAllElements();
6. getFirstElement();
7. getLastElement();
8. size();     ---> How many elements present in vector
9. capacity(); ---> What is the total capacity of vector to hold elements
10. Enumeration element() ---> Get vector elements one by one
*/
public class App03_List_Vector {

	public static void main(String[] args) {
		/*
		Vector v = new Vector();
		System.out.println("Default capacity of vector :"+v.capacity()); // default capacity of vector is 10

		for (int i = 1; i <=10; i++) {
			v.add(i);
		}
		System.out.println("Capacity after adding 10 elements :"+v.capacity()); // capacity after adding elements is = 10
		v.add(11);
		System.out.println("Capacity after adding 11th object :"+v.capacity()); // capacity after adding 11th element is 10*2=20
		                                                                      // New Capacity = Current Capacity*2;
		
		System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] ---> capacity is 20
		*/

/*********************************************************************************************************/
		/*
		Vector v = new Vector(24); // Customized capacity of vector is 24  
		System.out.println("Customized capacity of vector :"+v.capacity()); // capacity of vector is 24

		for (int i = 1; i <=24; i++) {
			v.add(i);
		}
		System.out.println("Capacity after adding 24 elements :"+v.capacity()); // capacity after adding elements is = 24
		
		v.add(25);
		System.out.println("Capacity after adding 25th object :"+v.capacity()); // capacity after adding 25th element is 24*2=48
        // New Capacity = Current Capacity*2;
		
		System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
		*/
		
/*********************************************************************************************************/		
		/*
		Vector v = new Vector(24,6);
		System.out.println("Customized capacity of vector :"+v.capacity()); // capacity of vector is 24
		
		for (int i = 1; i <=24; i++) {
			v.add(i);
		}
		System.out.println("Capacity after adding 24 elements :"+v.capacity()); // capacity after adding elements is = 24
		
		v.add(25);
		System.out.println("Capacity after adding 25th object :"+v.capacity()); // capacity after adding 25th element is 24+6=30
        // New Capacity = Current Capacity*2;
		
		System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
		
		*/
		
/*********************************************************************************************************/	
		Vector<String> v1 = new Vector<String>(); 
		  
        // adding elements to the vector v1 
        v1.add("Geeks"); 
        
         
        v1.add("is"); 
        v1.add("a"); 
       
  
        System.out.println("Elements of vector1:" + v1);
        
        Vector<String> v2 = new Vector<String>(); 
        
        // adding elements to the vector v2 
        v2.add("Geeks"); 
       
       
        v2.add("contains"); 
        v2.add("well"); 
       
  
        System.out.println("Elements of vector2:" + v2);
        System.out.println("Calling retainAll() method"); 
        v1.retainAll(v2);
        System.out.println("After calling retainAll() method"); 
        System.out.println(v1);
	} 

}
