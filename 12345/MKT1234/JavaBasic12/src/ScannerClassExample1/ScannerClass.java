package ScannerClassExample1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
	   System.out.println("Enter the numbers");
	   // Addition
	   Scanner scan=new Scanner(System.in);
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   System.out.println(a+b);
	   //Subtraction
	   //double d =scan.nextDouble();
	   //float c=scan.nextFloat();
	   System.out.println(a+b);
        // Mutilplication
	  // short s =scan.nextShort();
	 // long l =scan.nextLong();
	   System.out.println(a*b);
	  
	  // Division
	  
	 // byte by=scan.nextByte();
	 // int it=scan.nextInt();
	  System.out.println(a/b);
	}

}
