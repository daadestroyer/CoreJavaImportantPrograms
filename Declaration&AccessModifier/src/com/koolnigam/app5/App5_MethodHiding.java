package com.koolnigam.app5;

class A{
	void m1() {
		System.out.println("M1 of A");
	}
	static void m2() {
		System.out.println("M2 of A");
	}
}
class B extends A{ 
	void m1() {
		System.out.println("M1 of B");
	}
	static void m2() {
		System.out.println("M2 of B");
	}
}

public class App5_MethodHiding {

	public static void main(String[] args) {
		A a = new B();
		a.m1(); // M1 of B wo is liye kyuki A class me jo m1() hai uski overriding B class ne ki m1() likhke
		        // and overriding me object jis class ka bnta hia uske basis pe method call hote hai
		
		a.m2(); // M2 of A wo isliye kyuki object bana B class ka JVM B class me m2 ko dekhege ki static hai 
		        // check karega ki ye class kahin extend to nai hori uske baad fir parent me jake wahi same
		        // method dekhega to parent wale ko he call karega

	}

}
