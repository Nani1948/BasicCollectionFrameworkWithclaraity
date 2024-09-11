package ScannerClassExample1;

import java.util.Scanner;

public class ScannerClassForALLDataTypes {
	
	public void wholeNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of a :");
		 int a=scan.nextInt();
		 System.out.println("Enter the value of b:");
		 int b=scan.nextInt();
		System.out.println("The Sum of a and b :"+(a+b));
		
		System.out.println("Enter the value of s :");
		 short s=scan.nextShort();
		 System.out.println("Enter the value of l:");
		 long l=scan.nextLong();
		System.out.println("The Sum of a and b :"+(s*l));
	}
    
	static void decimalNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of c:");
		 double c=scan.nextDouble();
		 System.out.println("Enter the value of d:");
		 float d =scan.nextFloat();
		System.out.println("The multiply of a and b :"+(c*d));
	}
	
	static boolean value() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of n :");
		 int n=scan.nextInt();
		if(n<=10) {
		return true;
		}
		else {
		return false;
		}
	}
	
	public void character() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the char");
		char c=scan.next().charAt(0);
		System.out.println("Enter the String");
		String s=scan.next();
		
		
	}
	
	public static void main(String[] args) {
	value();
	decimalNumber();
	 ScannerClassForALLDataTypes sc=new ScannerClassForALLDataTypes();
	sc.character();
	sc.wholeNumber(); 

	}

}
