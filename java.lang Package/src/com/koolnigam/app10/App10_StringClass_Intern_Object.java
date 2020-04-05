package com.koolnigam.app10;
/*

*/
public class App10_StringClass_Intern_Object {

	public static void main(String[] args) {
      String s1 = new String("Shubham"); // 1 shubham created at heap and 1 created at SCP and s1 point to heap object
      String s2 = s1.intern(); // by using s1 refrence s2 point to SCP shubham object means s1 point to heap shubham object and s2 point to SCP shubham object
      System.out.println(s1==s2); // false
      
      /* s2 = s1;
       System.out.println(s1==s2); // here s1 and s2 both point to heap shubham  object
      */
      
      String s3 = "Shubham";
      System.out.println(s2==s3); // here s3 point to SCP shubham object means both s2 and s3 point to same SCP object
      
	}

}
