package Inheritaance;

class Parent{
	int a;
	void display() {
		System.out.println(a);
	}
}
class Child1 extends Parent{
	int b;
	void show() {
		System.out.println(b);
	}
}
class Child2 extends Parent{
	int c;
	void print() {
		System.out.println(c);
	}
	
}

public class HierachyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Child2 c2= new Child2();
		 c2.a=10;
		 c2.c=40;
		 c2.display();		
		 c2.print();
		
		 
		 

	}

}
