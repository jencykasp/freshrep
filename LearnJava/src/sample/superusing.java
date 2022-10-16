package sample;

public class superusing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
curtain cur= new curtain("blue","floral");
	cur.decor();
	cur.hideslight();
	}

}

class cloth {
	private String design;

	cloth(String des) {
		design = des;
	}

	void decor() {
		System.out.println("It decor room" + design);
	}
}

class curtain extends cloth {
String color;
curtain(String col,String des)
{
super(des);
color=col;
}
void hideslight()
{
System.out.println("It hides light"+color);	
}
}