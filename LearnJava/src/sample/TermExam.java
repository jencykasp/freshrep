package sample;

public class TermExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student9 stud = new student9("Anu", 22, 44444444, "fifth", 80);
		stud.studentDetails();
		stud.printResult();

		Marks mar = new Marks(70, 80, 90);
		mar.results();
		mar.result=true;
		mar.CalculateResult();
		System.out.println(mar.getresult());
	}

}

class student9 {
	String name;
	int rollno;
	int parentscontactno;
	String standard;
	int marks;

	student9(String na, int roll, int con, String stand, int mark) {
		name = na;
		rollno = roll;
		parentscontactno = con;
		standard = stand;
		marks = mark;
	}

	void studentDetails() {
		System.out.println("Print student details:" + name + " "+ rollno +" "+ parentscontactno + " "+ standard);

	}

	void printResult() {
		if (marks > 50) {
			System.out.println("Pass");
		} else if (marks < 50) {
			System.out.println("fail");
		} else {
			System.out.println("good");
		}

	}
}

class Marks {
	int english;
	int tamil;
	int maths;
	boolean result;
	int res;
	double avg;
	int n=3;

	Marks(int eng, int tam, int mat) {
		english = eng;
		tamil = tam;
		maths = mat;

	}

	void results()

	{
		int res = english + tamil + maths;
		System.out.println("My Score" + res);

	}

	void CalculateResult() {
		avg = ((english + tamil + maths) / (float)n);
		System.out.println("My Average" + avg+"%");
	}

	boolean getresult() {
		return result;
	}

}
