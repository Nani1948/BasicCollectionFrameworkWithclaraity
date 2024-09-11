package AccessSpecifier1;
import java.util.Scanner;
public class AccessSpeciiferWithoutInheritanceClass {
	public void man1() {
		System.out.println("Man1");
	}  
	private static void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
	protected void multiplication() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println("Enter the value of a :");
		int a=scan.nextInt();
		System.out.println("Enter the value of b :");
		int b=scan.nextInt();
		System.out.println("The mulitplication of a and b is:"+(a*b));
	}
	void printTheNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println(" I  am  a even number");
		}
		else {
			System.out.println(" I am  a odd number");
		}

	}
}
