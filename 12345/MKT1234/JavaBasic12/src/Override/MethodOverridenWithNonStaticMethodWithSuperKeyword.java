package Override;
import java.util.Scanner;
class SuperClass{
	  void sub() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=scn.nextInt();
	System.out.println("Enter the values of b is:");
	int b=scn.nextInt();
	System.out.println("The sum of a and b is:" +(a+b));
	}
		
	}
class MethodOverridenWithNonStaticMethodWithSuperKeyword extends SuperClass{
	void sub() {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=sn.nextInt();
	System.out.println("Enter the values of b is:");
	int b=sn.nextInt();
	System.out.println("The mul of a and b is:"+(a*b));
	// To overidden -get the output of the both parent and child class using this "Super Keyword".
	super.sub();
	}
	
	public static void main(String[] args) {
		// create a object of the child class to call non-static method 
		MethodOverridenWithNonStaticMethodWithSuperKeyword mo=new MethodOverridenWithNonStaticMethodWithSuperKeyword();
		mo.sub();
	}

}
