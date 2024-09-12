package arraydemo;
// Reverses the elements of the given array.
public class ReverseTotalArray {
	/*
	 * Method can be used to reverse the element in a given array.
     * 
     * 
     * 
     * @param array the array to be reversed
     * */

    public static void reverseTotalArray(int []arr) {
    	int start=0;
    	int end=arr.length-1;
    	while(start<end) {
    		//Swap element at the start and end
    		int temp=arr[start];
    		arr[start]=arr[end];
    		arr[end]=temp;
    		//Move toward the center.
    		start++;
    		end--;
    	}
    }
    
    /*
    * Method can be used to print the elements of the array.
    *
    * @param arr the array to be displayed
    */

        public static void displayArray(int []arr) {
    	System.out.print("Reverse Array:");
    	for(int num:arr) {
    		System.out.println(num);
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		ReverseTotalArray.reverseTotalArray(arr);
		ReverseTotalArray.displayArray(arr);
	}

}
