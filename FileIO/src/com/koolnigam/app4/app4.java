package com.koolnigam.app4;

import java.io.File;
import java.io.IOException;

// WAP in which store some shubham.txt file to shubham dir
// WAP in which store some nigam.txt file in shubham dir which is already created
public class app4 {

	public static void main(String[] args) throws IOException {
		
	File f = new File("shubham"); // created shubham dir in current working dir
	System.out.println("Directory shubham created : "+f.mkdir());
	
	File f1 = new File(f,"shubham.txt"); // creating shubham.txt file in shubham dir
	System.out.println("file shubham.txt created : "+f1.createNewFile());
	
	File f2 = new File(f,"nigam.txt"); // creating nigam.txt inside shubham dir using its object
	f2.createNewFile();
	}

}
