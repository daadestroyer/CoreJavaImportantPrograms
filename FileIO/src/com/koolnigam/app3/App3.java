 package com.koolnigam.app3;

import java.io.File;

public class App3 {

	public static void main(String[] args) {
		
		File f = new File("shubham"); // it is directory name
		System.out.println(f.exists()); // false coz shubham dir not found
		
		f.mkdir(); // creating dir of above name
		System.out.println(f.exists()); // true coz dir created
	}

}
