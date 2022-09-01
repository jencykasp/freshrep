package sample;

public class Assignment1 {

	public static void main(String args[]) {
	
		int a=5;
		double b=5.01;
		char c='a';
		char d='h';
		char e='H';
		final int sal= 1000;
		double i=100.235;
		int j=(int)100.235;
		int k=99;
		double l=99.9999;
		String s="54321";	
		int X=10;
		int t1=5;
		int t2=4;
		int t4=7;
			
		int z=X+5;
	    X+=5;
	    t1-=2;
	    t2*=3;
	    t4/=7;
	   
	   
		
	String t="1000";
	//System.out.println(Integer.parseInt(t));
	int y=(Integer.parseInt(t));
	
	System.out.println(t.equals(y));
	
		/*int sal=2000;
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Duplicate local variable sal

			at sample.Assignment1.main(Assignment1.java:9)*/
	    
	    /* datatype of '3' is char
	     * datatype of "123.00" is string
	     * 
	     */
		
	   /* Which declaration will throw an error?
	    		double num = 8; - (Error because its a integer)
	    		int averageGrade = 89.7; (Error because its a float value)
	    		boolean done = false; -correct
	    		String done = "true"; - correct */
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(Integer.toString(d));
		System.out.println(Integer.toString(e));
		System.out.println(j);
		System.out.println(k+l);
		int n=Integer.parseInt(s)+12345;
		System.out.println(z);
		System.out.println(X);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t4);
		//System.out.println(n);
		//System.out.println(u);
		//System.out.println(t.equals(u));
		//boolean v= t.equals(u);
		//System.out.println(t.equals(t1));
	}
	
	}
	

