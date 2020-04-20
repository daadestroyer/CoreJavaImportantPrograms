package com.koolnigam.app5;
/*
>>> If programmer called finalize() which was just like a normal method call then if there is any exception raised inside
    finalize() then then it will terminate our program abnormally
>>> But if GC call finalized method then if there is any exception raised inside finalize() then then it will not 
    terminate our program abnormally
*/
public class App5_Finalization03 {

	public static void main(String[] args) {

	App5_Finalization03 a = new App5_Finalization03();
		
	
	a=null;
	System.gc();
	//a.finalize();
	System.out.println("End of main");
	}

	public void finalize() {
		System.out.println("App5_Finalization03 finalize method called"+10/0);
		
	}
}
