package constructor;

public class CreatingStaticNonStaticConstructorInClass {
	// Creating a constructor
	CreatingStaticNonStaticConstructorInClass(){
		System.out.println("I am constructor");
	}
	//Creating a static method
	static void addition() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
	static void subtraction(int a, int b) {
		System.out.println(a-b);
	}
    void mutliplication() {
    	int a=10;
    	int b=20;
    	System.out.println(a*b);
    }
    void division(long l, int i) {
    	System.out.println(l/i);
    }
	public static void main(String[] args) {
		//Calling a static method
		addition();
		subtraction(40,20);
		//Calling  non-static method
		//Creating an object for non-static method and constructor.
		//Constructor will be invoked at that time of object creation.
		CreatingStaticNonStaticConstructorInClass css1=new CreatingStaticNonStaticConstructorInClass();
		css1.mutliplication();
		css1.division(100000000,20000);

	}

}
