package activities;

public class Car {

	String color;
	String transmission;
	int make;
	int doors;
	int tyres;
	
	Car() {
		doors=4;
		tyres=4;
	}
	
	void displayCharacteristics() {
		//System.out.println("Characteristics of Car:" +color +" " +make +" " +doors +" " +tyres +" " +transmission);
		System.out.println("Color of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("Number of doors on the car: " + doors);
	    System.out.println("Number of tyres on the car: " + tyres);
	}
	
	void accelarate() {
		System.out.println("Car is moving forward.");
	}
	void brake() {
		System.out.println("Car has stopped.");
	}
}
