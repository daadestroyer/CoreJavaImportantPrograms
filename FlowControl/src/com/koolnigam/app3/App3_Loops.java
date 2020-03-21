package com.koolnigam.app3;

public class App3_Loops {

	public static void main(String[] args) {

	/*
	while(1) {
	System.out.println("Hello");	
	}	
	*/ //CE: while loop args always expected boolean type
		
	/*	
	while(true)
		System.out.println("Hello ");
	*/ // print hello infinite times , without curly braces sopln statement is valid
		
	/*
	while(true)
		int x = 10;
	*/ // CE: without curly braces declarative statement isn't allowed
	
	/*
	while(true) {
		int x = 10;
	}
	*/ //CE: No output
	
		
	/******************UNCREACHABLE CODE********************/
	/*	
	while(true) {
		System.out.println("Hello");
	}
	System.out.println("Hi"); //CE: this is unreachable statement
	*/
		
	/*
	while(false) {
		System.out.println("Hello"); //CE: this is unreachable statement
	}
	System.out.println("World");
	*/
	
	/*
	int a = 10,b=20;
	while(a<b) {
		System.out.println("Hello");
	}
	System.out.println("Hi"); // This line is unreachable and print Hello infinite times
	*/
		
	/*
	int a=10,b=20;
	while(a>b) {
		System.out.println("Hello");
	}
	System.out.println("Hi"); // print hi only 1 time
	*/
	
	/*
	final int a=10,b=20;
	while(a<b) {
		System.out.println("Hello");
	}
	System.out.println("Hi"); // CE: Unreachable line and print hello infinite times
	*/
		
	/*
	do
		System.out.println("Hello");
	while(true); // print Hello infinite times
	*/
		
	/*
	do 
		int x = 10;
	while(true)
	*/ //CE: without curly braces we can't take declarative statement
	
	/*
	do
	 System.out.println("Helo");
	while(true); // print Hello infinite times
	*/
	
	/*
	do {
		int x = 10;
	}
	while(true);
	*/ // no output
		
		
	/*
	do while(true)
		System.out.println("Hello");
	while(true); // print hello infinite times
	*/
		
		
	/*
	do {
		System.out.println("Hello");
	}
	while(false); // print hello 1 time
	*/
	
	/*
	int a=10,b=20;
	do {
		System.out.println("Hello");
	}
	while(a<b);
	System.out.println("Hi");
	*/ // print hello infinite times
	
		
	/*
	int a=10,b=20;
	do {
		System.out.println("Hello");
	}
	while(a>b); // print hello hi
	*/
		
	/*
	final int a=10,b=20;
	do {
		System.out.println("Hello");
	}
	while(a<b); // print hello infinite times
	*/
		
	
	/*	
	final int a=10,b=20;
	do {
		System.out.println("Hello");
	}
	while(a<b);
	System.out.println("Hi"); //CE: unreachable statement
	*/ 
	
		
	/*
	int i=0;
	for (System.out.println("Hello");i<3;i++) {
		System.out.println("Hi");
	} // Hello Hi Hi Hi
	*/
		
		
	/*
	int i=0;
	for(System.out.println("Hello");i<3;System.out.println("Hi")) {
	 i++;
	} // Hello Hi Hi Hi
	*/
		
		
	/*
	for(;;) {
		System.out.println("Hello");
	}
	*/
	
		
	/*
	for(int i=0;true;i++) {
		System.out.println("Hello");
	}
	System.out.println("Hi");
	*/ // CE: Unreachable Statement
		
		
	/*
	for(int i=0;false;i++) {
		System.out.println("Hello");  
	}
	System.out.println("Hi");
	*/ 
	
		
	/*	
	for(int i=0;;i++) {
		System.out.println("Hello");
	}
		System.out.println("Hi"); // CE: Unreachable Statement	 
	*/	
		
	/*	
	int a=10,b=20;	
	for(int i=0;a<b;i++) {
		System.out.println("Hello");  // print hello infinite times 
	}	
	System.out.println("Hi"); 
	*/
		
	
	/*
	final int a=10,b=20;	
	for(int i=0;a<b;i++) {
		System.out.println("Hello");   
	}	
	System.out.println("Hi"); 	 // CE: Unreachable Statement	
	*/
		
		
	/*	
	int[] a = {10,20,30,40,50};
	for(int a1 : a)
	{
		System.out.println(a1);
	}
	*/ // 10 20 30 40 50
		
		
	int[][] a = {{10,20,30},{40,50,60}};
	for(int[] a1 : a) {
		for(int y : a1) {
			System.out.println(y);
		}
	}
		
		
		
	}

}
