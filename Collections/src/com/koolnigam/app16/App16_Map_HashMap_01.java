package com.koolnigam.app16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
MAP(I):-
========
>>> Map is not child interface of collection(I)
>>> If we want to represent group of object based on key value pair then we should go for Map
>>> both key and value are objects
>>> keys can't be duplicate but value can be
>>> insertion order not preserved


HashMap:-
========
>>> The underlying DS is HashTable
>>> Duplicate keys not allowed but values can be
>>> insertion order not preserved and it based on hashCode of keys
>>> Heterogeneous object allowed for both keys and values
>>> null insertion (allowed for once only for key) and for (values any no of time)
>>> implements serializable , cloneable , RandomAccessInterface
>>> best if our frequent operation is search
>>> by default HashMap is non-synchronized we will get it by synchronizedMap()

1. HS hs = new HS();
   default cap : 16 
   fill ration : 0.75

2. HS hs = new HS(int initial capacity);
3. HS hs = new HS(int initial capacity , float fill ratio)
4. HS hs = new HS(Map m);
*/

public class App16_Map_HashMap_01 {

	public static void main(String[] args) {
		
     HashMap m = new HashMap();
     m.put("chiranjeevi", 700); // chiranjeevi is key 700 is value
     m.put("balaiah", 800);
     m.put("venkatesh", 200);
     m.put("nagarjuna" , 500);
     
     // System.out.println(m); // printing Map object {balaiah=800, chiranjeevi=700, venkatesh=200, nagarjuna=500}
  
     
     /*
      System.out.println(m.put("chiranjeevi", 1000));  if we're adding new key & if it is already present then the value will be 
                                                        be changed and old value returned*/
      //System.out.println(m);
     
     
     /*
     Set s = m.keySet();
     System.out.println("\nPrinting all keys :"+s);  or sop(m.keySet()); 
                                                    return all keys [balaiah, chiranjeevi, venkatesh, nagarjuna]  */
     
     
     /*
     Collection c = m.values();
     System.out.println("\nPrinting all values :"+c);  or sop(m.values()); 
     												    return all values  [800, 1000, 200, 500] */
     
     /*
     Set s1 = m.entrySet();
     System.out.println("\nPrinting all entry :"+s1);  or sop(m.entrySet());
     												     [balaiah=800, chiranjeevi=1000, venkatesh=200, nagarjuna=500 */
     
     /*
     Object o = m.get("chiranjeevi");  get value of key by providing key 1000 
     									 or sop(m.get(chiranjeevi); */
     // System.out.println(o);
     
     /*
     System.out.println(m.remove("nagarjuna")); // remove key by providing key name 
     System.out.println(m);   // {balaiah=800, chiranjeevi=1000, venkatesh=200}
     */
     
     
     System.out.println(m.containsKey("balaiah")); // check whether this key present or not : true
     System.out.println(m.containsKey("hurrr")); // check whether this key present or not : false
     
     
     
     System.out.println(m.isEmpty()); // check whether map is empty or not : false
     
     
     
     System.out.println(m.size()); // return no of key (or entry present in map) : 3
     
     // m.clear(); // clear complete map
     
     
/*******************************************************************************************************/     
     Set S = m.entrySet();
     Iterator itr = S.iterator();
     while(itr.hasNext()){ // getting each entry one by one (but Entry is inner interface of Map)
      
       Map.Entry m1 = (Map.Entry)itr.next(); // getting entry object one by one and typecasting Entry object to Map.Entry type
       System.out.println(m1.getKey()+"...."+m1.getValue());
       
       // if key is nagarjuna pls change the value
       if(m1.getValue().equals("nagarjuna")) {
    	   m1.setValue(10000);
       }
     }
     System.out.println(m);
  }

}
