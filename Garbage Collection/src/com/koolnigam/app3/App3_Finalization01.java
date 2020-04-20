package com.koolnigam.app3;
/*
>>> Finalization is nothing but when object pointed to null and just before destroying an object finalize() called to perform
    Object level and some other level cleanup activity
>>> By using finalize() we can perform Finalization
>>> If our class contains finalize() then our class finalize() will be executed otherwise object class Finalize() will be
    executed
>>> In object class finalize() will be as follows 
    protected void finalize() throws Throwable
*/
public class App3_Finalization01 {

	public static void main(String[] args) {
		
		String s = new String("Durga");
		App3_Finalization01 a = new App3_Finalization01();
		
        s=null; // here String class finalize method will be executed which has empty implementation
		a=null; // here out class App3_Finalization01 finalize() will be executed
        System.gc();
		System.out.println("End of main");

	}
	public void finalize() {
		System.out.println("App3_Finalization01 Finalize called");
	}

}
