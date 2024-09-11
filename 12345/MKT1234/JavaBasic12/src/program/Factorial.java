package program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Factorial!: ");
		int n=scan.nextInt();
		 int factorial = fact(n);
	      System.out.println("Factorial of entered number is: "+factorial);
	}
       static int fact(int n) {
    	   int output;
    	   if(n==1) {
    		   return 1;
    	   }
    	   //Recursion:Function calling itself
    	   output=fact(n-1)*n;
    	   return output;
          
       }
	}

