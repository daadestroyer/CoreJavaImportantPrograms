package com.koolnigam.app2;

public class App2_Switch_Case {

	public static void main(String[] args) {
/*
1. Until 1.4 Version the allowd datatypes for switch args are byte,short,int,char
2. from 1.5 Version wrapper classes like Byte,Short,Int,Enum,Character	are also allowed
3. from 1.7 Version we can also take String as a switch args
4. boolean and long type args are not allowed for switch args
5. In switch curly braces are mandatory
6. Both default and case are optional	
*/
		
/*		
	int x=10;
	int y=20;
	
	switch(x) {
	case 10 :
		    System.out.println(x);
	case y  :
		    System.out.println(y);
	}
*/ // CE: if we declare y as final then there is no probelem
	
/*
	int x=10;
	final int y=20;
		
	switch(x) {
	case 10 :
		    System.out.println(x); // 10
	case y  :
		    System.out.println(y); // 20
	}
*/

/*
    int x = 10;
    switch(x+1) {
    case 10:
    	   System.out.println("10");
    case 10+20:
    	   System.out.println("30");
    case 10+20+30:
    	   System.out.println("60");
    }
*/	// No output coz every case label should within the range
		
/*
    byte b = 10;
	switch(b) {
	case 10:
		   System.out.println("10");
	case 127:
		   System.out.println("127");
    case 1000:
		   System.out.println("1000");
	}
*/	//CE: possible loss of precision found int required byte
		

/*
	byte b = 10;
	switch(b+1) {
	case 10:
		   System.out.println("10");
	case 127:
		   System.out.println("127");
	case 1000:
		   System.out.println("1000");
		}
*/ //CE: no such case found	
		
		
/****** FALL THROUGH INSIDE SWITCH ******/		
/*
1. within switch we can take default at only once
2. if no other case found default will be executed
3. with in switch we can take default any where but it is preferred to take at last
*/	

/*
int x = 3;
switch(x) {
case 0:
	 System.out.println("case 0");
case 1:
	 System.out.println("case 1");
	 break;
case 2:
	 System.out.println("case 2"); 
default:
	 System.out.println("default");	 
}
*/

		
/*		
int x = 0;
switch(x){
default:
	  System.out.println("default");	
case 0:
	  System.out.println("case 0");
	  break;
case 1:
	  System.out.println("case 1");
case 2:
      System.out.println("case 2"); 
}
*/


		
		
		
		
		
		
		
		
		
		
	}

}
