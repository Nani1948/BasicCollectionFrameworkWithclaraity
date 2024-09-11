package Inheritance;

 class DogParentClass {

	
	static void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
	void printTheNumber(int n) {
		if(n%2==0) {
			System.out.println(" I  am  a even number");
		}
		else {
			System.out.println(" I am  a odd number");
		}
	}
	
}
  class Wolf2 extends DogParentClass{
		
		static int addition(int a, int b) {
			
			
	   return(a*b);
		}
		

	public static void main(String[] args) {
       areaOfCircle();
       addition(20,20);
       Wolf2 w=new Wolf2();
       w.printTheNumber(9);
       CatChildClass c=new CatChildClass();
       c.multiplication(20,40);
       
	}

}
