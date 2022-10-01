package sample;
import java.util.ArrayList;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array= new ArrayList<Integer>();
	array.add(100);
	array.add(200);
	
	for(int i=0; i<array.size(); i++)
	{
		System.out.println(array.get(i));
		
	}
	System.out.println(array.size());
	}

}
