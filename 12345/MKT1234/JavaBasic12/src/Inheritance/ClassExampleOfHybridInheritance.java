package Inheritance;
class One{
	static void addition(int a, int b) {
		System.out.println(a+b);
	}
}
class Two extends One{
	void subtraction(int a, int b) {
		System.out.println(a-b);	
	}
}
class Three extends Two{
	void subtraction2(int a, int b) {
		System.out.println(a-b);	
	}
}

public class ClassExampleOfHybridInheritance extends Two {
              void printHello() {
            	  System.out.print("I am hello");
              }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling a method of One
         addition(10,20);
         //Creating a object of an child class for accesing non-static method both parent and child.
         ClassExampleOfHybridInheritance ct =new ClassExampleOfHybridInheritance();
         ct.subtraction(20, 5);
         ct.printHello();
         
         // There is no relation b/w ClassExampleOfHybridInheritance  and  Three . So we need to create an object.
         Three t=new  Three();
         t.subtraction2(10,20);
         addition(10,20);
         
	}

}
