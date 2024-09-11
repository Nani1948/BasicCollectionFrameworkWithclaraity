package Override;

import java.util.Scanner;
 class WithoutSuperKeyWord{
static void sub() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values of a is:");
	int a=scan.nextInt();
System.out.println("Enter the values of b is:");
int b=scan.nextInt();
System.out.println("The sum of a and b is:"+(a+b));
}
	
}
public class MethodOverridenWithStaticMethodWithOutSuperKeyword extends WithoutSuperKeyWord{
	final static void sub() {
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=s4.nextInt();
	System.out.println("Enter the values of b is:");
	int b=s4.nextInt();
	System.out.println("The mult of a and b is:"+(a*b));
	
	}
		
	public static void main(String[] args) {
		// static method can be inherit but can't be overriden 
         sub();
	}

}
