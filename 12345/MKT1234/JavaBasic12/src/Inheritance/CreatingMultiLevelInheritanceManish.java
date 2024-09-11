package Inheritance;
class Nandhini
{
	static void addition(int a, int b) 
	{
		System.out.println("The Sum Of Two Numbers:"+(a+b));
	}
	
}
 class Govind extends Nandhini
{
	void subtraction(double d, float f) 
	{
		System.out.println("The Subtraction of Two Number is:"+(d-f));
	}
}
 class Asha extends Govind{
	 static void mutliplication() {
		 int a =10;
		 int b=20;
		 System.out.println("The Multiplication of Two Number is:"+(a*b));
	 }
 }
public class CreatingMultiLevelInheritanceManish extends Asha {
       void division() {
    	   int a=20;
    	   int b=4;
    	   System.out.println("The Division of Two Number is:"+(a/b));
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingMultiLevelInheritanceManish m1=new CreatingMultiLevelInheritanceManish();
		m1.division();
		mutliplication();
		//Asha a=new Asha();-This is bad programming ( child class can acquire all the properties of all the parent classes level.
		// So need to create Asha object in the Child class
		m1.subtraction(20.10,10.11f);
		addition(10,20);
		
		
	}

}
