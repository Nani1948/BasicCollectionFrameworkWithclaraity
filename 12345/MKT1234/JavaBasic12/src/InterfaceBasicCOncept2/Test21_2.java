package InterfaceBasicCOncept2;
// interface

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
//to inherit a normal class to abstract class using extends 
public class Test21_2  extends Test2
{
	public static void main(String []args) {
		Test21_2 t=new Test21_2();
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
	
	void add2() {
	System.out.println(" I am addition2 ");
		
	}

	@Override
	void sub2() {
		// TODO Auto-generated method stub
		System.out.println(" I am subtraction2 ");
	}

	@Override
	void add1() {
		// TODO Auto-generated method stub
		System.out.println(" I am addition1 ");	
	}

	@Override
	void sub1() {
		System.out.println(" I am subtraction1 ");// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(" I am addition");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(" I am subtraction ");
	}

	@Override
	public void sub3() {
		// TODO Auto-generated method stub
		System.out.println(" I am subtraction3 ");
	}

	@Override
	public void add3() {
		// TODO Auto-generated method stub
		System.out.println(" I am addition3 ");
	}

}
