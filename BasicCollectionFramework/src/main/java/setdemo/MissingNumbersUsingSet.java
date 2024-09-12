package setdemo;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbersUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 5, 7, 9}; 
		 int max=Integer.MAX_VALUE;
		 int min=Integer.MIN_VALUE;
		 for(int num:arr) {
			 if(num>max) {
				 max=num;
			 }
			 if(num<min) {
				 min=num;
			 }
		 }
		  // Create a HashSet to track the presence of numbers
	        Set<Integer> set = new HashSet<>();
	        // Add all elements of the array to the HashSet
	        for (int num : arr) {
	            set.add(num);
	        }
	     // Iterate through the range from min to max and check for missing numbers
	        System.out.print("Missing numbers: ");
	        for (int i = min; i <= max; i++) {
	            if (!set.contains(i)) {
	                System.out.print(i + " ");
	            }
	        }
		 
	}

}
