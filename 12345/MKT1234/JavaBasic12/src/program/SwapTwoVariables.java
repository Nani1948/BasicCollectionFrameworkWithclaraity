package program;
import java.util.Scanner;
//1. swap two numbers with and without using third variable
public class SwapTwoVariables {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int a=scan.nextInt();//10
		System.out.println("Enter the second number");
		int b=scan.nextInt();//20
		System.out.print(" Before Swapping:"+" a="+a+"b="+b); 
		System.out.println("After Swapping:");
		b=b+a; //10+20=30
		a=b-a;  //30-10=20
		b=b-a;  //30-20=10
		System.out.println(" a="+a+" "+","+ " b= " +b);
		// With temp variables
		System.out.println(" Before Swapping with third variable:"+" a="+a+"b="+b);
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println(" After Swapping with third variable:"+" a="+a+"b="+b);
	}

}
