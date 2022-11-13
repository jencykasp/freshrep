package dataTypes;

public class AbstractConcept {

	public static void main(String args[]) {
		
		Shape s = Shapes.getSquare(10);
		s.a = 10;
		s.draw();
		s.area();
	}

}

//Abstraction means encapsulated. not revealing to outside world.
//Interfaces - declare and implement in another class

abstract class Shape
{
	Shape(float a , float b ){
		this.a = a;
		this.b = b;
	}
	
	Shape(float a){
		this.a = a;
	}
	
	float a;
	float b;
	abstract void draw();
	
	abstract void area();
	
}

class Shapes {
	
	static Circle getCircle(float rad) {
		
		return new Circle(rad);
	}
	
	 static Square getSquare(float side) {
		return new Square(side);
	}
	
	 static Rectangle getRect(float len, float br) {
			return new Rectangle(len,br);
		}

}

class Square extends Shape
{  
	
	Square(float side) {
		super(side);
	}
	@Override
	void draw()
	{
		System.out.println("drawing Square");
	}
	
	@Override
	void area() {
		System.out.println("The area is :" + a*a);
	}
	
	
}  

class Circle extends Shape
{  
	
	Circle(float rad){
		super(rad);
	}
	
	@Override
	void draw()
	{
		System.out.println("drawing circle");
	}
	
	@Override
	void area() {
		System.out.println("The area is :"+ 3.14 * a*a);
	}
} 

class Rectangle extends Shape
{  
	
	Rectangle(float len , float br){
		super(len,br);
	}
	@Override
	void draw()
	{
		System.out.println("drawing Rectangle");
	}
	
	@Override
	void area() {
		System.out.println("The area is :"+ a * b);
	}
} 
