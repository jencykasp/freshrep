package sample;

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rose button = new rose();
		button.color = "red";
		System.out.println(button.color);
		button.smell();
		button.fragrant();
		button.dense = "thick";
		System.out.println(button.dense);
	}

}

class flower {
	String color;

	void smell() {
		System.out.println("Nice Fragrant");
	}

}

class rose extends flower {

	String dense;

	void fragrant() {
		System.out.println("Used in Boquet");
	}

}
