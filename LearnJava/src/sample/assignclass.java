package sample;

public class assignclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[]marks=new int[3];
int mark1=50;
int mark2=60;
int mark3=70;
studnew studs= new studnew("anu","fifth",22,44555555,mark1,mark2,mark3);
	studs.mar.CalculateResult();
	studs.studentdetails();
	studs.printresult();
	}

}
class studnew
{
	String name,standard;
	int rollno;
	long contactno;
	Marksn mar;
	
	studnew(String na,String std,int rn,long con,int mark1,int mark2,int mark3)
	{
		name=na;
		standard=std;
		contactno=con;
		rollno=rn;
		mar=new Marksn(mark1,mark2,mark3);
	}

void studentdetails()
{
	System.out.println("name"+" "+name+"\nrollno"+" "+rollno+"\nstandard"+" "+standard+"\ncontactno"+" "+contactno);	
}
void printresult()
{
	if(mar.getresult())
	{
		System.out.println("name"+name+ "is passed");
	}
	else
	{
		System.out.println("name"+name+ "is failed");
	}
}

}





class Marksn
{
int eng,tamil,maths;
boolean result=false;
Marksn(int en,int tm,int mat)
{
eng=en;
tamil=tm;
maths=mat;
}
void CalculateResult()
{
	
if((eng>40 && tamil>40 && maths>40))
{
	result=true;
	
}
else
{
	result=false;
}
}
boolean getresult()
{
return result;	
}
}