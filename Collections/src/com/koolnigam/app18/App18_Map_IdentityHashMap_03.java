package com.koolnigam.app18;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class App18_Map_IdentityHashMap_03{

	public static void main(String[] args) {
		/*
		HashMap<Integer,String> hs = new HashMap<Integer,String>();

		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		hs.put(I1,"Pawan");
		hs.put(I2,"Kalyan");
		System.out.println(hs); // {10=Kalyan}
*/

       /*
        // >>> IN HASHMAP JVM WILL USE .equals() TO FIND DUPLICATE KEYS
        // =============================================================
        In HashMap JVM will check duplicate keys will present or not by .equals() 
        like I1.equals(I2); --> true
        If we're adding key and if it is already present then value will be replaced
       */
		
/******************************************************************************************************/
		
		IdentityHashMap<Integer,String> hs = new IdentityHashMap<Integer,String>();

		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		hs.put(I1,"Pawan");
		hs.put(I2,"Kalyan");
		System.out.println(hs); // {10=Pawan, 10=Kalyan}

		/*
		// >>> IN IDENTITYHASHMAP JVM WILL USE == TO FIND DUPLICATE KEYS
        // =============================================================
		   In IndentityHashMap JVM will check duplicate keys will present or not by == 
	       like I1==I2; --> false
	       If we're adding key and if it is already present then value will be replaced
	    */
	}

} 
