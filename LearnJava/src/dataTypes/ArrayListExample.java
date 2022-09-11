package dataTypes;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[]) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(1001);
		array.add(1002);
		array.add(1003);
		array.add(1004);
		array.add(1005);
		
		for(int a : array) {
			System.out.println(a);
		}
		
		
		array.add(1006);
		
		/*
		 * some thousand lines of code 
		 */
		

		array.add(1007);
		
		System.out.println(array.size());
		
		for(int i = 0 ; i< array.size() ; i++ )
		{
			System.out.println(array.get(i));
		}
		
		//String[] arrayString = new String[50];
		
		ArrayList<String> arrayStr = new ArrayList<String>();
		arrayStr.add("Jency");
		
		
		
	}
}
