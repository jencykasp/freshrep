package dataTypes;

public class Operators {
	public static void main(String args[]) {
		
		// Arthmetic + - * / 
		
		int a = 10; 
		int b = 30;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a % b);
		
		// Assignment = , += , -=
		a = b = 10;
		
		a += 1 ; //a = a + 1; 
		b -= 2;
		int c = a *= 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// Comparison == ,  > , < , >= , <= != // boolean
		a = b = 10;
		System.out.println(a==b);
		
		a+=10;
		
		System.out.println(a>=b);
		
		// Logical & |
		
		a = 1;
		b = 2;
		c = a | b;
		
		System.out.println(c);
	}
	

}
