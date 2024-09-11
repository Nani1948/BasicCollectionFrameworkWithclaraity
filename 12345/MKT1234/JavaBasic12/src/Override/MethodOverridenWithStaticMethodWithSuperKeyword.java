package Override;

import java.util.Scanner;

class Static2{
	static void sub() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=scan.nextInt();
	System.out.println("Enter the values of b is:");
	int b=scan.nextInt();
	System.out.println("The sum of a and b is:"+(a+b));
	}
		
	}



public class MethodOverridenWithStaticMethodWithSuperKeyword  extends Static2 {

static 	 void sub() {
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=s4.nextInt();
	System.out.println("Enter the values of b is:");
	int b=s4.nextInt();
	System.out.println("The mult of a and b is:"+(a*b));
	super.sub();
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sub();
	}

}
