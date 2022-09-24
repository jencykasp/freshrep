package dataTypes;

public class InheritanceTwo {

	public static void main(String args[]) {
		
		TataNexon VaideeCar = new TataNexon();
		VaideeCar.maxSpeed = 60;
		VaideeCar.Honk();
		VaideeCar.color = "Red";
		VaideeCar.CarryLuggage();
		VaideeCar.Safetyrating = "5Star";
		VaideeCar.LongTravel();
	}
}



class Vehicle
{
	int maxSpeed ;
	
	void Honk() {
		System.out.println(" Honking Vehicle at "+ maxSpeed);
	}
}

class Car  extends Vehicle 
{
	
	String color;
	
	void CarryLuggage() {
		System.out.println(color+" car Wheels on the go ! ");
	}
	
}


class TataNexon extends Car
{
	String Safetyrating;
	
	void LongTravel() {
		System.out.println(Safetyrating +" Going on Highway! ");
	}
}


///Final KeyWord Example
//Electronic Device - Media Equipment - Videograph - DSLRCamera

final class DSLRCamera {
	
	String intensity;
	double focalLength;
	double ISO;
	double LensFocalLengthRange;
	
	void clickPics() {
		//
	}
	void FreezeVideoMoment() {
		//
	}
	void shootvideo() {
		
	}
}

class camera extends DSLRCamera
{
	@Override
	void shootvideo() {
		
	}
}