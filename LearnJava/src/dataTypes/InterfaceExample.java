package dataTypes;

public class InterfaceExample {

	public static void main(String[] args) {
		Elephant Ele = new Elephant();
			Ele.livesinForest();
			Ele.liveswithHumans();
		
		Horse horse = new Horse();	
			horse.liveswithHumans();
				
	}

}


class WildAnimal {

void livesinForest() {
	System.out.println("Im living in Forest");
}

}


interface DomesticAnimal {

void liveswithHumans();

}


class Elephant extends WildAnimal implements DomesticAnimal
{

	@Override
	public void liveswithHumans() {
		System.out.println("Im a Elephant , I'm also living with Humans");
	}
	
}

class Horse implements DomesticAnimal {
	

@Override
public void liveswithHumans() {
	System.out.println("I'm a horse and I'm living in Farm");
}
	
}