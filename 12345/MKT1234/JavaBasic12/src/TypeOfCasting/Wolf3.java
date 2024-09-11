package TypeOfCasting;

class Cat2{
	void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
}
 class Dog2 extends Cat2{
	void printTheNumber(int n) {
		if(n%2==0) {
			System.out.println(" I  am  a even number");
		}
		else {
			System.out.println(" I am  a odd number");
		}


}
public class Wolf3 extends Dog2 {
	static void braking3() {
		System.out.println(" I am going to make all the sound of animals ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       // Upcasting
		Dog2 d2=new Wolf3();
		d2.printTheNumber(2008);
		d2.braking3();
		
		// Subcasting
		Wolf3 w=(Wolf3)d2;
		d2.braking3();
		d2.areaOfCircle();
	}

}
}
