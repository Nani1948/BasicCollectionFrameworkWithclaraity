package TypeOfCasting;

import java.util.Scanner;

class Cat6{
	void printTheUpperCase() {
		String s7="i am greater than others";
		System.out.println(s7.toUpperCase());
		}
	}
	

class Dog7 extends Cat6{
	static void sub() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a is:");
		int a=scan.nextInt();
	System.out.println("Enter the values of b is:");
	int b=scan.nextInt();
	System.out.println("The sum of a and b is:"+(a-b));
	}
	
}
class Wolf7 extends Dog7{
	void printTheString() {
		String s1="Welcome";
		String s2=" World";
		System.out.println(s1.concat(s2));
	}
}
public class Rat1 extends Wolf7 {
	void printTheNumber(int n) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values of a is:");
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
	public static void main(String[] args) {
		// upcasting
		Dog7 d7=new Wolf7();
		d7.sub();
		d7.printTheUpperCase();
		//d7. printTheString();it can access above the parent class(dog1,cat1) but not dog1 and rat1
		//d7.printTheNumber(5); but it can access all the properties of the parent class above parent class
// down casting
		Wolf7 w8=(Wolf7)d7;
		w8.sub();
		w8.printTheUpperCase();
		w8.printTheString();
		//w8.printTheNumber(200);it can't access the below level of childclass but it can access all the properites above the topmost child class.
	}

}
