package AbstractClassAndMethod;

abstract class AbstacClass{
	//Concerte method
//static	void add() {
		
	//}
	abstract void add();// showing purposes
}

public class AbstractClassExample1  extends AbstacClass{
	public static void main(String[] args) {
	// Create an object of the child class of abstractClassExample1
		AbstractClassExample1 ab=new AbstractClassExample1();
		ab.add();

	}

	@Override
	void add() {
		// the actual use 
		System.out.println("I am overridden method");
	}

}
