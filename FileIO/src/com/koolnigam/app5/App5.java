package com.koolnigam.app5;

import java.io.File;
import java.io.IOException;

// WAP in which a file in some particaulr location of dir
public class App5 {

	public static void main(String[] args) throws IOException {
	
		File f = new File("C:\\Users\\SHUBHAM\\Desktop\\Prepinsta Videos","shubhi.txt");
		System.out.println(f.createNewFile());

	}

}
	