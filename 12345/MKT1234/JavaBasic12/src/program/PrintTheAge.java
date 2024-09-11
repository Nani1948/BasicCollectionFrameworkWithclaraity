package program;

import java.util.Scanner;

public class PrintTheAge {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age:");
		int age= sc.nextInt();
		if(age<=2) {
			System.out.println("Age group is toddler");
		}
		else if( age>2 && age<=10) {
			System.out.println("Age group is kid ");

	}
		else if( age>10 && age<=18) {
			System.out.println("Age group is children ");

	}
		else if( age>18 && age<=30) {
			System.out.println("Age group is young adult  ");

	}
		else if( age>30 && age<=45) {
			System.out.println("Age group is  adult  ");

	}
		else {
			System.out.println("Age group is old adult  ");
		}
			
		
}
}
