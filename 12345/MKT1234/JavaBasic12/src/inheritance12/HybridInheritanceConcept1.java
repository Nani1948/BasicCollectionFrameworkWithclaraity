package inheritance12;
class One{
	public void test() {
		System.out.println("This is one method");
	}
	
}
class Two extends One{
	static public void test1() {
		System.out.println("This is second method");
	}
	
}

public class HybridInheritanceConcept1 extends Two {
	static public void test2() {
		System.out.println("This is third method");
	}
	
	public static void main(String[] args) {
		HybridInheritanceConcept1 c=new HybridInheritanceConcept1();
		test1();
		test2();
		c.test();
		//c.test4 it is give compile time issue. there isno relation b/w HybridInheritanceConcept1 and Three.
		// So we create relation b/w this by creating an object of three class.
	Three th=new Three();
	th.test4();

	}

}



class Three{
	public void test4() {
		System.out.println("This is fourth method");
	}
	
}