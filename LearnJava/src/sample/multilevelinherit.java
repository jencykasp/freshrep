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
	app.place();
	}

}

class fruit {
	String size="small";
	/*int Siz = Integer.parseInt(size);

	public int getsize() {
		System.out.println("size" + "small");
		return Siz;
	}*/
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

	void place() {
		System.out.println("It grows in hill");

	}
}