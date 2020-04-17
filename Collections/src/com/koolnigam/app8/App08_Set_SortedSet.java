 package com.koolnigam.app8;
/*
>>> If we want to represent group of element in a single entity where duplicates are not allow and elements are inserted in sorted order

Methods present in sorted set(Applicable for SortedSet):-
=========================================================
1. Object first() 				     --> return first element
2. Object last()  			         --> return last element
3. SortedSet headSet(Object obj)     --> return SortedSet whose elements are < Object
4. SortedSet tailSet(Object obj)     --> return SortedSet whose elements are >= Object
5. subset(Object obj1 , Object obj2) --> return subset which >= obj1 and < obj2
6. Comparator comparator();


SortedSet
|100| 1) first()  	     --> 100
|101| 2) last()          --> 109
|103| 3) headSet(104)    --> 100,101,103
|104| 4) tailSet(104)    --> 104,105,106
|106| 5) subset(101,106) --> 101,103,104
|109| 6) comparator()    --> nulls
|___|
*/
import java.util.SortedSet;

public class App08_Set_SortedSet {

	public static void main(String[] args) {
		

	}

}
