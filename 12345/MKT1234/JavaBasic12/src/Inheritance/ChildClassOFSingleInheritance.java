package Inheritance;

public class ChildClassOFSingleInheritance extends ParentClassOfSingleInheritance {
	//Create a non-static method
     void addition(int a , int b) {
    	 System.out.println("The sum of two number is:" +(a+b));
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Calling a static method
		areaOfCircumference();
		//2.Calling a non-static method from parent class
		// Create an object of the child class.Where the child class will acquire all the properities and method from the parent class.
		ChildClassOFSingleInheritance co=new ChildClassOFSingleInheritance();
		co. areaOfDiameter(2.3);
		co.areaOfTriangle();
		co.addition(10,20);
	
	}

}
