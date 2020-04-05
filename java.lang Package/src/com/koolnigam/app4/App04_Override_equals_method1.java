package com.koolnigam.app4;

public class App04_Override_equals_method1 {

	int rollno;
	String name;
	
	App04_Override_equals_method1(int rollno , String name){
		this.rollno = rollno;
		this.name = name;
	}
	/*
	public boolean equals(Object obj) {
		try {
			int rollno1 = this.rollno;
			String name1 = this.name;
			App04_Override_equals_method1 s2  =  (App04_Override_equals_method1)obj;
			
			String name = s2.name;
			int rollno = s2.rollno;
			
			if(name1.equals(name) && rollno1==rollno) {
				return true;
			}
			else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
		catch (NullPointerException e) {
			return false;
		}
		
	}*/
	
	//MORE SIMPLIFIED VERSION
	
	/*
	public boolean equals(Object obj) {
		try {
			App04_Override_equals_method1 s1 = (App04_Override_equals_method1)obj;
			
			if(name.equals(s1.name) && rollno==s1.rollno) {
				return true;
			}
			else {
				return false;
			}
		} 
		catch (NullPointerException e) {
			return false;
		}
		catch (ClassCastException e) {
			return false;
		}
	}
	*/
	
	//MORE SIMPLIFIED VERSION
	public boolean equals(Object obj) {
	
		if(obj instanceof App04_Override_equals_method1) {
			App04_Override_equals_method1 s1 = (App04_Override_equals_method1)obj;
		    
			if(name.equals(s1.name) && rollno==s1.rollno) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		App04_Override_equals_method1 s1 = new App04_Override_equals_method1(101,"Shubham");
		App04_Override_equals_method1 s2 = new App04_Override_equals_method1(101,"Shubham");
		App04_Override_equals_method1 s3 = new App04_Override_equals_method1(102,"Shubhanshu");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
