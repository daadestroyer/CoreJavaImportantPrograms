package com.koolnigam.theory2;

public class Theory2 {
/*
/--------------------INTERFACES--------------------/

Definition:1
============
If we don't know anything about implementation just we have only requirement specification then it is called as interface

Definition:2
============
Interface is just like a service requirement specification

Definition:3
============
From customer point of view interface is just a service which they are taking from client , and from Client point of view interface is 
just a service what Service provider will provide

Definition:4
============
Inside interface every method is 100% abstract whether we're declaring or not (till 1.7 Version) hence interface is called as 100%
abstraction

Summary:-
============
Any service requirement specification (SRS) or any contract b/w client and service provider or 100% abstraction are called as interface


>>> Whether we're implementing interface we should have to give implementation to all methods otherwise declare implemented class as 
    abstract
>>> Whenever we're implementing an interface methods complsory interface method should contain public methods otherwise CE: come
>>> Every method inside interface is by default public and abstract
    
    public abstract void m1();
    void m1();
    >>> both are same




/--------------------EXTENDS VS IMPLEMENTS--------------------/

1. A class can extends one class at a time
   class A {
   ----
   }
   class B extends A{
   ----
   }

2. A class can implement any no of interface at a time
   interface I1{
   ---
   }
   interface I2{
   ---
   }
   interface I3{
   ---
   }
   class A implements I1,I2,I3l

3. interface can extends any no of interface at a time
   interface I1{
   ---
   }
   interface I2{
   ---
   }
   interface I3{
   ---
   }
   interface Test extends I1,I2,I3{
   ---
   }
   
4. class can extends one class and implements no of interface simultaneously
   class A{
   ---
   }
   interface I1{
   ---
   }
   interface I2{
   ---
   }
   class Test extends A implements I1,I2{
   ---
   }


/--------------------INTERFACE METHODS--------------------/
1. Every method inside interface are by default abstract and public
   public : To make this method visible to implementation class
   abstract : Implementation class is responsible to provide implementation
   
/--------------------INTERFACE VARIABLES--------------------/   
1. Every variables inside interface are by default public , static , final
   public : To make it available to the implementation class
   static : Without making object implementation class can access that variable
   final  : Implementation class can use that variable but not override it..
   
2. Every interface variable are by default public,static,final so we can't use these modifier
   private,protected

3. For interface variable it is compulsory to provide initialization in interface only
4. Interface variable can be accessible but can't be overriden





Q. Why interface contain only abstract method why there is 100% abstraction
----
Ans:-
Before Java 1.8 interface can contain only abstract method so lets suppose if there is non-abstract method , but
we can't make object of interface so how we call that non-abstract method thats'why before Java 1.8 interface 
have 100% abstraction by default

In Java 1.8 there is a concept of default and static methods do here we can call static method by interface name
direclty
----


Q. What is markter interface?
----
Ans:-
If an interface that doesnn't contain any methods and by implementing that interface of you object get some ability then it is called 
marker interface Ex.. Cloneable,Serializable etc

>> Without having any methods inside marker interface how object get some ability is because at runtime JVM is responsible to provide 
   such ability 
>> JVM provide such ability because reduce complexity of programming
>> it is possible to create our own JVM but customization must be required Ex. Sleepable,Jumpable
----

Q. What is Adapter Class?
----
Ans:-
>>> Adapter class is just a simple java class that implements interface method and give empty implementation to all methods
>>> If we implements interface then directly we've to implement all the interface methods unneccessary . This approach increase length of
    code

inerface I{
void m1();
void m2();
void m3();
void m4();
}
Class Adapter implements I{
void m1(){}
void m2(){}
void m3(){}
void m4(){}
}
Class A extends Adapter{
void m1(){
sopln("M1 implemented");
}
}
----

Q. What is the difference b/w abstract class, interface, concrete class?
----
Ans:-
>>> If we don't know anything about implementation just we have requirement specification than we have to go for interface
>>> If we know about partial implementation (not complete implementation) then we have to go for abstract class
>>> If we know complete information about and ready to provide implementation then we have to go for concrete class
----

Q. What is the purpose of constructor 
----
Ans:-
>>> The purpose of constructor is to initialize the Object
    Ex.. Student s = new Student("Durga","101");
>>> The purpose of constructor is to initialize the instance variable
    Object creation done by ---> new operator
    Object initilization done by ---> Constructor
----


Q. When we're creation child class object automatically parent class constructor executed but parent class object won't be created then
   why parent class contructor called?
----
Ans:-
>>> If we're creation child class object then parent constructor executed bcoz at after creating child class object then JVM goto child
    class contructor and 1st line of constructor contain super(); so parent class constrcutor called

class P{
  P(){
   sopln(this.hashCode()); // 7224672
  }
}
class C extends P{
  C(){
  sopln(this.hashCode()); // 7224672
  }
}
class Test {
 PSVM(--){
  C c = new C();
  sopln(this.hashCode()); // 7224672
 }
}
----


Q. Abstract class object creation isn't possible but abstract class contain constructor why ? what is the need of that constructor ?
----
Ans:-
>>> abstract class object creation is not possible but abstract class contain constructor because child class extending abstract parent
    class and abstract class contain some varibles so to provide initialization of all abstract class variables and after that child will
    extends all the variables that's why abstract class contain constructor
----

WITHOUT ABSTRACT CLASS CONSTRUCTOR             
================================== 
abstract class Person{
 String name;
 int age,height,weight;
}
class Teacher extends Person{
 String subject;
 double salary;
 
 Teacher(){
  this.name = name;
  this.age = age;
  this.height = height;
  this.weight = weight;
  this.subject = subject;
  this.salary = salary;
 }
 
 PSVM(String[] args){
  Teacher t = new Teacher("Ravi",23,3,44,"Java",50k);
 }
}
class Student extends Person{
 String subject;
 double salary;
 
 Student(){
  this.name = name;
  this.age = age;
  this.height = height;
  this.weight = weight;
  this.subject = subject;
  this.salary = salary;
 }
 
 PSVM(String[] args){
  Student s = new Student("Ravi",23,3,44,"Java",50k);
 }
}


WITH ABSTRACT CLASS CONSTRUCTOR             
================================== 
abstract class Person{
 String name;
 int age,height,weight;
 public Person(String name,int age,int height,int weight){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
 }
}

class Teacher extends Person{
 String subject;
 double salary;
 
 Teacher(String name,int age,int height,int weight,String subject,Double salary){
  super(name,age,height,weight);
  this.subject = subject;
  this.salary = salary;
 }
 
 PSVM(String[] args){
  Teacher t = new Teacher("Ravi",23,3,44,"Java",50k);
 }
}
class Student extends Person{
  String subject;
  double salary;
 
  Student(String name,int age,int height,int weight,String subject,Double salary){
  super(name,age,height,weight);
  this.subject = subject;
  this.salary = salary;
 }
 
 PSVM(String[] args){
  Student s = new Student("Ravi",23,3,44,"Java",50k);
 }
}








































































































*/
}
