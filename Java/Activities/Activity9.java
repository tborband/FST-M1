package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("Tejas");
		myList.add("Amrutha");
		myList.add("Vinay");
		myList.add("Nitin");
		
		myList.add(4, "Santanu");
		
		System.out.println("ArraList: ");
		for(int i=0 ; i<myList.size();i++) {
			System.out.println(" "+myList.get(i));
		}
		
		System.out.println("Size of ArraList: " +myList.size());
		System.out.println("Is Vinay in the list: " +myList.contains("Vinay"));
		System.out.println("Removed 3rd element ArraList: " +(myList.get(2)));
		myList.remove(2);
		myList.remove("Santanu");
		
		System.out.println("Updated Size of ArraList: " +myList.size());
		System.out.println("Updated ArraList: ");
		for (String s : myList)
			System.out.println(" "+s);
	}

}
