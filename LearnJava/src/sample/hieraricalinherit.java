package sample;

public class hieraricalinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rose1 button1 = new rose1();
		button1.color = "red";
		System.out.println(button1.color);
		button1.smell();
		button1.fragrant();
		button1.dense = "thick";
		System.out.println(button1.dense);

		dalia dal = new dalia();
		dal.color = "lavender";
		dal.smell();
		System.out.println(dal.color);
		dal.place();
		System.out.println(dal.color);
	}

}

class flower1 {
	String color;

	void smell() {
		System.out.println("Nice Fragrant");
	}

	

}

class rose1 extends flower {

	String dense;

	void fragrant() {
		System.out.println("Used in Boquet");
	}

}

class dalia extends flower {
	String place;

	void place() {
		System.out.println("grow in hill");

	}

}