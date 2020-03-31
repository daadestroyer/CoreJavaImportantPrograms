package com.koolnigam.app2;
/*
>>> Inside class if we required multiple implements of a interface and these implementation of relevant to a particular class , then we should declare interface inside
    class
*/

class VechileType
{
  interface Vechile
  {
	  public int noOfWheels();
  }
}
class Bus implements VechileType.Vechile
{
 public int noOfWheels() {
	 return 10;
 } 
}
class Auto implements VechileType.Vechile
{
 public int noOfWheels() {
	 return 3;
 } 
}
class Test {

	public static void main(String[] args) {
		System.out.println("No of wheels bus have : "+new Bus().noOfWheels());
		System.out.println("No of wheels auto have : "+new Auto().noOfWheels());
	}

}
