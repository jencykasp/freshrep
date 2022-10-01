package sample;

public class constu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
students s1= new students(20,"hi");
students s2= new students(22,"hii");
s1.rollno=20;
s1.name="hi";
s1.details();
System.out.println(s2.rollno+s2.name);
	}

}
class students
{
int rollno;
String name;
students(int rn, String na)
{
rollno=rn;
name=na;
}
void details()

{
System.out.println(rollno+name);	
}
}