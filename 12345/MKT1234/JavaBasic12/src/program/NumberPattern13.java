package program;
import java.util.Scanner;

//Write a java program to read size n from user and to print the following pattern 1 3 5 7 9 ���. 


public class NumberPattern13 {
	static void getTheFollowingPattern() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
	   int  num=scan.nextInt();
	   int i=1;
	  while(i<=num) {
		System.out.println(i);
		i=i+2;
	   }
	}
	
	public static void main(String []args) {
		getTheFollowingPattern();
	}

}
