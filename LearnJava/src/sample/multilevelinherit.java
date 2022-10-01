package sample;

public class multilevelinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shimlaapple app = new shimlaapple();
		app.size="small";
		app.skin();
		System.out.println(app.size);	
	app.color = "red";
	System.out.println(app.color);
	app.health();
	app.taste = "good";
	System.out.println(app.taste);
	app.fresh = true;
	System.out.println(app.fresh);
	app.DetailsOFApple();
	}

}

class fruit {
	String size;  //"100"

	void skin()
	{
		System.out.println("good for skin");
	}

}

class apple extends fruit {
	String color;

	void health()

	{
		System.out.println("Good for health");
	}
}

class shimlaapple extends apple {
	String taste;
	boolean fresh;

	void DetailsOFApple() {
		System.out.println("It grows in hill");
		System.out.println("Color of apple is "+ color);
		System.out.println("Size of apple is "+ size);
		System.out.println("Taste of apple is "+ taste);
	}
}