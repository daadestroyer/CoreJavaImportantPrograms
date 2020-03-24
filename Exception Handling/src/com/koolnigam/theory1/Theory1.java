package com.koolnigam.theory1;

import java.util.Scanner;



public class Theory1 {
/*
EXCEPTION:-
===========
>>> Exception is a unwanted event that disturb normal flow program is called exception
>>> Objective of exception handling is normal termination of program
>>> meaning of exception handling doesn't mean repairing an exception , we've to define an alternate way to terminate the program normally
    try{
     read file from london
    }
    catch(FileNotFoundException){
     read local file
    }
>>> most of the cases exception are caused programmer mistake and can be recoverable
    Ex. FileNotFoundException,SQLException

ERROR:-
=======
>>> Error are those which are caused by system error due to lack of system resources or configuration and error can't be recoverable
    Ex. OutOfMemoryError,StackOverFlowError,SystemCrashError
    

CHECKED EXCEPTION:-
==================
>>> The exception which are checked by compiler at runtime that exception will be handled or not for smooth execution of program are
    called Checked Exception 
    Ex. HallTickedException,PenciNotWorkingException,SQLException,IOException
>>> RuntimeException and its child classes and Error and its child classes are called as CHECKED EXCEPTION

UNCHECKED EXCEPTOIN:-
====================
>>> The exception which are not checked by compiler at runtime that exception will be handled or not are called Unchecked Exception 
    Ex. BombBlastException,EarthQuackException,ArithmeticException,IndexOutOfBoundException
>>> Other than CHECKED EXCEPTION remaining are called as UNCHECKED EXCEPTION


----------------------------------------------------------------------------------------------------------------------------------
>>> if try with multiple block present then order of different catch block is very important . it should always from child to parent
    by mistake if we're taken from parent to child then  CE: "exception xxx has already been caught"


FINALLY BLOCK:-
===============
>>> Finally is the block which will executed always whether any exception is raised or not raised , the work of finally block is to
    free up the resources which was previously initialized finally block is also called as resource clean up block
>>> It is not recommended to write the clean up code inside the try block because there is no gurantee of execution of try block
    always
>>> It is not recommended to write the clean up code inside the catch block because there is no gurantee of execution of catch block
    always
    try{
    ---risky code---
    }
    catch(Exception e){
    ---handling code---
    }
    finall{
    ---resource cleanup code---
    }
    
    
RETURN VS FINALLY BLOCK:-
======================== 
>>> Even thru try block contain some return statement but 1st finally block will be executed then after that return statement consider
>>> It means that finally block dominates return statement
    
    
    
DIFFERENCE B/W FINALLY & FINALIZE BLOCK:-
========================================
>>> finally is the block which is associated with try-catch to maintain the clean up code which should be executed always irrespective
    to whether exception is raised to not
>>> finally is the block which is used for clean up activity related to try block


>>> finalize is the method which is called by GC to clean the resources which are realted to object , basically finalize is the method
    which is used to deallocate memory which was previously allocated 
    
    
VARIOUS POSSIBLE COMBINATION OF TRY-CATCH-FINALLY:-
===================================================
>>> whenever we're writing try block compulsory we should write either catch or finally i.e try without catch or finally is invalid
>>> whenever we're writing catch block compulsory we should have to write try block i.e catch without try is invalid
>>> whenever we're writing finally block compulsory we should have to write try block i.e finally without try is invalid

    
    
THROW:-
========
>>> sometimes we can create our own customized exception for that purpose we can use throw keyword and exception will be handover to 
    the JVM...
>>> we use throw keyword for Throwable type only otherwise we will get CE:

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
THROWS:-
========
>>> in our program if there is any chance or raising checked exception then compulsort we've to handle that exception by throws or 
    try-catch
>>> we'll use throws keyword to deligate the responsiblity of exception handling to called method
>>> throws keyword is use for checked exception , if we use throws keyword for unchecked then there is no use
>>> we use throws keyword for Throwable type only otherwise we will get CE:   
    
    
    
    
    
    
*/
}
