package AbstractClassAndMethod;

import java.util.Scanner;

class T{
	double principal=1000;
	int time=4;
	double rate=0.04;
	void calculateTheInterest() {
	double si=principal*time*rate;
	System.out.println(si);
	}
}
class M extends T{
	static void areaOfSphere() {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the radius:");
	double radius=sc.nextDouble();
	double areaOfSphere1=4*Math.PI*radius*radius;
	System.out.println("Area of Sphere:" +areaOfSphere1);
	}
	
}
class O extends M{
	static void calculateTheCI() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Calculate the Compound Interest:");
		System.out.println("Enter the principal amount:");
		double principal=s1.nextDouble();
		System.out.println("Enter the rate is:");
		double rate =s1.nextDouble();
		System.out.println("Enter the n is:");
		double n=s1.nextDouble();
		System.out.println("Enter the time is:");
		int time =s1.nextInt();
		int t=(int)time;
		double ci=principal*Math.pow(1+(rate/n),n*time);
		System.out.println(ci);
		
	}
}
public class S2 extends O {
 void printTheAge() {
	 Scanner s3=new Scanner(System.in);
	 System.out.println("Enter the age is:");
	 int age=s3.nextInt();
	 if(age >19) {
		 System.out.println(" I AM YOUTH");
	 }
	 else {
		 System.out.println("I AM NOT Youth");
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Upcasting
		T t1=new O();
		t1.calculateTheInterest();
		//t1.areaOfSphere();- child class can access all the propeties of the parent but not child class
		
		
		//Up casting
		O o2=new S2();
		//Down Casting
		S2 s2=(S2)o2;
		//O o=(O)t1;
	
		s2.printTheAge();
		s2.calculateTheInterest();
		calculateTheCI();
	areaOfSphere();
	}

}
