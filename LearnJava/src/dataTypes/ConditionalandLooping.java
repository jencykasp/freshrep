package dataTypes;

public class ConditionalandLooping {

	public static void main(String args[]) {
	
		/*
	int a = 10;
	int b = 20;
	
	
	// if - condition 
	if (a == 10 ) {
		System.out.println( " a equal to 10");
		}
	
	
	//if - else
	if(a > 10) {
		System.out.println(" a is greater than 10 ");
	} else {
		System.out.println(" a is not greater than 10 ");
	}
	
	//if - else - if
	if(a > b) {
		System.out.println(" a is greater than b ");
	} else if (a==b) {
		System.out.println(" a is equal to b ");
	} else {
		System.out.println(" a is lesser than b "); 
	}
	
	
	//ternary operation
	String result = (a==10) ? "a is equal to 10" : " a is not equal to 10";
	System.out.println(result);
	 
	
	
	//Looping 
	//for( declaration ; condition ; incr/decr ) {   }
	
	for(int x = 0 ; x < 10 ; x++ ) {
		System.out.println(x);
	}
	
	
	for(int x = 10 ; x > 0 ; x-- ) {
		System.out.println(x);
	}
	
	
	//break
	for(int x = 10 ; x > 0 ; x-- ) {
		
		if(x==4) { 
			break;
		}
		System.out.println(x);
	}
	
	
	//continue
	for(int x = 10 ; x > 0 ; x-- ) {
		
		if(x==4) { 
			continue;
		}
		System.out.println(x);
	}
	
	//for iteration loop for range of values
	String[] arrayValue = {"11","22","33","44","55","66","77","88","99"};
	for(String var :arrayValue) {
		System.out.println(var);
	}
	
	
	int abc = 10; 
	//While Loop breaks on break;
	while(abc > 0) {
		
		if(abc==4) {
			abc--;
			break;
		}
		
		System.out.println(abc);
		
		abc--;
	}
	
	abc = 10; 
	while(abc > 0) {
		
		System.out.println(abc);
		
		abc-= 2;
	}
	
	*/
		
	//if-else in while loop
		
	int xyz = 100; 
	while (xyz >= 0) {
		
		if(xyz%2 == 0) {
			System.out.println(xyz);
		}
				
		/*
		if(xyz % 2 == 1) {
			System.out.println(xyz +" is ODD" );
		} else {
			System.out.println(xyz + " is Even");
		}
		*/
		xyz-=1;
	}
	
	}
}
