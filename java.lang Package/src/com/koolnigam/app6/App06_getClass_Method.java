package com.koolnigam.app6;

import java.lang.reflect.Method;

public class App06_getClass_Method {

	public static void main(String[] args) {
		int count = 0;
		Object o = new String("Durga");
		Class c = o.getClass(); // return runtime class definition of an object [return runtime class definition of Object o]
		System.out.println("Full Qualified Name Of Class : "+o.getClass().getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("Methods Information : ");
		for(Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The Number Of Methods : "+count);
		

	}

}
