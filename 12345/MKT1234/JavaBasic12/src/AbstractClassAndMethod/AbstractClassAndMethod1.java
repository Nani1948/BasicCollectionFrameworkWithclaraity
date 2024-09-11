package AbstractClassAndMethod;
abstract class Parent1{
	
	abstract void add();// showing purpose
}





public class AbstractClassAndMethod1  extends Parent1
{
	
	// You can write yourconcerte  method either below PSVM or after PSVM
	
	void add() { // the actual use
    	System.out.println("Overriding method");   
       }

	public static void main(String[] args) {
	
	
	
		AbstractClassAndMethod1  a1=new AbstractClassAndMethod1();
		a1.add();
	
	
	}
      
	
	

	

}
