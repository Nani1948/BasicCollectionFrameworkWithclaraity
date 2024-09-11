package Override;

public class Variables5 {
	// global variables
	int a=40;
	final int b=100;
	   
	
	void printTheNumber() {
		// final variable
		final int a =10;
		int b=50;
		if(a>b) {
			System.out.println("A is greater than B");
		}
		else {
			System.out.println("A is not greater than B");
		}
	}

	class Example2 extends OverridingExample1 {
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
