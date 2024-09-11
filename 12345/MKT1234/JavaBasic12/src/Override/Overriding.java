package Override;

import java.util.Scanner;

class Method{
	void add() {
				System.out.println("This is method class");
	}
}
public class Overriding extends Method {
         void add() {
        	 super.add();
        	System.out.println("This is sub class");
        	// To 
        	//super.add();
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scanner scan =new Scanner(System.in);
	
	// Create an object of the child class
	
	 Overriding    o1=new  Overriding();
	 o1.add();
	}

}
