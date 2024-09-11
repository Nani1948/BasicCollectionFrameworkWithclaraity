package TypeOfCasting;
import java.util.Scanner;
class Cat5{
	
	void printTheMessages(int n) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of n is:");
	 n=scan.nextInt();
	 if (n > 10) {
		 System.out.println(" I am greater than 10");
	 }
	 else if (n >100) {
		 System.out.println("I am greater than 100");
	 }
	 else {
		 System.out.println(" I am not greather than 100 and 10");
		 
	 }
	}
	
}
class Dog5 extends Cat5{
	void printTheString() {
		String s1="Welcome";
		String s2="World";
		System.out.println(s1.concat(s2));
	}
}
public class Wolf5  extends Dog5{
  static    void printTheTypeOfCasting() {
	//Convert int to double-Widening
			double a=100;
			System.out.println(a);
			// Convert double to int-Narrowing
			int b=(int)100.00;
					System.out.println(b);
  }
	public static void main(String[] args) {	
// upcasting
	Dog5 d5=new Wolf5();
	d5.printTheMessages(200);
	d5.printTheString();
	
	//d5.printTheTypeOfCasting();	 it can access all the properites of all parent but not the child class.
	//DownCasting
	Wolf5 s=(Wolf5)d5;
	s.printTheMessages(200);
	s.printTheString();
	s.printTheTypeOfCasting();	
	}

}
