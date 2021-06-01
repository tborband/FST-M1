package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Papaya");
		hs.add("Watermelon");
		System.out.println("Size of Hash Set:" +hs.size());
		System.out.println("Has set has " +hs);
		hs.remove("Orange");
		//hs.remove("Water");
		if(hs.remove("Water")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Water is not present in the Set");
        }
		System.out.println("Is Papaya present in Set:" +hs.contains("Papaya"));
		System.out.println("Updated has set has " +hs);
	}

}
