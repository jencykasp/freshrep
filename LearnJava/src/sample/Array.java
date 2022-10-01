package sample;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] Rollno = new double[30];
Rollno[0]=100;
Rollno[1]=200;
Rollno[3]=300;
Rollno[4]=400;
Rollno[29]=500;
for(int i=0; i< Rollno.length; i++)
{
	System.out.println("Location:"+ i +":"+ "oldsal:"+ Rollno[i]);
}
/*for (double item: Rollno)
{
	System.out.println(item);
}*/
double[]NewRolno= Rollno.clone();
for(int k=0; k<NewRolno.length; k++)
{
	System.out.println( NewRolno[k]);
}

double[] Rollno1 = new double[30];
for(int j=29; j>0 ;j-- )
{
	if(j==29)Rollno1[j]=10000;
		
		else Rollno1[j]= Rollno1[j+1]+1000;	
		
      System.out.println(Rollno1[j]);
}

double[] salary1 = new double[30];
for(int x = 0 ; x < salary1.length ; x ++ ) {
	
	if(x==0) salary1[x] =  10000;
	
	else salary1[x] = salary1[x-1]+ 10000;
	System.out.println(salary1[x]);
}






}

}




