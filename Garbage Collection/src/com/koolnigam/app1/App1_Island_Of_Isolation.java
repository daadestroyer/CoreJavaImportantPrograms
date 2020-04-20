package com.koolnigam.app1;
/*
>>> Island of isolation is nothing but when objects having all references at internally only then it is the case of island of 
    isolation at this situation all objects having reference(internal reference) then it is eligible for GC
     
>>> Sometimes objects are having reference then also it is eligible for GC , because there is external reference provided to that 
    object
*/
public class App1_Island_Of_Isolation {
		App1_Island_Of_Isolation i;
	
	public static void main(String[] args) {
	  
		App1_Island_Of_Isolation a1 = new  App1_Island_Of_Isolation(); // here a1 pointing to its i object
		App1_Island_Of_Isolation a2 = new App1_Island_Of_Isolation();  // here a2 pointing to its i object
		App1_Island_Of_Isolation a3 = new App1_Island_Of_Isolation();  // here a3 pointing to its i object

		// till now no object is eligible for GC
		
		a1.i=a2; // a1 of i is pointing to a2 object
		a2.i=a3; // a2 of i is pointing to a3 object
		a3.i=a1; // a3 of i is pointing to a1 object
		
		// till now no object is eligible for GC
		
		a1=null; // no object is eligible for GC
	    a2=null; // no object is eligible for GC
	    a3=null; // 3 object is eligible for GC
		
	}

}


/*
here what happen a1 of i is pointing to a2 object ,  a2 of i is pointing to a3 object and a3 of i is pointing to a1 object
so when a1 and a2 is null till now with the help of a3 we can access i of any object , but whenever a3 becomes null all three 
object eligible for GC as there is no external support 
*/
