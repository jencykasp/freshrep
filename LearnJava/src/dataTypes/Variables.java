package dataTypes;

public class Variables {

	public static void main(String args[]) {
		
		/*
		String Name = ""; // there is diff in "" and null
		 
		
		String Specialchar = "ABCDE abcde 1234567 \\ \" \n \t \b !@#$%^&*()"; 
		
		
		System.out.println(Specialchar);
		*/
	
		/*
		int a,b;
		a = b = 10;
		a = a + 10 ;
		
		System.out.println(a + b);
		 */
		/*
		int a = 10; 
		double dec = 10.0000000005;
		String name = "Jency";
		System.out.println(dec + a + name);
		
		String name = "hello sdfkjsndg lkjmsd lkansdlkmas alskmd alaksd lksdmdasl kmms dflkkdslk  okjasklfj s flksjdfsldk j";
		int a = 1; 
		char a1 = 'a';
		System.out.println(name);
		
		*/
		
		
		final int totalSalary = 10000; // constant
		
		// Identifier is about naming a variable. It should have a meaningful name to use in later part of program
		//System.out.println(totalSalary);
		
		/*
		int x = 10;
		double y = 12.5;
		
		double z = x;
		System.out.println(x);
		System.out.println(z);
		
		*/
		
		//Type Casting
		
		char c = 'a';
		String value = "12345";
		String name = Integer.toString(totalSalary)+ c;
		System.out.println(5 + totalSalary);
		System.out.println(5  + name);
		
		System.out.println(value  + 100);
		System.out.println(Integer.parseInt(value)+100);
		
		
		boolean result ;
		result = false;
		System.out.println(result);
		
	}

}
