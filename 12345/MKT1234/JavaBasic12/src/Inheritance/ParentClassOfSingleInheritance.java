package Inheritance;

public class ParentClassOfSingleInheritance {

	
	//1.Create a non-static method for leap year
	public static void areaOfCircumference() {
		double radius=2.3;
		double c=2*Math.PI*radius;
		System.out.println("The Circumference Of Circle is:"+ c);
		
	}
	
	public void areaOfDiameter(double radius) {
		double d=2*radius;
		System.out.println("The Diameter of Circle is:"+ d);
	}

	void areaOfTriangle() {
		double base=2.4;
		double height=2.5;
		double t=(base*height)/2;
		System.out.println("Area Of Triangle is:"+ t);
	}
}

