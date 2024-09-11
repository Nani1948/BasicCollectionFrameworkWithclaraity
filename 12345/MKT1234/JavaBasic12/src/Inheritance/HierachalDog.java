package Inheritance;

public class HierachalDog {
	
 void subtraction(){

		int a =10; 
		int b=20;
		System.out.println(a-b);
		}
		

static void addition(){

	int a =10; 
	int b=20;
	System.out.println(a-b);
	}
	}

class Cat extends HierachalDog{
		 void multiplication(){

			 int a =10; 
			 int b=20;
			 System.out.println(a+b);
			 }
			 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    addition();
    Cat c=new Cat();
    c.subtraction();
    c.multiplication();
    HerarchalWolf h=new HerarchalWolf();
    h.division();
	}

}
