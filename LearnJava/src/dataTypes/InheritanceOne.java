package dataTypes;

public class InheritanceOne {

	public static void main(String args[]) {

		Dog pup1 = new Dog(); // Dog Is A Animal
		pup1.Colour = "Brown";
		pup1.speed = 10;
		pup1.hydrophobia = false;

		pup1.bark();
		pup1.eat();
		pup1.playwithHumans();
		pup1.TellMeAbooutYou();

		Cat kit1 = new Cat();
		kit1.Colour = "Grey";
		kit1.fluffy = true;
		kit1.speed = 30;
		kit1.Scratching();
		kit1.eat();
		kit1.TellMeAbooutYou();
	}

}

// Cat IS A Animal
class Cat extends Animal {
	boolean fluffy;

	void Scratching() {
		System.out.println(" Meow ! I scratch .. ");
	}

}

// Dog IS A Animal 
class Dog extends Animal {
	boolean hydrophobia;

	void bark() {
		System.out.println("I'm barking");
	}

	void playwithHumans() {
		System.out.println("Im playing with Vaidee");
	}

}

class Animal {
	String Colour;
	int speed;

	void eat() {
		System.out.println("I'm eating");
	}

	int maxSpeed() {
		return speed * 2;
	}

	void TellMeAbooutYou() {
		System.out.println("Im " + Colour + " in colour");
		System.out.println("I run at speed: " + speed);
	}
}