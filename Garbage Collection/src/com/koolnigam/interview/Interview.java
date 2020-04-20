package com.koolnigam.interview;

public class Interview {
/*
Q.1 Explain what is Garbage in Garbage Collection topic ?
====
Ans:-
The objects which are useless or the object which don't have any reference are called garbage in java , and these objects
are eligible for GC
====


Q.2 Explain island of isolation ?
     OR
    Some times objects are having reference but still its eligible for GC how ?
====
Ans:- When objects doesn't have any external reference and all the objects are pointing to each other internally (objects only
      have internal reference) then these all are eligible for GC because they don't have any external reference
====

Q.3 Explain what are the ways to request JVM to run GC ? Explain the ways to request JVM to run GC ?
====
Ans:-
1. Once an object doesn't have any reference externally it will eligible for GC but it may not be destroyed by GC immediatly
   whenever JVM runs GC then GC perform clean up activity and objects destroyed by GC 
2. When we request JVM to run GC explicity (by writting System.GC() where GC is static method present in System class) then
   it may depends on JVM whether it will accept our request for clean up activity or not its not sure that every time JVM 
   accept our request (after all JVM is not our mausi ka ghar) but mostly JVM accept our request
   
Different ways to run GC:-
------------------------
1. By calling static method GC present in System class:-
---------------------------------------------------------
   ex. System.GC();

2. By Runtime class:-
---------------------
>>> Runtime class is the Singleton class present in java.lang package
>>> We can create Runtime class object by using factoy method getRunTime()

Example:-
-------
Runtime r = Runtime.getRunTime();  // creation of object of Runtime class object

>>> Once we got runtime class object following methods we can call

freeMemory():- return free memory present in Heap
totalMemory():- return total memory present in Heap
gc():- for requestion JVM to call GC explictly

====


Q.4 How many GC methods present in java ? 
====
Ans:-
There are 2 gc() methods present in java are:-
1. gc() present in System class which is static
2. gc() present in Runtime class which is non-static
====


Q.5 How to use Runtime class gc() and how we create method of Runtime class ? Explain how many method present in Runtime class?
====
Ans:-
>>> Runtime class is singleton class present in java.lang package
>>> we can create Runtime class object by using getRunTime() presernt in Runtime class

freeMemory() ---> get free memory present in heap
totalMemory()---> get total memory present in heap
gc() ---> for requesting JVM to run gc
====

Q.6 What is finalization ? How we can achieve finalization ? 
Q.7 If we call finalize method just like a normal method call then it will perform clean activity or not ? Explain ? 
Q.8 If programmer called finalize() which was just like a normal method call then if there is any exception raised inside
    finalize() then then it will terminate our program abnormally ? it is true or not ?
Q.9 But if GC call finalized method then if there is any exception raised inside finalize() then then it will not 
    terminate our program abnormally ? it is true or not ? 
*/
}
