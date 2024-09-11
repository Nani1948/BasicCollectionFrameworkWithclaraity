package interface1;

interface Demo4{
void sub3();
void add3();
}
//To inherit a interface to interface using  extends.
interface TestJava extends Demo4{
	// abstract method
	abstract void add();
	abstract void sub();
}
// To inherit abstract class to interface using implements
abstract class Test1 implements TestJava{
	// abstract method
	abstract void add1();
	abstract void sub1();
}
// to inherit abstract class to abstract class Test1 using extends 
abstract class Test2 extends Test1{
	// abstract method
	abstract void add2();
	abstract void sub2();
}

public class InterfaceAssignment extends Test2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceAssignment	t=new InterfaceAssignment();
		t.add();
		t.add1();
		t.add2();
		t.add3();
		t.sub();
		t.sub1();
		t.sub2();
		t.sub3();
		
	}

	@Override
	public void add() {
		System.out.println(" I am addition");
		
	}

	@Override
	public void sub() {
		System.out.println(" I am subtraction ");
		
	}

	@Override
	public void sub3() {
		System.out.println(" I am subtraction3 ");
		
	}

	@Override
	public void add3() {
		System.out.println(" I am addition3 ");
		
	}

	@Override
	void add2() {
		System.out.println(" I am addition2 ");	
		
	}

	@Override
	void sub2() {
		System.out.println(" I am subtraction2 ");
		
	}

	@Override
	void add1() {
		System.out.println(" I am addition1 ");
		
	}

	@Override
	void sub1() {
		System.out.println(" I am subtraction1 ");
	}

}
