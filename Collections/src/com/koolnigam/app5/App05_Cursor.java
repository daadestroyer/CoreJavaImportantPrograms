package com.koolnigam.app5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

/*
1. If we want to get object one by one from collection then we should got for cursor. 
2. There are three types of cursor
   >> Enumeration
   >> Iterator
   >> ListItertator

Enumeration:-
-------------
1. We can use this to get object one by one from collection
2. We can create Enumeration Object by using elements();
3. We can perform only read operations
4. Applicable only for legacy classes (Vector and Stack) means its not universal
       public Enumeration elements();
   Ex.. Enumeration e = v.elements(); // v is vector Object 
Methods:-
---------
1. hasMoreElements();
2. nextElements();

Iterator:-
------------
1. We can apply iterator on any collection object , to get object one by one from collection 
2. We can perform both read and remove operation
3. We can create Iterator Object by using interator() of collection(I)
       public Iterator iterator()
   Ex..Iterator itr = e.iterator(); // means any collection object
Methods:-
---------
1. public boolean hasNext();      ---> Check next element is there or not
2. Object next();                 ---> Provide next Object
3. public void remove();          ---- Remove element


ListIterator:-
------------
1. We can apply ListIterator on any collection object , to get object one by one from collection 
2. We can perform both read,remove,replace,add operation
3. We can use ListIterator in both forward and backward direction , means it is bi-directional
3. We can create Iterator Object by using interator() of collection(I)
       public ListIterator listIterator()
   Ex..ListIterator litr = e.listIterator(); // means any collection object
Methods:-
---------
1. public boolean hasNext();      ---> Check next element is there or not
2. Object next();                 ---> Provide next Object
3. nextIndex();                   ---> Provide index of next element
4. public boolean hasprevious();  ---> Check previous element is there or not
5. Object previous();             ---> Provide previous Object
6. public int previousIndex();    ---> Provide index of previous element
7. public void remove();          ---> Remove element
8. public void set(Object new);   ---> Replace old element with the new element
9. public void add(Object new);   ---> New object will be added permanently to the list

*/
public class App05_Cursor {

	public static void main(String[] args) {
     
/***************************************************************************************/
	 /*
		//=====USING ENUMERATION=====
		Vector<Integer> v = new Vector<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
	
		System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
		
		Enumeration<Integer> e = v.elements(); // HERE WE WILL GETTING VECTOR OBJECT ONE BY ONE
		while(e.hasMoreElements()) {
			 int i = e.nextElement();
			 if(i%2==0) {
				 System.out.println(i); // 2 4 6 8 10
				 
			 }
		}
	 */
/**************************************************************************************/
	/*
	 // =====USING ITERATOR=====
		ArrayList<Integer> l = new ArrayList<Integer>(); // default initial capacity = 10
		
		for (int i = 1; i <= 10; i++) {
			l.add(i);
		}
		System.out.println("Get all objects at a time : "+l);
	
	    Iterator<Integer> itr = l.iterator(); // HERE WE WILL GETTING ARRAY LIST OBJECT ONE BY ONE
	    while(itr.hasNext()) {
	    	int i = itr.next();
	    	if(i%2==0) {
	    		System.out.println(i); // 2 4 6 8 10
	    	}
	    	else {
	    		itr.remove(); // odd no.s will be removed
	    	}
	    }
	    System.out.println(l); // [2, 4, 6, 8, 10]
	    
	 */  

/**************************************************************************************/
		
	// =====LIST ITERATOR=====
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("shubham");
		l.add("shubhanshu");
		l.add("sakshi");
		l.add("harshit");
		
		System.out.println("All elements added : "+l); // [shubham, shubhanshu, sakshi, harshit]

		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = ltr.next();
			
			if(s.equals("shubhanshu")) {
				ltr.remove();
				System.out.println(l); // [shubham, sakshi, harshit]
			}
			else if(s.equals("sakshi")) {
				ltr.add("shreyank");  
				System.out.println(l); // [shubham, sakshi, shreyank, harshit]
			}
			else if(s.equals("harshit")) {
				ltr.set("saksham");  // [shubham, sakshi, shreyank, saksham]
 			}
			
		}
		System.out.println(l); 
	}
	
}
