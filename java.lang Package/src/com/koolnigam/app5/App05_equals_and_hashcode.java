package com.koolnigam.app5;
/*
1. If 2 objects are equal by .equals method then their hashCode will must be same 
   means s1.equals(s2) true , then s1.hashCode==s2.hashCode must be true
2. If hashCode of 2 objects are not equal then compulsory they will not be equal with .equals() also
3. If 2 objects are not equals by .equals() then we can't predict their hashCode will be equal or not
   means s1.equals(s2) false , then s1.hashCode==s2.hashCode may be true or false
4. If hashCode of 2 object are equals we can't predict that they may equals with .equals()
 
*/
public class App05_equals_and_hashcode {

	int sno;
	String sname;
	
	App05_equals_and_hashcode(int sno , String sname){
		this.sno = sno;
		this.sname = sname;
	}
	
	public static void main(String[] args) {
		App05_equals_and_hashcode s1 = new App05_equals_and_hashcode(101,"Shubham");
		App05_equals_and_hashcode s2 = new App05_equals_and_hashcode(102,"Shubhanshu");
		App05_equals_and_hashcode s3 = new App05_equals_and_hashcode(103,"Sakshi");
		
		// if 2 object are equals with .equals() then compulsory their hashcode will also be equal 
		s1=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		
		// if hashCode of 2 objects are not equal then compulsory they are also not equal by .equals()
		System.out.println("\n"+s1.equals(s3));
		System.out.println(s1.hashCode()==s3.hashCode());
	
		// if 2 objects are not equal by .equals then then we can't predict their hashcode will be equal or not
		System.out.println("\n"+s1.equals(s3));
		System.out.println(s1.hashCode()==s3.hashCode());
		
	}

}
