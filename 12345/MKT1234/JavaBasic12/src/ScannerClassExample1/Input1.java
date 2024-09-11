package ScannerClassExample1;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
	
		
		//Scanner- it is used for entering the value for manually
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		 int b=s1.nextInt();
		int c=a+b;
        System.out.println("The sum of a and b :"+c);
        System.out.println("Enter the value of d:");
        double d=s1.nextDouble();
        System.out.println("Enter the value of e:");
	    float e=s1.nextFloat();
	   
        double f=d-e;
	     System.out.println("The diff d and e :"+f);
	     System.out.println("Enter the value of g:");
	     long g=s1.nextLong();
	     System.out.println("Enter the value of h:");
	     short h=s1.nextShort();
	     
	     long i=g*h;
	     System.out.println("The multiply of g and h:"+i);
	     System.out.println("Enter the value of j:");
	     byte j=s1.nextByte();
	     System.out.println("Enter the value of k");
	     short k=s1.nextShort();
	      
	     int l=j/k;
	     System.out.println("The division of j and k "+l);
	     System.out.println("Enter the string s");
	     String s=s1.next();
	     System.out.println("Enter the string t");
	     String t=s1.next();
	     System.out.println(s.concat(t));
	}

}
