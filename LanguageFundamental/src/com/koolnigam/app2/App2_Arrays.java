package com.koolnigam.app2;

public class App2_Arrays {

	public static void main(String[] args) {
	
/*
           1-D                    2-D                      3-D
	 int[] a; // valid   int[][] a;   // valid    int[][][]a;    // valid
	 int a[]; // valid   int a[][];   // valid    int a[][][];   // valid
	 int []a; // valid   int[]a[];    // valid    int a[][] [];  // valid
                         int [] a []; // valid    int [][]a [];  // valid
                         int a[] [];  // valid    int []a[][][]; // valid
             
             
*/ 

//	 int[5] a; // CE: can't give size during declaration of array
//   int[] a = new int[5]; // at the time of arrary creation it is compl.. to give size
//   int[] a = {10,20,30}; // --> 10 20 30
	 
/*	int[] a = {10,20,30,40};
	int[] b = {50,60,70};
	a = b;
	System.out.println(a[0]+" "+a[1]+" "+a[2]); --> 50,60,70
*/
		
		
	String[] argh = {"A","B","C"};
	args = argh;
	System.out.println(args.length);
	System.out.println(args[0]+" "+args[1]+" "+args[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
