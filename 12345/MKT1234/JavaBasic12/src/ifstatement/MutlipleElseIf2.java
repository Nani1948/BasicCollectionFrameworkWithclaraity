package ifstatement;

public class MutlipleElseIf2 {

	public static void main(String[] args) {
		int a =100;
		int b=200;
		int c=200;
		int d=400;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>c && c>d) {
			System.out.println("This is a condtion are true");
		}
		else if(a!=b && b!=c) {
			System.out.println("This a condtion true2");
			
		}
		else if(a>=b || b<=c) {
			System.out.println("This a condtion true3");
			
		}
		else if(a>=c || b<=d) {
			System.out.println("This a condtion true4");
			
		}
		else {
			System.out.println("a is not greater than b");
		}
		

	}

}
