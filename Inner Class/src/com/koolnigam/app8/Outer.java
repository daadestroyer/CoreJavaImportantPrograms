package com.koolnigam.app8;
/*
Within inner class "this" always refers always refers current inner class object . To refer current outer class object we've to use "outer class name.this"
*/
class Outer {
    int x = 10;
     class Inner{
    	int x = 100;
    	public void m1() {
    		int x = 1000;
    		System.out.println(x);//1000
    		System.out.println(this.x); // 100 or use this Inner.this.x
    		System.out.println(Outer.this.x); // 10
    	}
    }
    public void m2() {
		System.out.println(x); // 10
	}
    public static void main(String[] args) {
    	new Outer().m2();
    	new Outer().new Inner().m1();
    }
}
/*
Top level(Outer) class modifier
===============================
1. default
2. public
3. final
4. abstract
5. strictfp

Inner level class modifier
===============================
1. default
2. public
3. final
4. abstract
5. strictfp
6. private
7. protected
8. static

*/
 