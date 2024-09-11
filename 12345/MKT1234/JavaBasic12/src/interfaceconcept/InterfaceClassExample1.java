package interfaceconcept;
interface demo{
	// interface is used to keep the abstract methods unlike your abstract class in which there was a concrete methods
	// abstract method
	void add();
	void sub(); // or abstract void sub();
}



// To override the abstract method inside the child class ; you need relationship b/w them using the keyword called"implements".
// You can't have abstract method inside the child class which is having main method.
//But you can have unimplement methods(overridenmethods) outside  the main method

public class InterfaceClassExample1 implements demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
