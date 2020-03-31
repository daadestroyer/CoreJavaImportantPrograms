package com.koolnigam.app3;
/*
>>> Inside inner classed static members are not allowed because without creating outer class object we can't access inner class members that's why static members are not
    allow
>>> Inside inner class we can take only instance members , means inner class never talk about static members hence we can't run inner class directly from CMD
*/
class Outer {
 class Inner{
	/*public static void main(String[] args) {
		// static member not allow inside inner class
	} */
 }
}
