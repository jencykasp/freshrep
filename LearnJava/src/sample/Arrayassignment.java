package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[]array = new double[30]; 
//output is 3
int [ ] fun = new int [5];
fun[0] = 1;
fun[1] = 2;
fun[2] = 3;
fun[3] = 4;
fun[4] = 5;	
String average;

/*String val="6";
final int totsal=100;
char c='a';

System.out.println(1+c);
String name=(Integer.toString(totsal)+Integer.toString(c));
System.out.println(name+5);
System.out.println(Integer.parseInt(val)+5);*/

System.out.println("average: "+(fun[0]+fun[1]+fun[2]+fun[3]+fun[4])/5);	


int []copyfun = fun;

    for(int j=0;j<copyfun.length;j++ )
	{
    	
    	System.out.println(copyfun[j]);
	
	}
	
    ArrayList<Integer>fun1= new ArrayList<Integer>(fun.length);
	
	for(int store:fun)
    {
	//fun1.add(store);
	System.out.println(store);
		
	}
String values= "HAPPY PROGRAMMING";
String[] Values =values.split("A");
for(String item:Values)
{
	System.out.println(item);
}
char ch='a';
String str=Character.toString(ch);
System.out.println("String: "+str);
	
String str1="Hello";
for(int i=0;i<str1.length();i++)
{
char ch1= str1.charAt(i);
System.out.println("Char: "+ch1);


}

int[] arr= {10,-4,7,8,-3,90,4,-23,6};

for(int i=0; i<arr.length;i++)
{
	if(arr[i]>0)
		{
		System.out.println("value: positive"+arr[i]);
		}

else 
{
	System.out.println("value: negative"+arr[i]); 
	

}
	}
	int i=12345;
	
	while(i!=0)
	{
		int n=i%10;
	 int	reverse=0*10+n;
		
	System.out.println(n);
		
	 i=i/10;	
	
 	}
int y=10;
int sum=0;
while(y==10)
{
	sum=(y*(y+1))/2;
	System.out.println("First 10 natural numbers:" + sum);
y++;

}


}
	
}
	
	
