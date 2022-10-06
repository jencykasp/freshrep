package sample;
import java.util.ArrayList;
public class objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student stud1=new student();
stud1.rollno=1;
stud1.name="anu";
stud1.address="chennai";
stud1.studying();
System.out.println(stud1.getrollno());
	
student[] array=new student[10];
for(int i=0;i<array.length;i++)
	
{
	
	array[i]= new student();

}
array[0].name="honey";
array[0].rollno=100;
array[0].address="honey1";
array[0].studying();
//array[0].getrollno();
System.out.println(array[0].getrollno());
System.out.println(array[0].name);
//System.out.println(array[0].studying());

	
ArrayList<student> studs = new ArrayList<student>();

studs.add(new student());
	studs.get(0).name="Hi";
	studs.get(0).rollno=21;
	studs.get(0).address="chennai";
	studs.get(0).studying();
	System.out.println(studs.get(0).getrollno());
	}

	
	
		 
}
class student
{
int rollno;
String name;
String address;
public void studying()
{
	System.out.println("Hi, I'm "+name+": "+address+" + I'm studying");
	
}

public int getrollno()	

{
	
	//System.out.println("My rollno" );
	return rollno;
	
	
}
	
}