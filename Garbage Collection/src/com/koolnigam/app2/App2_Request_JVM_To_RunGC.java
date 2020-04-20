package com.koolnigam.app2;

import java.util.Date;

public class App2_Request_JVM_To_RunGC {

	public static void main(String[] args) {
		
	Runtime r = Runtime.getRuntime(); // creating object of Runtime singleton class
	
	System.out.println(r.totalMemory()); // return total memory present in heap 257425408
	System.out.println(r.freeMemory());  // return free memory present in heap  254741016
	
	for (int i = 0; i <= 10000 ; i++) {
		Date d = new Date(); // creating 10000 Date class object
	}
	
	System.out.println(r.totalMemory()); // return total memory present in heap 
	System.out.println(r.freeMemory());  // return free memory present in heap  
	
	

	}

}
