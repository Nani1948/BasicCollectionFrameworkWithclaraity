package inheritance12;
class One1{
	public void test() {
		System.out.println("This is one method");
	}
	
}
class Two1 extends One1{
	static public void test1() {
		System.out.println("This is second method");
	}
	
}

class Three1 extends  Two1{
	public void test4() {
		System.out.println("This is fourth method");
	}
	
}

public class HybridInheritanceConcept2  extends Two1{
	static public void test2() {
		System.out.println("This is third method");
	}
	
	public static void main(String[] args) {
		HybridInheritanceConcept2 c=new HybridInheritanceConcept2();
		test1();
		test2();
		c.test();
       //c.test4();// it is give compliation issue , there is no relation HybridInhetiacne and Three.
		
		// So we create relation b/w this by creating an object of three class.
		// You can access all the properities of one,two, three.
		Three1 t=new Three1();
		t.test();
		t.test4();
		t.test1();
		//t.test2(); it is give compilaition issue becuase child class can't access their own properties
		
	}

}
