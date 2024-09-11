package Teacher;

public class Anoop {
	public void man1() {
		System.out.println("Man1");
	}  
	private static void areaOfCircle() {
		double radius=3.14;
		double circle=Math.PI*radius*radius;
		System.out.println(circle);
	}
	protected void multiplication(int a,int b) {
		System.out.println(a*b);
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