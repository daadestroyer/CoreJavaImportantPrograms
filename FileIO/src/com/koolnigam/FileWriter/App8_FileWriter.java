package com.koolnigam.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
>>> These constructor are used to override old data:-
-----------------------------------------------------
--> If our specified file is not there then these constructor create that file
1. FileWriter f = new FileWriter(String file_name);
2. FileWriter f = new FileWriter(File f);

>>> These constructor are used to append new data with old data:-
-----------------------------------------------------------------
--> If our specified file is not there then these constructor don't create that file
1. FileWriter f = new FileWriter(String file_name,boolean append);
   --> in place of boolean if u pass true it will append new data with new
   --> in place of boolean if u pass false it will override old data with new

2. FileWriter f = new FileWriter(File f , boolean append);

Methods Present in File Writer:-
------------------------------
1. write(int ch);
   --> to write a single character
   fw.write('a'); or fw.write(97);

2. write(char[] ch);
   --> to write array of character;
   
3. write(String s);
   ---> to write String to the file
   
4. flush();
   --> to give gurrantee to transfer complete data untill last character written to the file

5. close();
   --> to close FilwWriter object

*/
public class App8_FileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("shubham.txt",true); // this constructor check if file is not there then it create file
        fw.write(100);
        fw.write("urga \n Software Solution New");
        fw.write("\n");
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();
        System.out.println("Completed");
	}

}
