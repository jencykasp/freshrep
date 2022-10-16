package sample;

public class polyconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		curtain1 cur1 = new curtain1("blue", "floral");
		cur1.decor();
		cur1.decor("glitter");
		cur1.hideslight();
		curtain1 cur2 = new curtain1("stripe");
		cur2.decor();
		cur2.hideslight();
		curtain1 cur3 = new curtain1("grey","stripe");
		cur3.decor();
	cloth1 clo=new cloth1("dot");
	clo.decor();
/*	curtain1 cur4 = new curtain1("thick","blue","stripe");
	cur4.densuty();*/
	
	}

}

class cloth1 {
	String design;
	String dense;

	cloth1(String des) {
		design = des;
	}

	void decor() {
		System.out.println("It decor room" + design);
	}
	void decor(String mattype)
	{
		System.out.println("It decor room" + mattype);	
	}
	}


class curtain1 extends cloth1 {
	String color;
//String dense;
	curtain1(String col, String des) {
		super(des);
		color = col;
	}

	curtain1(String des) 
	{
		super(des);
	}
	/*curtain1(String den,String col, String desi)
	{
		design=desi;
		
		dense=den;	
	
	color = col;
	}*/
	/*curtain1(String den,String col, String des)
	{
		super(des);
		dense=den;	
		color = col;
	}
	void densuty()
	{
		System.out.println("It dense" + dense);	
	}*/
	
	void decor() {
		System.out.println("It decor room" + design+color);
	}
	void hideslight() {
		if (color != null)
			System.out.println("It hides light" + color);
		else
			System.out.println("It hides light not defined");

	}
}