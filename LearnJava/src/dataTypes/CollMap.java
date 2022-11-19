package dataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollMap {

	public static void main(String[] args) {
		
		// key value pair. like a dictionary
		
		HashMap<Integer, String> newMap = new HashMap<Integer,String>();
		newMap.put(1, "January");
		newMap.put(2, "February");
		newMap.put(3, "March");
		
		newMap.forEach(
				(a, b) ->  {

		      System.out.println(a + "=" + b);
		    });
		
		System.out.println(newMap.get(1));
		
		for(int key : newMap.keySet()) {
			
			System.out.println(newMap.get(key));
		}
		
		System.out.println(newMap);
		
		HashSet<String> s = new HashSet<String>();
		
		s.add("Honda");
		s.add("Bajaj");
		s.add("Hero");
		
		System.out.println(s.contains("Honda"));
		
		s.forEach((a) ->{
			System.out.println(a);
		});
		
		System.out.println(s);
		
		
	}

}
