package Override;
import java.util.Scanner;
class Method2{
 void sub() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values of a is:");
	int a=scan.nextInt();
System.out.println("Enter the values of b is:");
int b=scan.nextInt();
System.out.println("The sum of a and b is:"+(a+b));
}
	
}



public class MethodOverridingWithNonStaticMethodOnly  extends Method2{
	void sub() {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=s2.nextInt();
	System.out.println("Enter the values of b is:");
	int b=s2.nextInt();
	System.out.println("The mul of a and b is:"+(a-b));
	
	}
	public static void main(String[] args) {
		// create a object of the child class to call non-static method 
		MethodOverridingWithNonStaticMethodOnly  mo=new MethodOverridingWithNonStaticMethodOnly ();
		mo.sub();
	}

}
