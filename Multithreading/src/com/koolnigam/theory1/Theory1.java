package com.koolnigam.theory1;



public class Theory1 {

/*
MULTITASKING:-
==============
Executing several task simultaneously is the concept of Multitasking

Two types of Multitasking are there:-
=====================================
1. Process based multitasking
2. Thread based multitasking

1. Process based multitasking:-
===============================
>>> Executing several task at a time simultaneously where each task is a independent process
    ex. While writtin java code we can listen music , we can download  some file there are independent to each other

2. Thread based multitasking:-
===============================
>>> Executing several task at a time simultaneously where each task independent part of the programs called Thread based multitasking
    ex. While in marriage we've several works like arrangement of cattering , DJ , decoration , clothes , jewellery are nothing but
        independent task of a particular program program is nothing but marriage
        
NOTE:- 
>>> when compare with C++ java have more rich features in multithreading bcoz java have inbuilt multithreading API and programmer 
    has to do only 10% of the work other 90% will be done by API
>>> Whether it is process based or thread based multitasking goal is same that to increase the system performance and reduce response 
    time
>>> Thread is noting but seperate flow of execution , for every thread there is seperate job   
     

IN HOW MANY WAYS WE CAN MAKE THREAD:-
=====================================
1. By extending thread class
2. By implementing Runnable interface

THREAD SCHEDULER:-
=================
>>> Job of thread scheduler is to schedule thread , thread scheduler is part of JVM
>>> If multiple thread are waiting to get a chance to execute there task then which thread will execute 1st will be decided by Thread
    Scheduler
>>> We can't predict output every time , coz we don't know which algorithm will be used inside JVM
>>> whenever situation come to multithreading there is no gurantee for exact output but we can provide several possible output


Q. Which is the best way of defining Thread ?
----
Ans:-
>>> As we know we can define Thread in two ways by extending Thread class and by implementing Runnable(I) , but the best way to define Thread is 2nd approach which 
    is implementing Runnable(I) because in 1st Approach we can define Thread by extending Thread class so we can't extend any other class here inheritance is
    missing , but in 2nd approach which is defining Thread by implementing Runnable(I) here we're implementing interface so we can also extends any other class
    that's why the best approach to define to Thread is 2nd Approach which is by implementing Runnable(I) 
----	


THREAD CLASS CONSTRUCTOR:-
=========================
1. Thread t = new Thread();
2. Thread t = new Thread(Runnable r);  				        						---> pass and runnable object
3. Thread t = new Thread(String name); 					    						---> pass and assign a name to thread
4. Thread t = new Thread(Runnable r , String name);     							---> pass runnable object and name of thread 
5. Thread t = new Thread(ThreadGroup g , String name);  							---> Thread belong to which group
6. Thread t = new THread(ThreadGroup g , Runnable r);      							--->
7. Thread t = new THread(ThreadGroup g , Runnable r , String name);
8. Thread t = new THread(ThreadGroup g , Runnable r , String name , longstackSize);



THREAD PRIORITY:-
================
>>> Every thread in java has some priority it may be default priority generated by JVM or customize priority set by programmer
>>> The valid range to set Thread priority is 1 to 10 where 1 is very low priority and 10 is highest priority
>>> Thread class defined the following constants so represent some standard
    1. Thread.MIN_PRIORITY  -----> 1
    2. Thread.MAX_PRIORITY  -----> 10
    3. Thread.NORM_PRIORITY -----> 5
>>> Threre are no constant like Thread.LOW_PRIORITY or Thread.HIGH_PRIORITY
>>> Thread scheduler used this priority to allocate CPU to get chance for 1st execution
>>> If 2 Thread have same priority then execution order will be depend on Thread scheulder
>>> Method to set and get Thread priority
    THREAD_NAME.currentThread().getPriority();
    THREAD_NAME.currentThread().setPriority(1);




*/	
}