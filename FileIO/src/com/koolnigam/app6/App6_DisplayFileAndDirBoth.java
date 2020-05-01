package com.koolnigam.app6;

import java.io.File;

/*
WAP to list all the dir name and file name present in this URL
D:\youtube videos\Durga software solutions\Durga Sir\Core java By Durga Sir\1 identifiers and keywords
*/
public class App6_DisplayFileAndDirBoth {

	public static void main(String[] args) {
		int count=0;
		File f = new File("D:\\youtube videos\\Durga software solutions\\Durga Sir\\Core java By Durga Sir");
		String[] s = f.list();

		for (String s1 : s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("No. of directory and files present in given URL is :"+count);
	}

}
