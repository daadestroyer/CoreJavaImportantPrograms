package com.koolnigam.app1;
/*
1. If we're declaring any named class inside any other class without static modifier such type of inner class are called Normal or Regular inner class
   --> javac Outer.java
       java Outer ---> RE : Could not find or load main class Outer$Inner
       java Outer$Inner --> RE : Could not find or load main class Outer$Inner
*/
class Outer {
  class Inner{
	  
  } 
}
