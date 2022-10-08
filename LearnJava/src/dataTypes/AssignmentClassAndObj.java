package dataTypes;

public class AssignmentClassAndObj {

	public static void main(String args[]) {
		
		int[] marks = new int[3];
		marks[0] = 45;
		marks[1] = 90;
		marks[2] = 54;
		
		StudentNew student1 = new StudentNew("Vaidee",1001,12,994435583,marks );
		student1.studentDetails();
		student1.mark.CalculateResult();
		student1.printResult();
	}
}

class StudentNew {
	String Name;
	int RollNo, Standard; // 32 bit numbers -32625 to 32625
	long ParentsContactNo;
	Marks mark;

	StudentNew(String nam, int roll, int std, long contact, int[] marks) {
		Name = nam;
		RollNo = roll;
		Standard = std;
		ParentsContactNo = contact;
		mark = new Marks(marks); //received and throw the marks array to Marks class.
	}

	void studentDetails() {
		System.out
				.println("Name:" + Name + "\nRollNo:" + RollNo + "\nStd:" + Standard + "\nContact:" + ParentsContactNo);
	}

	void printResult() {
		// print results based on marks obtained
		if (mark.GetResult())
			System.out.println("Name:" + Name + " is Passed in the Exam");
		else
			System.out.println("Name:" + Name + " is Failed in the Exam");
	}

}


class Marks {
	int Eng, Tamil, Math;
	double TotalMarks;
	boolean Result = false;

	Marks(int[] marks) {
		Eng = marks[0];
		Tamil = marks[1];
		Math = marks[2];
	}

	void CalculateResult() {
		TotalMarks = Eng + Tamil + Math;
		if (Eng > 35 && Tamil > 35 && Math > 35)
			Result = true;
		else
			Result = false;
	}

	boolean GetResult() {
		return Result;
	}
}