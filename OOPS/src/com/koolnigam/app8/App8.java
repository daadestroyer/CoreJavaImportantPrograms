package com.koolnigam.app8;

import java.sql.SQLException;
/*If parent class constructor throws any checked exception then Child class constructor also throws same checked 
exception or its parent*/
class P{
	P()throws SQLException{
		System.out.println("P constructor");
	}
}
class C extends P{
	C()throws Exception{
		System.out.println("C constructor");
	}
}
public class App8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
