package activities;

public class Activity3 {

	public static void main(String[] args) {
		 
			double seconds = 1000000000;

	        double EarthSeconds = 31557600;
	        double MercurySeconds = 0.2408467*31557600;
	        double VenusSeconds = 0.61519726*31557600;
	        double MarsSeconds = 1.8808158*31557600;
	        double JupiterSeconds = 11.862615*31557600;
	        double SaturnSeconds = 29.447498*31557600;
	        double UranusSeconds = 84.016846*31557600;
	        double NeptuneSeconds = 164.79132*31557600;
	        
	        System.out.println("Age on Mercury: " + seconds /MercurySeconds);
	        System.out.println("Age on Venus: " + seconds /VenusSeconds);
	        System.out.println("Age on Earth: " + seconds / EarthSeconds);
	        System.out.println("Age on Mars: " + seconds /MarsSeconds);
	        System.out.println("Age on Jupiter: " + seconds /JupiterSeconds);
	        System.out.println("Age on Saturn: " + seconds /SaturnSeconds);
	        System.out.println("Age on Uranus: " + seconds /UranusSeconds);
	        System.out.println("Age on Neptune: " + seconds /NeptuneSeconds);

	}

}
