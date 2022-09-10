package dataTypes;

public class ArrayCollection {

	public static void main(String args[]) {
	
		int a ;
		
		String name = new String("Hello");
		
		int[] RollNo = new int[30]; // index range from 0 - 29 -( 0 - N-1)

		RollNo[0] = 1001;
		RollNo[1] = 1002;
		RollNo[2] = 1003;
		RollNo[3] = 1004;
		RollNo[4] = 1005;
		RollNo[29] = 1030;
		
		//error
		//RollNo[30] = 1031;
		
		for(int i = 0; i < RollNo.length ; i++) {
			System.out.println("Old: " + RollNo[i]);
		}
	
		/*RollNo[-1] = 1000;
	
		for(int i = 0; i < RollNo.length ; i++) {
			System.out.println(RollNo[i]);
		}
		*/
		
		double[] salary = new double[50];
		for(int j = 0 ; j < salary.length ; j ++ ) {
			
			if(j==0) salary[j] =  10000;
			
			else salary[j] = salary[j-1]+ 10000.4 * 1.345;
			System.out.println("Old: " + salary[j]);
		}
		
		double[] oldSalary = salary.clone();
		
		for(int k = 0 ; k < oldSalary.length ; k ++ ) {
			
		System.out.println("At index : "+ k + ":" + oldSalary[k]);
		}
		
		for(double x : oldSalary) {
			System.out.println("New:" + x);
		}
		
		
	}
}
