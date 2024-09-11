package ScannerClassExample1;

import java.util.Scanner;

public class ExceptionMismatchOFScanner {
	static void wholeNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of a :");
		 int a=scan.nextInt();
		 System.out.println("Enter the value of b:");
		 int b=scan.nextInt();
		System.out.println("The Sum of a and b :"+(a/b));
		

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
	void printTheA() {
		int a =10;
		System.out.println(a);
	}
 
	public static void main(String[] args) {
		decimalNumber();
		wholeNumber();
}
}