package sample;

public class constru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
students s1= new students(20,"hanah");
students s2= new students(21,"harsh");
{
	s1. details();
	System.out.println(s2.rollno+s2.name);
}
	
	}

}

class students
{

	int rollno;
	String name;
	
	students(int rn,String na){
	
	
	rollno=rn;
	name=na;
		}
	
public void details()

{
	System.out.println(rollno+name);
}

}