package com.koolnigam.theory1;

public class Theory1 {
	
/*
/------------------IMPORT STATEMENT---------------------/

Q. What is the need of import statement?
Ans:- the need of import statement is that to prevent programmers from using fully qualified name

Q. Difference between general import and static import
Ans:-
1. We can use normal import to import classes and interfaces of a package . whenever we're using normal import we can access class
   and interfaces directly
        
2. We can use static import to import the static members of a class it maybe variable or method . It is not require to use class name
   we can access static members directly
  
3. Normal import me class level tak baat hoti hai
   class ke name ke baad ; ata hia
   package ke name ke baad .* ata hai
  
4. Static import me member level tak baat hoti hai
   class name ke baad .* ata hai
   static member ke baad ; ata hai
    
    
/-------------------CLASS MODIFIER------------------/

Top level class applicable modifier   
1. public
2. default
3. final
4. abstract
5. strictfp

Inner level class applicable modifier
1. private 
2. protected
3. static

>>> if a class declared as public we can access class from anywhere outside/inside package
>>> if a class declared as default we can access class from current package


/----------FINAL-----------/
>>> final is the modifier applicable for variable,methods and class
>>> if you don't allow child to override parent class method then declare method as final
>>> if we declare class as final then we can't make child class of that parent class
>>> in final class inheritance concept is not applicable
>>> if parent class don't want child class creation then make private constructor inside parent class then child
    class can't be created
>>> every method present inside final class is by default final
>>> but every variable present inside final class need not to be final 

/----------ABSTRACT-----------/
>>> abstract is the modifier applicable for class , methods and variables
>>> abstract method don't have implementation they have only declaration
>>> abstract method should compl. end with semicolon (;) 
>>> overriding of abstract method is always compl..
>>> inheritance of abstact class is always compl.. bcoz parent wan't some child to give the implementation of their methods
    public void m1();   ---> invalid
    abstract public void m1();  ---> valid
>>> the main advantage of declaring abstract method is that we can give guidelines to child class that child should have to implement 
    some particular methods
>>> abstract methods never talks about implementation thats why the those modifier who talks about implementation are enemy of abstract
>>> enemy of abstract modifier are final,static,private,strictfp,native,synchronized
>>> for any java class if we don't want allow to creation of object of that particular class then declare class as abstract , so 
    instantiation of that class is not possible

Q. Difference b/w abstract class and abstract methods?
----
Ans:-
1. if a class contain atleast one abstract methods that class must be declare as abstract
2. even through class doesn't contain any abstract method then also we can declare class as abstract
---- 

Q. If a class contain atleast one abstract method then we should have to declare class as abstract why?
----
Ans:-
1. If a class contain atleast one abstract method then declaration of class as abstract is necessary coz if anyone make object of that 
   class and call that method then there is no worth to call that method coz method don't have implementation . so its better to declare
   class as abstract
----

>>> if any child class extends any abstract parent class then it is the responsiblity of child class to give implementation of all parent
    class abstract methods
 
Q. If there is no abstract method inside abstract class then what is the need to declare class as abstract?
----
Ans:-
1. If we have any confidential info regarding that particular class then declare class as abstract and make private members so no one 
   make object of that class due to abstract
----

Q. What is the difference b/w final and abstract?
----
Ans:-
1. For abstract method compl. we should have to give implementation by child , means inheritance is compl...
   For final method we can't override final method , means combination of final and abstract is not possible for methods
2. For abstract class we should compul. create child class to give imple. for abstract methods
   For final class we can't make child class means final abstract is not possible for class
3. Final class can't contain abstract methods coz if there is any abstract method then declare class also as abstract but combination of
   final and abstract at class level isn't possible
4. Abstract class can contain final method coz inheritance of abstract class and final method is possible so here there is no problem
----
 
 
 /-------------------MEMBER MODIFIER------------------/
  
1. If a member declare as public then we can acces that member from any where outside the package
2. If a member declare as default then we can access that member from current package
3. If a member declare as private then we can access that member from current class only
4. If a member declare as protected then we can access that from current package either by child or parent refrence , but from outside the
   package use only child refrence
  
 visiblity:-
 private < default < protected < public
 

 
 
/----------FINAL INSTANCE VARIALBE-----------/ 

1. Instance variable are those which are created at the time of object creation and default values are provided by the JVM . If the 
   instance variable declared as the final then compulsory we should have to initialize it before using them and in final instance 
   variable JVM won't provide default values
2. In how many ways we can iniitliaze final instance variable
   >> At the time of declaration
      final int a = 10;
   
   >> Inside constructor
      final int a;
      Test(){
       a=10;
      }
   
   >> Inside instance block
      final int a;
      {
       a=10;
      }
      
 
 
 
/----------FINAL STATIC VARIALBE-----------/ 
 * 
1. Static variable are those which are created at the time of class loading and default values are provided by the JVM . If the 
   Static variable declared as the final then compulsory we should have to initialize it before using them and in final Static 
   variable JVM won't provide default values
2. In how many ways we can iniitliaze final Static variable
   >> At the time of declaration
      static final int a = 10;
      
   >> Inside static block
      static final int a;
      static{
      a=10;
      }
 
 
/----------FINAL LOCAL VARIALBE-----------/ 
1. To fulfill temporary requirement programmer use local variable , we can declare local variable inside any block,method,constructor
   such type of variable are called local variable
2. For the local variable JVM won't provide default values , so local variable must be initialize before using them
 
 


*/

}

