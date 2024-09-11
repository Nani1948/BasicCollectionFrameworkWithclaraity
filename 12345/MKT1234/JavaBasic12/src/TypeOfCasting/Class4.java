package TypeOfCasting;
import java.util.Scanner;
class Class4 {
	void printTheMessages() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of n is:");
	 int n=scan.nextInt();
	 if (n > 10) {
		 System.out.println(" I am greater than 10");
	 }
	 else if (n >100) {
		 System.out.println("I am greater than 100");
	 }
	 else {
		 System.out.println(" I am not greather than 100 and 10");
		 
	 }
	}
	static public void test1() {
		System.out.println("This is second method");
	}
}
	class Class3 extends Class4{
		void printTheNumber(int n) {
			if(n%2==0) {
				System.out.println(" I  am  a even number");
			}
			else {
				System.out.println(" I am  a odd number");
			}
		}
			static public void test2() {
				System.out.println("This is second method1");
			}
		
	}
class Class2 extends Class3{
	 void printTheLeapYear(int n) {
		  if(n%4==0) {
			 System.out.println("This is a leap year"); 
		  }
		  else {
			  
			  System.out.println("This is not leap year"); 
		  }
	 }
		  static public void test3() {
				System.out.println("This is second method2");
			}
		
	}
class Class1 extends Class2{
	static void addition(int a, int b) {
	     a=10;
	     b=20;
	    	System.out.println(a+b);
	    }
	    static void subtraction() {//The method braking3 cannot be declared static; static methods can only be declared in a static or top level type
	    	int a=10;
	    	int b=20;
	    	System.out.println(a-b);
	    }
	    

	public static void main(String[] args) {
              Class3 c3=new Class2();
              //2
              c3.printTheNumber(2000);            
              test3();             
              // 3
            c3.printTheNumber(9);
            test2();
              //4
            c3.printTheMessages();
            test1();
            //1
            subtraction();// static method of class 1 extends class 2, it is not given any error.
         addition(10,20);//method is undefined class 3
              
         
         
         // down
            Class2 c2=(Class2)c3;
            //4
            c2.printTheMessages();
            c2.test1();
            //3
            c2.printTheNumber(9);
            test2();
            //2
            c2.printTheLeapYear(2990);
            test3();
            //1
            subtraction();//
            addition(10,20);// this method is undefined class 2
	}

}

