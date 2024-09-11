package TypeOfCasting;
 class Mp{
	
	
	static void bhopal() {
		System.out.println(" I am bhopal");
	}
	
	
	
}



public class Up extends Mp{
	static void agra() {
		System.out.println(" I am agra");
	}
	public static void main(String[] args) {
	// Up casting- Converting subclass object to the super class type.
		//subclass object on the right side
		//super class type on the left side
		Mp m1=new Up();
		m1.bhopal();
	
// Down casting -Converting super class object into subclass type.
		// super class object on the right side
		//Sub class type on the left side.
	Up u=(Up)m1;
	u.bhopal();
	u.agra();
	
	}

}
