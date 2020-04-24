package com.koolnigam.app3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

Predefined Character Classes:-
==============================
\s ---> search for space character
\S ---> search for any character including space character
\d ---> search any digit from 0 to 9 [0-9]
\D ---> Except digit any character
\w ---  search only for character and digit [0-9A-Za-z]
\W ---> Except word character (special character)
. ----> Search for any character (digit,character,special symbol)

*/
public class App3_RegeDemo_Predefined_Character_Class {

	public static void main(String[] args) {
		
      Pattern p = Pattern.compile(".");
      Matcher m = p.matcher("a7b k@9z");
      
      while(m.find()) {
    	  System.out.println(m.start()+"---"+m.group());
      }
	}

}

/*
if we replace:-
--------------
x---> \\s     means your searching only for space character
      3---" "
  
x---> \\S     means your searching for character including space character
      0---a
	  1---7
	  2---b
	  4---k
	  5---@
	  6---9
	  7---z

x---> \\d    means your searching for digit from 0-9
      1---7
	  6---9

x---> \\D    except digit you're searching anything else
      0---a
	  2---b
	  3--- 
	  4---k
	  5---@
	  7---z
	  
x---> \\w   means your searching only for character & digit [a-zA-Z0-9]
      0---a
	  1---7
	  2---b
	  4---k
	  6---9
	  7---z

x---> \\W  means you're searching only for special character [^a-zA-Z0-9]
      3--- 
      5---@

x---> .  means you're searching for any character it may be digit,character,special symbol
*/
