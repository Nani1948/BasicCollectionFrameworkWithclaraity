package Inheritance;
class Animal{
	void eating() {
		System.out.println("Animal like eating both vegetarians and non-vegetarians");	
	}
	static void barking(String s) {
		System.out.println(s);
	}
}

class Elephant extends Animal{
	public static void eating1() {
		System.out.println(" I am vegetarians");
	}
	
	void braking1() {
		System.out.println(" I am not braking Elephant");
	}
}

class Tiger extends Elephant {
	public static void eating2() {
		System.out.println(" I am non-vegetarians");
	}
	
	void braking2() {
		System.out.println(" I am going to roar ");
	}
}	


public class HybridInheritance extends Tiger{
	public static void eating3() {
		System.out.println(" I am eating all kinds of veg and non-veg");
	}
	
	void braking3() {
		System.out.println(" I am going to make all the sound of animals ");
	}
	public static void main(String[] args) {
		//Tiger
		eating2();
		//Hybrid Inheritance
		eating3();
	 HybridInheritance h=new HybridInheritance();
	 h.braking2();
	 h.braking3();
	 Elephant e=new Elephant();
	 e.braking1();
	 eating1();
	 e.barking("I am string");
	 e.eating();
	 HybridChildClass hc=new HybridChildClass();
	 hc.walking();
	
	 
	 
	 
     
		
		
	}

}
