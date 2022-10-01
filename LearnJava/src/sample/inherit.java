package sample;

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog pup=new dog();
pup.colour="brown";
pup.hydrophobia=false;
pup.speed=20;
pup.bark();
pup.play();
pup.intro();

cat kit= new cat();
kit.colour="grey";
kit.speed=30;
kit.fluffy=true;
kit.scratch();
kit.catchball();
kit.eat();
kit.intro();
System.out.println(kit.colour);

	
	
	}

}

class cat extends animal
{
	boolean fluffy;
	
	void scratch()
	{
	System.out.println("scratching");	
	}
	void catchball()
	{
		System.out.println("will catch ball");		
	}
}


class dog extends animal
{
	boolean hydrophobia;
	
	void bark()
	{
	System.out.println("barking");	
	}
	void play()
	{
		System.out.println("playing");		
	}
}
class animal{
	String colour;
	int speed;
	
	public void eat()
	
	{
		System.out.println("i'm eating");
	
	}
	public int maxspeed()
	{
		return speed;
	}
	
	public void intro()
	{
		System.out.println(colour+speed);
		System.out.println("I'm "+colour+" in colour"  );
	}
}