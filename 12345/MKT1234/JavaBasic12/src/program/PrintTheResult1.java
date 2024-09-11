package program;
import java.util.Scanner;

public class PrintTheResult1 {
	
	
		
	public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the decimal :");
   int  num=scan.nextInt();
  // System.out.println(" " +Integer.toBinaryString(num));
   
   //or
  // System.out.println(" Binary number is " + Integer.toString(num, 2));
   
   //or 
   
// array to store binary number
		int arr[]=new int[10];
		//counter for binary array
		int i=0;
		 while(num>0) {
			 // storing remainder in binary array 
			arr[i]=num%2;
			i++;
			num=num/2;
		 }
		
		
		// printing binary array in reverse order
	 
	 System.out.print(" Binary Number is:");
	 for(int j=i-1;j>=0;j--) {
		 System.out.print(arr[j]);
	 }
	 
    		  
	 }
	 
	}


