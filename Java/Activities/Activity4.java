package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
	
		int numarray[]= {40,29,8,15,10,25};
		
		System.out.print("Original array:");
		System.out.println(Arrays.toString(numarray));
		
		Activity4 act = new Activity4();
		act.insertionSort(numarray);	
	
	}
	
  void insertionSort(int arr[]) {
		
		for (int i=1;i<arr.length;i++) {
			
			for(int j=i-1;j>=0;j--) {
			if(arr[j]>arr[j+1]) {
				int key = arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=key;
			}
			}	
		}
		System.out.print("Sorted array:  ");
		System.out.println(Arrays.toString(arr));
	}

}
