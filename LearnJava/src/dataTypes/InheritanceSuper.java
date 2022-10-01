package dataTypes;

public class InheritanceSuper {

	public static void main(String[] args) {
		
		Barbie barb = new Barbie("Blue", "Grey");
		barb.ColorofToy();
		barb.CategoryofToy();
	}

}

class Toy {
	
	private String colour;
		
	Toy(String color){
		colour = color;
	}
	
	
	void ColorofToy() {
		System.out.println("My colour is :" + colour);
	}
	
}

class Barbie extends Toy {
	
	String HairColour;
	
	Barbie(String color, String HairC)
	{
		super(color); // calls the base class constructor
		HairColour = HairC;
	}
	
	void CategoryofToy() {
		System.out.println(" I belongs to Fantansy Toy and my hair colour is "+HairColour);
	}
	
}