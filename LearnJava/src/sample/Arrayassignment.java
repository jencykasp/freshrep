package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[]array = new double[30]; 
//output is 3
int [ ] fun = new int [6]; //0 - n-1
fun[0] = 1;
fun[1] = 2;
fun[2] = 3;
fun[3] = 4;
fun[4] = 5;
fun[5] = 6;
String average;

/*String val="6";
final int totsal=100;
char c='a';

System.out.println(1+c);
String name=(Integer.toString(totsal)+Integer.toString(c));
System.out.println(name+5);
System.out.println(Integer.parseInt(val)+5);*/
int sumFun =0 ;
for(int i = 0 ; i< fun.length;i++) {
	sumFun+=fun[i];
}
float res = sumFun/fun.length;
System.out.println("average: "+res);	


int []copyfun = fun;

    for(int j=0;j<copyfun.length;j++ )
	{
    	
    	System.out.println(copyfun[j]);
	
	}
	
    ArrayList<Integer> fun1= new ArrayList<Integer>(fun.length);
	
	for(int store:fun)
    {
	fun1.add(store); // copy fun to fun1
	}
	
	for (int item:fun1)
	{
		System.out.println(item); // retrieving value from fun1
	}
	for(int i = 0 ; i < fun1.size() ; i++ ) {
		System.out.println(fun1.get(i));
	}
String values= "HAPPY PROGRAMMING";
String[] Values =values.split("A");
for(String item:Values)
{
	System.out.println(item);
}
 
values = values.replaceAll("A", "B");
System.out.println(values);


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
	// int resInt = Integer.reverse(i);
	
int y=10;

while(y==10)
{
	int sum=0;
	sum=(y*(y+1))/2;
	System.out.println("First 10 natural numbers:" + sum);
y++;

} //wrong ! 

int naturalnum = 1;
int sumOfNatNum = 0;
while(naturalnum <=10 ) {
	sumOfNatNum+= naturalnum;
	naturalnum++;
}
System.out.println("Sum of First 10 Natural numbers:"+sumOfNatNum);
}
	
}
	
	
