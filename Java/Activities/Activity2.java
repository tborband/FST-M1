package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
       int array1[] = {10, 77, 10, 54, -11, 10};
       int sum=0;
       
       System.out.println("Array elements are:" +Arrays.toString(array1));
       
       for(int i=0; i< array1.length; i++){
    	   if(array1[i]==10) {
    		    sum = sum + array1[i];
    	   }
    	   
       }
       
       try {
       if(sum == 30) {
    	   System.out.println("Sum of all 10's in array is 30");
       }
       else
    	   System.out.println("Sum of all 10's in array is NOT 30");
        array1[10]=10;
           
        
        
       }
       
      
       catch(Exception e) {
    	System.out.println("Exception");
    	   
       }
       System.out.println("After Exception");
	}

}
