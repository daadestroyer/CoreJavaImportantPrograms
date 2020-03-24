package com.koolnigam.app5;

import java.util.Scanner;

class TooYoungException extends RuntimeException {

	 TooYoungException(String s) {
         System.out.println(s); 
     }
}
class TooOldException extends RuntimeException {

	TooOldException(String s) {
         System.out.println(s);
    }
}

class App5 
{
   public static void main(String[] args) {
   System.out.println("Enter age");
   Scanner sc = new Scanner(System.in);
   int age = sc.nextInt();
   
   if(age > 60) {
      throw new TooYoungException("Age more than 60");
   }
   else if(age < 18) {
      throw new TooOldException("Age less than 18");
   }
   else{
	  System.out.println("U will get Match Details Soon by Email...!");
   }
 }
}