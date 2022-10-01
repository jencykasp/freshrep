package dataTypes;

public class Polymorphism {

	public static void main(String[] args) {

		// Overloading - Poly = more than one // Morhp = Form // More than one form

		// Method Overloading
		Barbie1 barb1 = new Barbie1("Blue", "Brown");
		barb1.ColorofToy();
		barb1.ColorofToy("White");
		barb1.CategoryofToy();

		// Constructor overloading
		Barbie1 barb2 = new Barbie1("Red");
		barb2.ColorofToy();
		barb2.CategoryofToy();
		
		//Overloading in derived class
		Barbie1 barb3 = new Barbie1("Pink", "blonde");
		barb3.ColorofToy();
		
		
		//Direct obj of Toy 
		Toy1 toy = new Toy1("Red");
		toy.ColorofToy();
	}

}

class Toy1 {

	String colour;

	Toy1(String color) {
		colour = color;
	}

	void ColorofToy() {
		System.out.println("My colour is :" + colour);
	}

	void ColorofToy(String dualColor) {
		System.out.println("My Dual colour is :" + colour + " : " + dualColor);
	}

}

class Barbie1 extends Toy1 {

	String HairColour;

	Barbie1(String color, String HairC) {
		super(color); // calls the base class constructor
		HairColour = HairC;
	}

	Barbie1(String color) {
		super(color);
	}

	void ColorofToy() { //over riding
		System.out.println("My Haircolour is :" + HairColour);
	}
	
	void CategoryofToy() {
		if (HairColour != null)
			System.out.println(" I belongs to Fantansy Toy and my hair colour is " + HairColour);
		else
			System.out.println(" No Hair colour defined");
	}

}