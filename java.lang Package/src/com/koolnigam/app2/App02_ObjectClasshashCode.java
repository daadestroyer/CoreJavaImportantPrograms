package com.koolnigam.app2;
/*
public class App02_ObjectClasshashCode {

	int rollno;
	String name;
	
	App02_ObjectClasshashCode(int sno , String sname){
		this.rollno = sno;
		this.name = sname;
	}
	public static void main(String[] args) {
		App02_ObjectClasshashCode s1 = new App02_ObjectClasshashCode(101,"Shubham");
		App02_ObjectClasshashCode s2 = new App02_ObjectClasshashCode(102,"Shubhanshu");
        System.out.println(s1); // in this case object class toString() called which internally object class hashCode()
	}

}
*/

public class App02_ObjectClasshashCode {

	int rollno;
	String name;
	
	App02_ObjectClasshashCode(int sno , String sname){
		this.rollno = sno;
		this.name = sname;
	}
	public int hashCode() {
		return rollno;
		
	}
	public static void main(String[] args) {
		App02_ObjectClasshashCode s1 = new App02_ObjectClasshashCode(101,"Shubham");
		App02_ObjectClasshashCode s2 = new App02_ObjectClasshashCode(102,"Shubhanshu");
        System.out.println(s1); // in this case object class toString() called which internally call our class(App02_ObjectClasshashCode) hashCode()
	}

}

/*
public class App02_ObjectClasshashCode {

	int rollno;
	String name;
	
	App02_ObjectClasshashCode(int sno , String sname){
		this.rollno = sno;
		this.name = sname;
	}
	public String hashCode() {
		return rollno+" "+name;
		
	}
	public int hashCode() {
		return rollno;
		
	}
	public static void main(String[] args) {
		App02_ObjectClasshashCode s1 = new App02_ObjectClasshashCode(101,"Shubham");
		App02_ObjectClasshashCode s2 = new App02_ObjectClasshashCode(102,"Shubhanshu");
        System.out.println(s1); 
        System.out.println(s2); 
        
        // If we're giving chance to object class toString() then it will calls internally object class hashCode()
        // but if we're overriding toString() and hashCode() then our class toString() executed which doesn't call our class hashCode() 
	}

}
*/
 