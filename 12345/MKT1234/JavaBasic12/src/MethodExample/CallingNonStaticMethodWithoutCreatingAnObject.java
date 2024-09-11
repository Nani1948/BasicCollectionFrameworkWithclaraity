package MethodExample;
public class CallingNonStaticMethodWithoutCreatingAnObject {
	 static void addition() {
		 int a=10;
		 int b=20;
	 System.out.println(a+b);
	 }
	 static void subtraction() {
		 int a=10;
		 int b=20;
	 System.out.println(a+b);
	 }
	 static void multiplication1(){
		 int a=10;
		 int b=20;
		 System.out.println(a*b);
	 }
	 //Non-static method
	void division() { 
	 int a=10;
	 int b=20;
	System.out.println(a/b);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 addition(); //Static MEthod
			 subtraction();
			 multiplication1();
			 division();//Non-static method
		 }

	}


