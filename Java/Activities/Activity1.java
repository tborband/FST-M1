package activities;

public class Activity1 {

	public static void main(String[] args) {
	

		Car car1=new Car();
		car1.color="Black";
		car1.make = 2014;
		car1.transmission = "Manual";
		
		car1.displayCharacteristics();
		car1.accelarate();
		car1.brake();
	}

}
