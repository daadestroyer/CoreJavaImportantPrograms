package com.koolnigam.app9;
/*
1. Object creation at SCP is always optional JVM will first check that is there any object already present in SCP with same content or not , if not then JVM create one object at SCP area , but if 
   object already created then it will reuse that object , hence in SCP only new object created , means there is no chance of existing 2 object at SCP
2. Garbage Collector doesn't allow to access SCP area because SCP concept/variable stored in method area and GC available at heap area so GC doesn't allow to access SCP
3. All SCP Objects will automatically destroyed at the time of JVM shutdown
4. Object with new operator always created at both heap and scp but point to heap object 
   Ex.. String s = new String("Shubham"); --> here shubham created in both heap and scp but s always point to heap shubham
5. Object without new always created at scp only like and point to that scp object
   Ex. String s = "Shubham"; --> here 1 object created at scp and s point to scp shsubham
   
*/
public class App09_StringClassCase03 {

	public static void main(String[] args) {
	 // CASE-1
		String s = new String("Shubham"); // Here 2 object will be created 1 at heap and 1 at SCP but s is always point to heap object
		
	 // CASE-2
		String s1 = new String("Shubham"); // here 1 object created at heap and one at SCPs
		String s2 = new String("Shubham"); // here 1 object again created at heap but JVM check that in SCP same object with same content present in SCP already so he reuse it
		String s3 = "Shubham"; // here JVM trying to create s3 object in SCP but there already object is created with same content then JVM allow s3 to reuse it
		String s4 = "Shubham"; // here JVM trying to create s4 object in SCP but there already object is created with same content then JVM allow s4 to reuse it
	                           // Total 3 object created 2 at heap and 1 at SCP
	}

}
