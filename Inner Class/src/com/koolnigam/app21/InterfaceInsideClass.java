package com.koolnigam.app21;

class VechileType{
	interface Vechile{
		void wheels();
	}
}
class Bus implements VechileType.Vechile{
	public void wheels() {
		System.out.println("Bus have 4 wheels");
	}
}
class Truck implements VechileType.Vechile{
	public void wheels(){
		System.out.println("Truck have 8 wheels");
	}
}
class Tampo implements VechileType.Vechile{
	public void wheels() {
		System.out.println("Tampo having 3 wheels");
	}
}

class InterfaceInsideClass{
    public static void main(String[] args) {
     new Bus().wheels();
     new Truck().wheels();
     new Tampo().wheels();
    }
} 