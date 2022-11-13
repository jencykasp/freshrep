package dataTypes;

public class SwitchCase {

	public static void main(String[] args) throws Exception {
		
		String a = "hello";
		
		
		int x = 1;
		int y = 0;
		
		
		try 
		{
			System.out.println( x / y);
		} 
		catch (Exception obj) 
		{
			System.out.println(obj.getMessage());
			System.out.println("Any value divided by zero is Error. Becasuse value of y is"+ y);
		}
		
		
		switch(x) {
		
		case 12:
			System.out.println("It is 12");
			break;
			
		case 10:
			System.out.println("It is 10");
			break;
		
		default:
			throw new Exception("Case not matched");
		}
		
		
		
		// Exception handling
		

	}



}
