package com.koolnigam.interview;

public class InterviewQuestion {
/*
Q.1 What are the classes present in java.lang package ?
Q.2 Which package is by default available to all java programs ?
Q.3 What are the methods present in Object class ?
Q.4 Explain toString() ? Object class toString() internally called which method ?
Q.5 Explain hashCode() ?

Q.6 If we override hashCode() method and print object reference then it call Object class toString() and internally call our class hashCode() it is true or not ? 
    ===> TRUE
Q.7 If we override toString() and hashCode() method and print object reference then it call our class toString() and internally doesn't call out class hashCode() it is
    true or not ? 
    ===> TRUE
    
Q.8 JVM use hashCode() while saving object into hashing related data structure like HashSet , HashMap , HashTable and while searching most commonly used way is by 
    using hashCode() true or not ?
    ===> TRUE
    
Q.9 Explain .equals() with example ?
Q.10 In object , StringBuilder , StringBuffer .equals() is meant for reference comparison true or not ? ---> TRUE
Q.11 In String class , Wrapper class , Collections .equals() is meant for content comparison ?  ---> TRUE
Q.12 If we're passing null arguments to .equals() then we will get false and not get NullPointerException ---> TRUE
Q.13 If we're passing different type of argument to .equals() then we will get false and not get ClassCastException true or not ---> TRUE 
Q.14 In Object class == is meant for reference comparison true or not ? ---> TRUE
Q.15 Give example how to override Object class .equals() in our class for content comparison ? In Simplified version also ? APP4
Q.16 Difference b/w == and .equals() 
====
Ans:-
1. In Object class == is meant for reference comparison(and .equals() also)
   In String class .equals() is meant for content comparison
   
2. If s1==s2 is true then s1.equals(s2) always true
3. If s1==s2 is false then we can't conclude for s1.equals(s2) it may be true/false 
4. If s1.equals(s2) then we can't conclde for s1==s2 
5. If s1.equals(s2) false then s1==s2 always false
====

Q.17 Difference b/w == opeartor and .equals()
====
Ans:-
1. == is a operator
   .equals() is a method
2. == is for both primitive and object type
   .equals() is only for object type
3. To use == operator there should be some relation it may be parent to child or child to parent other we will get CE:
   To use .equals() if there is different types of object we simply get false
4. In Object class == means for reference comparison
   In String class,Wrapper class,Collection .equals() is meant for content comparison
5. We can't override == operator (operator overloading in java isn't possible)
   We can override .equals() in our class
====

Q.18 If 2 objects are equal by .equals method then their hashCode will must be same true or not ---> TRUE
Q.19 If hashCode of 2 objects are not equal then compulsory they will not be equal with .equals() also true or not ? ---> TRUE
Q.20 If 2 objects are not equals by .equals() then we can't predict their hashCode will be equal or not true or not ? ----> TRUE
Q.21 If hashCode of 2 object are equals we can't predict that they may equals with .equals() true or not ? ---> TRUE
Q.22 Difference b/w String and StringBuffer ? With Example also
Q.23 Explain immutablity and mutablity ? Explain immutablity and mutablity with example ? 
Q.24 Differentiate b/w String s = new String("Shubham") and String s = "Shubham";
Q.25 Explain SCP rules and regulations ? 
Q.26 Explain advantage and disadvantage of SCP ? 
Q.27 What is the use of intern();
Q.28 Explain all the methods of Object Class ? String Class ? StringBuffer ?
Q.29 What are the disadvantage of StringBuffer in comparison with StringBuilder ? 
Q.30 Difference b/w StringBuffer and StringBuilder ? 
Q.31 When we will use StringBuilder ? and why ?
Q.32 Explain String VS StringBuffer VS StringBuilder
Q.33 Explain all utility methods ? 
Q.34
Q.35
Q.36
Q.37
Q.38
Q.39
Q.40
Q.41
Q.42
Q.43
Q.44
Q.45
Q.46
Q.47
Q.48
Q.49
Q.50
Q.51
Q.52
Q.53
Q.54
Q.55
Q.56
Q.57
Q.58
Q.59
Q.60
Q.61
Q.62
Q.63
Q.64
Q.65
Q.66
Q.67
Q.68
Q.69
Q.70
*/
}
