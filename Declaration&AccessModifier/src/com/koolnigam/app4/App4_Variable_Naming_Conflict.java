package com.koolnigam.app4;

interface Left{
	int x = 888;
}
interface Right{
	int x = 999;
}
public class App4_Variable_Naming_Conflict {

	public static void main(String[] args) {
		System.out.println(Left.x);
		System.out.println(Right.x);

	}

}

