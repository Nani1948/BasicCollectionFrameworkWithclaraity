package AccessSpecifier1;

public class Access_Speciifer2 {

	public Access_Speciifer2(){
		System.out.println(" I am constructor");
	}
public	 Access_Speciifer2(int a,int b) {
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

	}

