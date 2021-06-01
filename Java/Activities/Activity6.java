package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	Plane(int max_pass){
		this.maxPassengers =max_pass;
		this.passengers = new ArrayList<>();
		System.out.println(maxPassengers);
	}
	
	void onboard(String p) {
		passengers.add(p);
	}
	
	Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	void land() {
		this.lastTimeLanded = new Date();
		passengers.clear();	
	}
	Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	List<String> getPassesngers() {
		return passengers;
	}
}


public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		plane.onboard("Tejas");
		plane.onboard("Nitin");
		plane.onboard("Vinay");
		System.out.println("Take Off time :" +plane.takeOff());
		System.out.println("Passengers:" + plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Landed time:" +plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
	}

}
