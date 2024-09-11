package AccessSpecifier1;

public class Access_Specifier {
// default access/Package  specifier for this method
	void braking() {
		System.out.println(" I am not braking Elephant");
	}
	//private access specifier for this method
   private void braking1() {
		System.out.println(" I am not braking Elephant1");
	}
   // public access specifier for this method
	public void braking2() {
		System.out.println(" I am not braking Elephant2");
	}
	// protected access specifier for this method
	protected void braking3() {
		System.out.println(" I am not braking Elephant3");
	}
	
	
	public static void main(String[] args) {
     // calling a non-static method.
		Access_Specifier ac=new Access_Specifier();
		ac.braking();
		ac.braking1();
		ac.braking2();
		ac.braking3();

	}

}
