package Inheritaance;

public class Animal {
	final String color="White";
	void eating() {
		System.out.println("Eating ...............");
	}
	 Animal(){
		 System.out.println("Animal is created..");
	 }

}
class Dog extends Animal{
	
	String color="Black";
	Dog()
	{   super();
		System.out.println("Dog is crate");
	}
	void displaycolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
		void eating() {
			System.out.println("Eating ..............is bread.");
			super.eating();

	}
}

