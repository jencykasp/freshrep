package dataTypes;

public class ConstructorInClass {
	 public static void main(String args[]) {
		
		 Students stud1 = new Students(1001,"Vaidee","Chennai",75.99);
		 Students stud2 = new Students(1002,"Jency","Chennai",85.01);
		 stud1.details();
		System.out.println(stud2.name+stud2.rollNo);
	 }
}



class Students {
	int rollNo;
	String name;
	String address;
	double TotalMarks;
	
	Students(int rn, String name1 , String add , double marks){
		rollNo = rn;
		name =name1;
		address = add;
		TotalMarks = marks;
	}
	
	public void details() {
		System.out.println(rollNo + name + address + TotalMarks);
	}
}

