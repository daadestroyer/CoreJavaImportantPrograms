package com.koolnigam.app7;
/*If child class overriden method throws any checked exception then parent class overriding method also throws
 same checked exception or its parent*/
import java.sql.SQLException;

class P{
	void m1(int x)throws Exception {
		System.out.println("m1 of P");
	}
}
class C extends P{
	void m1(int x)throws SQLException {
		System.out.println("m1 of C");
	}
}
public class App7 {

	public static void main(String[] args) {
		

	}

}
