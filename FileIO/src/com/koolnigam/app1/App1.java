package com.koolnigam.app1;
/*
File class constructor:-
----------------------
1. File f = new File(String name);
     --> name may be file name or dir name
     --> it create file in same working dir
     ex.. File f = new File("shubham.txt"); --> it is file_name
     ex.. File f = new File("shubham");   --> it is dir_Name
   
2. File f = new File(String subdirname , String name); 
     --> it may be that i want to create file(name) inside some directory
     --> it create file in some dir
     ex.. File f = new File("shubham","abc.txt");   --> create abc.txt inside shubham dir
   
3. File f = new File(File subfirname , String file_name);
     --> if you want to create a file in some dir and dir is alrady created 
     ex.. File f = new File("shubham","abc.txt");   --> here shubham dir already created inside abc.txt create
   


Methods present in File:-
-------------------------
1. exist(); --> check whether file exist or not and return true if exist else false
2. createNewFile(); --> create new File
3. mkdir();  --> to make a directory 
4. isFile(); --> check whether f pointing to particular file or not
5. isDirectory() --> check whether f pointing to particular directory or not
6. String[] list() --> return name of all sub directories and files present in specified directory
7. long length() ---> to check how many no of character present in file 
8. delete() --> to delete file/directory 


*/
import java.io.File;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
	
		String file_name = "abc.txt";
		File f = new File(file_name+".txt");  // by this we can only check shubham.txt already created or not it doesn't created
		                                   // shubham.txt here File object f is only created
		boolean status = f.exists();
		if(status==false) {
			System.out.println(file_name+" Not Exist !!!");
		}
		
		
		
		
		
		

	}

}
