package sample;

public class arrnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]rollno= new int[30];
		
		rollno[0]=1000;
		rollno[1]=1001;
		rollno[29]=1002;
		System.out.println(rollno[0]);
	
	for(int i=0;i<rollno.length;i++)
	{
	if(i==0)rollno[0]=1000;
	else rollno[i]=rollno[i-1]+1000;
	System.out.println(rollno[i]);
	}
	
	int[]newrollno=rollno.clone();
	for(int j=0; j<newrollno.length;j++)
	{
		System.out.println("Atnindex:"+j+":"+newrollno[j]);
	}
	
	for(int j:newrollno)
	{
	System.out.println(j);	
	}
		
		
	}

}
