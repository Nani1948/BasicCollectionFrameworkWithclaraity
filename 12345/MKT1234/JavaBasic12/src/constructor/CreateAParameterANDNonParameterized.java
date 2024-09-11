package constructor;

public class CreateAParameterANDNonParameterized {
public CreateAParameterANDNonParameterized (int a,int b) {
		
		System.out.println(a+b);
	}
public CreateAParameterANDNonParameterized () {
		
		System.out.println(" I am a constructor");
	}
	static void printTheNumber() {
	System.out.println("I am a static method");
	}
	void printTheEvenOrOdd() {
	System.out.println("I am non-static method");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAParameterANDNonParameterized c1=new CreateAParameterANDNonParameterized ();
		CreateAParameterANDNonParameterized c2=new CreateAParameterANDNonParameterized (10,20);
		c2.printTheEvenOrOdd();
		printTheNumber();
		
		
	}

}
