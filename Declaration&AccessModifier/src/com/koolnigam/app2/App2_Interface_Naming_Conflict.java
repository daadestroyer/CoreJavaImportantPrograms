package com.koolnigam.app2;
// Two interface contain same signature of method with different type and no of parameter
interface Left{
	void m1();
}
interface Right{
	void m1(int x);
}
public class App2_Interface_Naming_Conflict implements Left,Right{

	public void m1() {
		System.out.println("M1 with no parameter");
	}
	
	public void m1(int x) {
	   System.out.println("M1 with parameter "+x);
	}

	
	
	public static void main(String[] args) {
		App2_Interface_Naming_Conflict t = new App2_Interface_Naming_Conflict();
		t.m1();
		t.m1(2);

	}

	

}
