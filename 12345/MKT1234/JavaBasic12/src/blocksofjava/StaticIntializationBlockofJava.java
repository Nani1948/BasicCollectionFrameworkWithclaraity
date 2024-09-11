package blocksofjava;

public class StaticIntializationBlockofJava {
// static intialization  block
	static {
		System.out.println("I am static intialization block");
	}
	static {
		System.out.println("I am static intialization block1");
	}
	static {
		System.out.println("I am static intialization block2");
	}
	// it will print any nothing until you have created of an object
	{
		System.out.println("I am Instance intialization block");
	}
	 StaticIntializationBlockofJava(){
	System.out.println("I am constructor");
}
	public static void main(String[] args) {
	 System.out.println("I am main method");
	 StaticIntializationBlockofJava s1=new StaticIntializationBlockofJava();
	}

}
