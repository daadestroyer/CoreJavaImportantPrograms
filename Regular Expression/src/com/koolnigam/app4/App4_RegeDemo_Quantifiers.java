package com.koolnigam.app4;
/*
Quantifiers:-
-------------
x--> a we're searching for single a
     0---a
	 2---a
	 3---a
	 5---a
	 6---a
	 7---a

x--> a+ we're searching for at least one a
     0---a
 	 2---aa
     5---aaa

x--> a* we're searching for any no including zero number
     0---a
	 1---
	 2---aa
	 4---
	 5---aaa
	 8---
	 9---

x--> a? we're searching for at most one a
     0---a
 	 1---
	 2---a
	 3---a
	 4---
	 5---a
	 6---a
	 7---a
	 8---
	 9---

*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App4_RegeDemo_Quantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
	  
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	
	}
	
}
