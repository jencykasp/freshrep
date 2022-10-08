package sample;

public class Inheritfixerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y obj = new Y(3);

		System.out.println(obj);
	}

}

class X {
	int inte;

	public X(int i) {
		inte = i;
		System.out.println(inte);
	}
}

class Y extends X {
	public Y(int i) {
		super(i);
		System.out.println(2);
	}
}
