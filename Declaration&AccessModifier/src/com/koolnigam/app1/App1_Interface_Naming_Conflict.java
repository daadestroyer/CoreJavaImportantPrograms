package com.koolnigam.app1;
// Two interface contain same signature or method with same type and number or args
interface Left{
	void m1();
}
interface Right{
	void m1();
}
class App1_Interface_Naming_Conflict implements Left,Right{

	@Override
	public void m1() {
		System.out.println("This is both m1 of Left , Right");
		
	}
	
	public static void main(String[] args) {
		App1_Interface_Naming_Conflict t = new App1_Interface_Naming_Conflict();
		t.m1();
	}
}
