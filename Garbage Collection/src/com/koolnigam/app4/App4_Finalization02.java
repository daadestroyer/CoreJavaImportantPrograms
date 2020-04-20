package com.koolnigam.app4;

/*
>>> If we call finalize() explicitly then it doesn't perform cleanup activity and when object is eligible for GC then again GC
    call finalize()
>>> In servlet we can call destroy() from init() and service() then it doesn't means servlet deinstantiation will  be done
     
*/
public class App4_Finalization02 {

	public static void main(String[] args) {
		
	App4_Finalization02 a1 = new App4_Finalization02();
	App4_Finalization02 a2 = new App4_Finalization02();
    
	a1.finalize();
	a2.finalize();
	
	a1=null;
	a2=null;
	System.gc();
	System.out.println("End of main");
	}
	
	public void finalize() {
		System.out.println("App4_Finalization02 finalize method called");
	}

}
