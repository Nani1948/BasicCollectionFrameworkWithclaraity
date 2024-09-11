package program;

import java.util.Scanner;

public class ScannerEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        //Creating Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        // reading the value from the user
        num=sc.nextInt();
        if(num%2==0) {
        	System.out.println("The number is even:"+num);
        }
        else {
        	System.out.println("The number is odd:" +num);
        }
       
	}

}
