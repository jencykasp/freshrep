package sample;

public class implementinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hibiscus hib = new hibiscus();
		hib.useherb();
		hib.color = "red";
		System.out.println(hib.color);

		Aloe vera = new Aloe();
		vera.useherb();
	}

}

class flower3 {
	String color;

	void smell() {
		System.out.println("Nice Fragrant");
	}

}

interface herb {
	void useherb();
}

class hibiscus extends flower3 implements herb {
	public void useherb() 
	{
		System.out.println("good for hair");
	}

}

class Aloe implements herb {
	public void useherb() 
	{
		System.out.println("good for skin");
	}
}