package com.koolnigam.app2;
/* 
>>> If we declare a named class inside another class without using static modifier such type of classes are called as Regular or Normal Inner class

*/class Outer {
  class Inner{
	   
  }
  public static void main(String[] args) {
	  System.out.println("Outer class main method");
  } 
  
}
/*
javac outer.java ---> 2 .class generated Outer.class and Inner.class
java Outer 
*/
 