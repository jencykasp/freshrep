package dataTypes;

public class ClassesAndObjects {

	public static void main(String args[]) {
		
		int a = 10; 
		
		Student stud1 = new Student();
		stud1.rollNo = 1001;
		stud1.name = "Jency";
		stud1.address = "Chennai";
		
		stud1.Studying();
		//int roolnuofStud1 = stud1.whatisyourRollNo();
		//System.out.println(roolnuofStud1);
		
		System.out.println(stud1.whatisyourRollNo());
		
		Student stud2 = new Student();
		stud2.rollNo = 1002;
		stud2.name = "Vaidee";
		stud2.address = "Vellore";
		
		stud2.Studying();
		
		
		//Array of objects 
		Student[] stud = new Student[10]; // 0 - 9
		for(int i = 0 ; i < stud.length; i ++ ) {
			stud[i] = new Student();
		}
		
		stud[0].rollNo = 1001; stud[0].name = "A";  stud[0].address = "Z";
		stud[1].rollNo = 1002; stud[1].name = "B";  stud[1].address = "Y";
		stud[2].rollNo = 1003; stud[2].name = "C";  stud[2].address = "X";
		
		stud[0].Studying();
		stud[1].Studying();
		stud[2].Studying();
		
		stud[9].Studying();
	}
	
}


class Student {
	
	int rollNo;
	String name;
	String address;
	
	public void Studying() {
		// int a =10;
		System.out.println("Hi, I'm "+name+": I'm studying");
	}
	
	public int whatisyourRollNo() {
		//
		//
		//
		//
		
		return rollNo;
		
	}
}





 