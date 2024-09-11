package interface1;
import java.util.Scanner;
class T
{
	static void addition(int a, int b) 
	{
		System.out.println("The Sum Of Two Numbers:"+(a+b));
	}
}
class M extends T{
	void printTheNumber(int n) {
		if(n%2==0) {
			System.out.println(" I  am  a even number");
		}
		else {
			System.out.println(" I am  a odd number");
		}
	}
	
}

class O extends M{
	static void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
}

public class S1 extends O{
	void areaOfTriangle() {
		double base=2.4;
		double height=2.5;
		double t=(base*height)/2;
		System.out.println("Area Of Triangle is:"+ t);
	}
	public static void main(String[]args) {
		T t1=new O();
		//t1.printTheNumber(2000);
		t1.addition(10,20);
		
		//Upcasting
		O o1=new S1();
		S1 s1=(S1)o1;
		s1.areaOfTriangle();
		s1.printTheNumber(2000);
		s1.areaOfCircle();
		s1.addition(10, 20);
		
		
		
	}
}