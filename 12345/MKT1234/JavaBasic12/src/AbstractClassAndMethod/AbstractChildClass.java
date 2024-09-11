package AbstractClassAndMethod;

abstract class AbstractClass11{
      static void awq1() {
    	 System.out.println("I am normal staic method"); 
      }
      abstract void add();
  	abstract void sub();
}	

class AbstractClass12 extends  AbstractClass11 {
void printTheNumber(){
	
}
void printTheAge(){
	
}
@Override
void add() {
	// TODO Auto-generated method stub
	
}
@Override
void sub() {
	// TODO Auto-generated method stub
	
}
	
}
abstract class AbstractClass13 extends AbstractClass12{
	// Abstract method
	abstract void add();
	abstract void sub();
	abstract void mult();
	// Concrete method
	 static void manish() {
		 System.out.println(" I am normal static method");
	 }
	
		
}
public class AbstractChildClass extends AbstractClass13  {

	public static void main(String[] args) {
		AbstractChildClass ab=new AbstractChildClass();
		ab.add();
// TODO Auto-generated method stub

	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mult() {
		// TODO Auto-generated method stub
		
	}

}
