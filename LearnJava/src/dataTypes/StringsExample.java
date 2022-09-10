package dataTypes;

public class StringsExample {

	public static void main(String args[]) {
	
		//String using Assignment operator
		String name = "Vaideeshwaran";  //int a = 10;
		
		String Address = "b/24, rose garden apart, flower street, chennai. pincode - 600125";
		int age = 35;
		double sal = 50000.05;
		char c1 = 'V';
		char c2 = 'V';
		
		//String object creation with new value. 
		String name2 = new String("vaideeshWAran");
		
		System.out.println(Address.length());
		
		System.out.println(name.concat(Address));
		
		// returns int. differnce will show in negative for not matching characters
		System.out.println("Compare: " + "-"+ name.compareToIgnoreCase(name2));
		
		//returns boolean (true if matches)
		System.out.println("Equals: "+ name.equalsIgnoreCase(name2) );
		
		//comparison operator. result will be in boolean. comparing two string objects
		System.out.println("Comaprison operator: " + name == name2);
		
		
		// string contains
		System.out.println(Address.contains("chennai"));
		
		//string - sub string
		System.out.println(Address.substring(41));
		
		//join
		System.out.println(String.join("-----*****----", name,name2 ,Address));
		
		//split
		String[] address = Address.split(",");
		System.out.println(address[1]);
		
		
		//split 
		String values = "hello world - this is vaidee - how are you? - delimeter used here is hypeen"; 
		String[] Values = values.split("-");
		for(String item : Values) {
					System.out.println(item);
				}
		
		//replace - replace all
		System.out.println(values.replaceAll("world -", "/"));
		
		//find character at location
		System.out.println(values.charAt(12));
		
		// find the index of specific character
		System.out.println(values.lastIndexOf('-'));
		
		
		String messeduptext = "     sdfsfdfsd HELLO      ";
		System.out.println(messeduptext.trim());
		System.out.println(messeduptext.trim().toUpperCase());
		System.out.println(messeduptext.trim().toLowerCase());
		
		
		// isEmpty lenght should be 0 
		//isBlank neglect the white space and check lenght is 0
		String s1 = "    ";
		String s2 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
	}
}
