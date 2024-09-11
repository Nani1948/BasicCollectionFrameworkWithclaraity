package inheritance12;
//Multiple Inheritance
class Wolf{
	static void bark() {
		System.out.println(" I am a static method");
	}
}

class Dog extends Wolf {
	void bark1() {
		System.out.println(" This is a non-static meoow method");	
	}
	
}
public class Cat extends Dog {
void meoow() {
		System.out.println(" This is a non static meoow method");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.meoow();	
	c.bark1();
	Wolf w=new Wolf();
	w.bark();
	}

}
