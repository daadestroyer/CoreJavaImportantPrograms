package com.koolnigam.app2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args)throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File Name :");
		String file_name = sc.next();
		System.out.print("Enter File Type :");
		String file_type=sc.next();
		
		File f = new File(file_name+"."+file_type);
		boolean status = f.exists();
		
		if(status==false) {
			System.out.println(file_name+"."+file_type+" File Not Found");
			Thread.sleep(2000);
			System.out.println("Going to create "+file_name);
			Thread.sleep(2000);
			status=f.createNewFile();
			if(status==true) {
				System.out.println(file_name+" Created Successfully");
			}
			else {
				System.out.println(file_name+" Can't Created");
			}
		}
		else {
			System.out.println(file_name+"."+file_type+" File Found");
		}

	}

}
