package activities;

interface BicycleParts{
	public int gears=0;
	public int currentSpeed  = 0;	
}

interface BicycleOperations{
	
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
	public int gears;
	public int currentSpeed;
	
	Bicycle(int gears , int currentSpeed)
	{
	    this.gears= gears;
		this.currentSpeed= currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		currentSpeed-= decrement;
	}
	public void speedUp(int increment) {
		currentSpeed+= increment;
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
}

class MountainBike extends Bicycle{
	
	public int seatHeight;
	MountainBike(int gears1, int speed , int ht)
	{
		super(gears1 ,speed);
		//gears = gears1;
		//currentSpeed = speed;
		seatHeight = ht;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

public class Activity7 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
	    System.out.println("Initial attributes: ------------\n"+mb.bicycleDesc());
	    mb.speedUp(20);
	    System.out.println("Speed up by 20: -----------------\n"+mb.bicycleDesc());
	    mb.setHeight(20);
	    mb.applyBrake(5);
	    System.out.println("Break(speed down by 5) and height change to 20: ---------\n"+mb.bicycleDesc());

	}

}