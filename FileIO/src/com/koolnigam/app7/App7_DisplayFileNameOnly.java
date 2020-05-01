package com.koolnigam.app7;

import java.io.File;

// WAP to display only file not directory
// D:\youtube videos\Durga software solutions\Durga Sir\Core java By Durga Sir\1 identifiers and keywords
public class App7_DisplayFileNameOnly {

	public static void main(String[] args) {
		int count=0;
		File f = new File("D:\\youtube videos\\Durga software solutions\\Durga Sir\\Core java By Durga Sir\\1 identifiers and keywords");
        String[] s = f.list();
        
        for (String s1 : s) {
        	File f1 = new File(f,s1); // here we represent a file present in some other location
			if(f1.isFile()) {  // we can't call isFile() on String object so in above line we do something
				count++;
				System.out.println(s1);
			}
		} 
        System.out.println("Total no of files "+count);
	}

}
