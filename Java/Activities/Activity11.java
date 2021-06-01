package activities;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "White");
		map.put(2, "Red");
		map.put(3, "Pink");
		map.put(4, "Blue");
		map.put(5, "Green");
		
		System.out.println("Map has : " +map);
		map.remove(3);
		System.out.println("Object [3, Pink] is removed");
		System.out.println("Is Green color present in Map : " +map.containsValue("Green"));
		System.out.println("Size of Map:"+map.size());
		System.out.println("Updated Map has : " +map);
		
		/*Random r = new Random();
		System.out.println(r.nextInt(10));
		System.out.println(r.nextInt(10)); */
	}

}
