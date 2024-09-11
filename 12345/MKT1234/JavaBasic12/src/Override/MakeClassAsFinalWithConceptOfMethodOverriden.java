package Override;
import java.util.Scanner;
final class SuperClass2{
	void printTheMessages(int n) {
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
	void printTheString() {
		String s1="Welcome";
		String s2="World";
		System.out.println(s1.concat(s1));
	}
}
//class as final,it can't be inherit aclass from another class.
public class MakeClassAsFinalWithConceptOfMethodOverriden extends SuperClass2{
	void printTheString() {
		 String s3=" My World is better than others";
		 if(s3.contains("better")) {
			 System.out.println("true");	 
			 
		 }
		 else {
			 System.out.println("flase");
		 }
		 super.printTheString();
	}
	void printTheMessages(int n) {
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
	 super.printTheMessages(200);
	}	
	public static void main(String[] args) {
		MakeClassAsFinalWithConceptOfMethodOverriden m1= new MakeClassAsFinalWithConceptOfMethodOverriden();
		m1.printTheMessages(200);
		m1.printTheString();Done
	}
}
