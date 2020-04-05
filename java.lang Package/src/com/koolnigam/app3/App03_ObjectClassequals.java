package com.koolnigam.app3;
/*
1. We will use .equals() to check equivalance of two objects
2. If our class doesn't contain .equals() then Object class .equals() executed which is meant for reference comparison
3. Object class .equals() implemented as follows which is meant for reference comparison
4. In Object class == and .equals() both are meant for reference comparison but we can override .equals() in our class and use it for content comparison
5. In String class , Wrapper class , Collection  .equals() is meant for content comparison
6. In Object class , StringBuilder class  , StringBuffer class .equals() is meant for reference comparison 
7. If we're passing different types of object in .equals() then we will get false but not ClassCastException
8. If we're passing null argument to .equals() then it should return false but not NullPointerException i.e we've to handle
*/
public class App03_ObjectClassequals {

	int sno;
	String sname; 
	App03_ObjectClassequals(int sno , String sname){
		this.sno = sno;
		this.sname = sname;
	}
	public static void main(String[] args) {
		
		App03_ObjectClassequals s1 = new App03_ObjectClassequals(101,"Shubham");
		App03_ObjectClassequals s2 = new App03_ObjectClassequals(102,"Shubhanshu");
		App03_ObjectClassequals s3 = new App03_ObjectClassequals(101,"Shubham");
	 
		s1 = s2;
		
		
	
		//System.out.println(s1==s2); // in this case object class .equals() got executed which is always meant for reference comparison
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s3));
		//System.out.println(s2.equals(s3));
	
	   
	}

}
/*
>>> String class , Wrapper class , Collection ---> .equals() overriden for content comparison
>>> Object class , StringBuilder and StringBuffer class ---> .equals() overriden for refrence comparison
*/
