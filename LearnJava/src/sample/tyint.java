package sample;

public class tyint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calci cal = new calci(4,5);
		calci cal1 = new calci(4,5,2);
		

	}

}

class calci {
	 calci(int a, int b) {
		System.out.println(a + b);
	}

	 calci(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}