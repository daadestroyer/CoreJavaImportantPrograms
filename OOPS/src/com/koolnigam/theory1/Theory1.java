package com.koolnigam.theory1;

class P{
	P(int x){
	 System.out.println("P constrcutor");	
	}
	void m1() {
		System.out.println("P method");
	}
}
class C extends P{
	C(){
		super(10);
		super.m1();
		this.m2();
		System.out.println("C constrctor");
	}
	void m2() {
		System.out.println("C method");
	    this.m1();
	}
}

public class Theory1 {
	
	public static void main(String[] args) {
	C c = new C();
	 
	}
/*
/-----OVERLOADING-----/
1. method having same name but different no of args of different type (different signature) and return type doesn't matter
2. can be done in class only
3. method resolution can be done on the basis of runtime refrence

/-----OVERRIDING-----/
1. method having same signature(same type , number , order of parameter) and return type doesn't matter
2. can be done in more than 1 classes
3. method resolution can be done on the basis of runtime object

/-----METHODHIDING-----/
1. both parent and child class method should be static
2. method resolution is always take care by JVM based on runtime refrence











































































































































































































































*/
}
