package com.koolnigam.app2;
import java.util.regex.Matcher;
/*
Character classes:-
===================
[abc]---> either a or b or c
[^abc]---> except 'a' , 'b' , 'c'
[a-z]---> check only for lower case alphabet symbol from a to z
[A-Z]---> check only for upper case alphabet symbol from A to Z
[a-zA-z]---> check any alphabet symbol either lower or upper case
[0-9]---> check only for digit from 0 to 9
[0-9A-Za-z]---> check only for alpha numeric character
[^0-9A-Za-z]---> check only for special symbol

*/
import java.util.regex.Pattern;

public class App2_RegeDemo_Character_Class {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("a3b#k@9z");
       
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	}

}
/*
if we replace:-
--------------
x--->[abc] means i'm searching for either 'a' or 'b' or 'c'
     0---a
     2---b
x--->[^abc] means i'm searching except 'a' or 'b' or 'c'
     1---3
     3---#
     4---k
     5---@
     6---9
     7---z
x--->[a-z] means i'm searching only for a-z in lower case
     0---a
     2---b
     4---k
     7---z
x--->[0-9] means i'm searching for digit b/w 0 to 9 
     1---6
     6---9
x--->[A-Za-z0-9] means i'm searching for any alphaber symbol and 0 to 9 digit
     0---a
	 1---3
	 2---b
	 4---k
	 6---9
	 7---z
x--->[^a-zA-Z0-9] means i'm searching for special symbol
     3---#
	 5---@

*/
