package sample;

import java.util.ArrayList;
public class objects1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student6 stud =new student6();
stud.studying();
student6[]array=new student6[10];
for(int i=0;i<array.length;i++)

{
array[i]=new student6();	
}
	
array[0].rollno=21;
array[0].name="hi";
array[0].Address="hello";
System.out.println(array[0].getrollno());
ArrayList<student6> array1=new ArrayList<student6>();
//studs.add(new student());
array1.add(new student6());
	array1.get(0).name="hir";
	array1.get(0).rollno=22;
	array1.get(0).Address="ytt";
	System.out.println(array1.get(0).name);
	}

}
class student6
{
int rollno;
String name;
String Address;

void studying()
{
	System.out.println("I'm studying");
}
public int getrollno()
{
return rollno;	
}

}