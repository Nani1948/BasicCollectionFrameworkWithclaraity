package datatypes;

import java.util.Scanner;

public class ConvertFromOneDataTypeToAnotherDataType {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the float number");
	// Widening Casting: it can be done by manually and automatically
		//  byte -> short -> char -> int -> long -> float -> double  
	float a=scan.nextFloat();
	double d =a;
	System.out.println("Double Number:"+d);
	System.out.print("Integer Number:");
	int b=scan.nextInt();
	long l=b;
	System.out.println("Long Number:"+b);
	
	// Narrow Casting: double -> float -> long -> int -> char -> short -> byte  
	//Converting a higher data type into a lower one is called narrowing type casting. 
	//It is also known as explicit conversion or casting up. It is done manually by the programmer. 
	//If we do not perform casting then the compiler reports a compile-time error.
	
	//Convert to double to float
	System.out.print("Enter the double number:");
	double c=scan.nextDouble();
	float fl=(float)b;
	System.out.println("Float Number:"+fl);
	
	
	// convert long to int
	System.out.print("Enter the long number:");
	long e=scan.nextLong();
	int i1 =(int)e;
	System.out.println("int  Number:"+i1);
	}

}
