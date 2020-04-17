package com.koolnigam.app21;

import java.util.Hashtable;

/*
1. Underlying DS is HashTable
2. Duplicates keys not allowed , values can be
3. Insertion order not preserved and it is base on HashCode of keys
4. Null insertion is possible for both keys and value
5. Implements serializable , cloneable but not RAI
6. Every method present in HashTable is synchronized and object of HashTable is Thread safe
7. Best for search
8. Hetrogeneous object allow for both keys and values

CONSTRUCTOR:-
=============
1. HT ht = new HT();
   def cap : 11;
   fill ratio : 0.75
2. HT ht = new HT(int initial capacity);
3. HT ht = new HT(int initial capacity , float ratio);
4. HT hs = new HS(Map m);
*/

class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
	public int hashCode() { // Temp t = new Temp(10); then 10 will become hashCode of object t
		return i;
	}
	public String toString() {
		return i+""; // yahan par return karna tha String value lekin i joki int hai uske saath String concat karke usko String bna dia
	}
}
public class App21_Map_HashTable_ {

	public static void main(String[] args) {
 
		 Hashtable h = new Hashtable();
		 h.put(new Temp(5),"A");
		 h.put(new Temp(2),"B");
		 h.put(new Temp(6),"C");
		 h.put(new Temp(15),"D");
		 h.put(new Temp(23),"E");
		 h.put(new Temp(16),"F");
		 System.out.println(h); // print content of HashTable {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}

		 
	}

}
/**/