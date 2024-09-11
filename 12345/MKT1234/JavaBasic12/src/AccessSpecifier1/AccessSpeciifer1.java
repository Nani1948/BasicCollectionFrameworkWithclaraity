package AccessSpecifier1;
public class AccessSpeciifer1 {
	
	public AccessSpeciifer1(){
		System.out.println(" I am constructor");
	}
public	 AccessSpeciifer1(int a,int b) {
	System.out.println(a/b);	
	}
	
	
	private static void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
	protected void multiplication(int a , int b) {
		System.out.println(a+b);
	}
	void printTheNumber(int n) {
		if(n%2==0) {
			System.out.println(" I  am  a even number");
		}
		else {
			System.out.println(" I am  a odd number");
		}
	}
	
	static int addition(int a, int b) {
		
		
		   return(a*b);
			}
			

	public static void main(String[] args) {
	// Create an object  of the class  to call  the constructor	
		 AccessSpeciifer1 ac1=new AccessSpeciifer1(20,10);
		 // call to non-static method
		 AccessSpeciifer1 ac2=new AccessSpeciifer1();
		 ac2.multiplication(10,20);
		 ac2.printTheNumber(2009);
		// call the Static Method
		 
		 areaOfCircle();
		 addition(10,20);
	}

}
