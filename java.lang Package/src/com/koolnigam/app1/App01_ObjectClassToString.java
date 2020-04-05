package com.koolnigam.app1;
/*
>>> The most commonly used package in java program is java.lang package , main advantage of using java.lang package is we don't need to import this because with every 
    java program java.lang package is by default available 
>>> The Classes present in java.lang package is 
    java.lang
    |--> Object Class
    |--> String Class
    |--> StringBuilder Class
    |--> StringBuffer Class
    |--> AutoBoxing and AutoUnboxing
    |--> Wrapper Class
 
>>> The most common method present in Object class are
    java.lang.Object class
    |--> toString()
    |--> hashCode()
    |--> equals()
    |--> clone()
    |--> wait()
    |--> wait(long ms , long ns)
    |--> notify()
    |--> notifyAll()
    |--> getClass()
*/

/*
toString();
==========
>>> We can use this method to get any String representation of an Object 
>>> Whenever we're trying to print Object reference internally toString() executed
>>> If our class doesn't contain toString() then Object class toString() executed 
>>> String class , StringBuffer,StringBuilder class , Wrapper class and in all collection toString() is overridden for just meaningful String representation so its
    recommended to override toString() in our class
>>> In StringBuffer,StringBuilder class , Wrapper class and in all collection toString() is overridden to return content directly
>>> In Object class toString() is defined as follows
    class Object
    {
      public String toString()
      {
      return getClass.getName()+"@"+ Integer.toHexString(hashCode()); // ClassName@HexaDecimal_Representation_Of_HashCode ex.. Student@3e255
      }
    }
*/

public class App01_ObjectClassToString {
	
	int rollno;
	String name;
	
	App01_ObjectClassToString(int sno , String sname){
		this.rollno = sno;
		this.name = sname;
	}
	public String toString() { // in this case our class contain toString() so Object class toString() isn't executed
		return rollno+" "+name;
		
	}
	public static void main(String[] args) {
		App01_ObjectClassToString s1 = new App01_ObjectClassToString(101,"Shubham");
		System.out.println(s1);
		App01_ObjectClassToString s2 = new App01_ObjectClassToString(102,"Shubhanshu");
		System.out.println(s2.toString());
		
		Integer i = new Integer(10); // In StringBuffer,StringBuilder class , Wrapper class and in all collection toString() is overridden to return content directly
		System.out.println(i);
		
		String s11 = new String("Durga");
		System.out.println(s11);
		
		
	}

}
