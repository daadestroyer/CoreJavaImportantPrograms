package com.koolnigam.app6;
/*
>>> StringTokenizer is specially designed for Spitting String
>>> StringTokenizer present in java.util package
*/
import java.util.StringTokenizer;

public class App6_RegeDemo_StringTokenizer {

	public static void main(String[] args) {
		/*
		StringTokenizer st = new StringTokenizer("Durga Software Solution");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());  // Durga
												 // Software
												 // Solution
         }
         */

/*========================================================================================================================*/
		/*
		StringTokenizer st = new StringTokenizer("19-09-2014","-");  // 1st args is treated as target String
		 															 // 2nd args is trated as regular expression
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());  // 19
												 // 09
												 // 2014
         }
         */

		/*
		StringTokenizer st = new StringTokenizer("This is Shubham Nigam");
		while(st.hasMoreTokens())
		{
         System.out.println(st.nextToken());			
 		}*/
		
		/*
		StringTokenizer st1 = new StringTokenizer("www.shubhamnigam.com","\\.");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		// www
	    // shubhamnigam
  		// com
        */

/*========================================================================================================================*/
	}

}
