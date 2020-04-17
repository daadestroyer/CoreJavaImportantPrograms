package com.koolnigam.app19;

import java.util.HashMap;
import java.util.WeakHashMap;

/*
STORY:-

Temp class ka t object banaya or usko key bana ke map me add kiya or value me durga add kiya
uske baad t null ko point karne laga (t=null) turant uske baad GC aya t object ko destroy karne ke
liye kyuki t object ke pass koi external refrence nahi tha jab GC ne t object ko destroy karne ke liye kaha t object rone laga to usne HashMap ko bulaya or GC se poocha kyu isko destroy kar rahe ho to GC ne bola t object kisi ko point nahi kar rha uska koi refrence nhi hai to usko destroy
karne ke liye aye hai GC ne bola nahi destroy karo kyuki t as a key mere HashMap se associated hai to usko destroy na karo to uske baad GC jvm ke pass gaya or usko sab batay ki rule ke according HashMap hame destroy nahi karne de rha hai hame t object ko JVM ne bola uske pass mat jao tum wo HashMap tumse strong hai

CONCLUSION :  IF ANY OBJECT ASSOCIATED WITH HASHMAP AND IF IT DOESN'T HAVE ANY REFRENCE THEN ALSO IT IS NOT ELIGIBLE FOR GARBAGE 
			  COLLECTOR . BUT IN THE CASE OF WEAK HASH MAP IT IS ELIGIBLE FOR GC  
*/
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize called");
	}
}
public class App19_Map_WeekHashMap_03 {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap<Object,String> hs = new WeakHashMap<Object,String>();
		
		Temp t = new Temp();
		hs.put(t,"Durga");
		System.out.println(hs); // to String called
		
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hs);
		/* OUTPUT :
           --------
            {temp=Durga}
            {temp=Durga}
            here HashMap dominates GC  

        */
		
		/*
		In place of HashMap if we use WeakHashMap output is :
		{temp=Durga}
        Finalize called
        {} // after 5 second GC destroy key so value also destroy
 
           // here GC dominates WeakHashMap
		*/
	}

}
