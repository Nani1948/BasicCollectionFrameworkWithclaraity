package AbstractClassAssignement;

import java.util.Scanner;

abstract class ContainsAbstractmethods{
	abstract void printThenumber(int a,int b);
	
	abstract void printTheString();
}
abstract class Dog8 extends ContainsAbstractmethods{

	
	
}
abstract class Wolf9 extends Dog8{
	static void addition() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of a :");
		 int a=scan.nextInt();
		 System.out.println("Enter the value of b:");
		 int b=scan.nextInt();
		System.out.println("The Sum of a and b :"+(a+b));
		
	}
	
}
public class AbstractClassWithOverridenMethod extends  Wolf9 {
	static void salaryMethod() {
	int salary=1000000;
     if(salary>10000) {
  	   System.out.println("There is no hike1");
     }
     
     if(salary>10000 && salary<20000) {
  	   System.out.println("There is no hike2"); 
     }
     
     if(salary!=20000 && salary<=30000) {
  	   System.out.println("There is no hike3"); 
     }
     if(salary>=30000 && salary<=50000) {
  	   System.out.println("There is a  hike1"); 
     }
     
     if(salary>=60000 || salary<=100000) {
  	   System.out.println("There is a  hike2"); 
     } 
	}
	public static void main(String[] args) {

		AbstractClassWithOverridenMethod ab=new AbstractClassWithOverridenMethod();
	   ab.salaryMethod();
	ab.addition();
	ab.printThenumber(20,300);
	ab.printTheString();
	
	
	
	
	
	}
	@Override
	void printThenumber(int a, int b) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		System.out.println("Enter the value of a :");
		  a=scan.nextInt();
		 System.out.println("Enter the value of b:");
		  b=scan.nextInt();
     if(a!=b) {
    	 System.out.println("If is the  output");
     }
     else {
    	 System.out.println(" else is the output");
     }
	}
	

	@Override
	void printTheString() {
    Scanner s45= new Scanner(System.in);
    System.out.println("Enter the string s4:");
    String s4=s45.next();
	System.out.println(s4);
	System.out.println("Enter the string s5:");
	String s5=s45.next();
	System.out.println(s5);
	System.out.println(s4.concat(s5));
	}

}
